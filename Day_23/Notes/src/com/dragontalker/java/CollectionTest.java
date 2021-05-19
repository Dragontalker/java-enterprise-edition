package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection接口中声明的方法的测试
 *
 * 向Collection接口的实现类的对象中添加数据obj时, 要求obj的所在类要重写equals()方法
 */

public class CollectionTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry", 20));
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);

        //Person p = new Person("Jerry", 20);
        //collection.add(p);


        //contains(Object obj): 判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()
        boolean contains = collection.contains(123);
        System.out.println(contains);
        System.out.println(collection.contains(new String("Tom"))); //true
        //System.out.println(collection.contains(p)); //true
        System.out.println(collection.contains(new Person("Jerry", 20))); //false 没有重写equals()
    }
}

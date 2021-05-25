package com.dragontalker.java2;

import com.dragontalker.java1.Person;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 调用运行时类中指定的结构: 属性、方法、构造器
 */

public class ReflectionTest {

    /*

     */
    @Test
    public void testFiled() throws Exception{
        Class<Person> clazz = Person.class;

        //创建运行时类的对象
        Person p = clazz.newInstance();

        //获取指定的属性: 要求运行时类中属性声明为public
        //通常不采用此方法
        Field id = clazz.getField("id");

        /*
        设置当前属性的值

        set(): 参数1: 指明设置哪个对象的属性
               参数2: 将此属性值设置为多少
         */

        id.set(p, 1001);

        /*
        获取当前属性的值

        get(): 参数1: 获取哪个对象的当前属性值
         */
        int pId = (int) id.get(p);
        System.out.println(pId);
    }

    /*
    如何操作运行时类中指定的属性 ---> 需要掌握
     */
    @Test
    public void testFiled1() throws Exception{
        Class<Person> clazz = Person.class;
        //创建运行时类的对象
        Person p = clazz.newInstance();

        //1. getDeclaredField(String fieldName): 获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");
        //2. 保证当前属性是可访问的
        name.setAccessible(true);
        //3. 获取、设置指定对象的此属性值
        name.set(p, "Tom");
        System.out.println(name.get(p));
    }
}

package com.dragontalker.java;

import org.junit.Test;

import java.util.*;

/**
 * 泛型的使用
 * 1. jdk5.0新增的特性
 *
 * 2. 在集合中使用泛型:
 *  - 总结:
 *      1. 集合接口或集合类在jdk5.0时都修改为带泛型的结构
 */

public class GenericTest {

    //在集合中使用泛型之前的情况:
    @Test
    public void test1() {
        ArrayList<Integer> list = new ArrayList<>();
        //需求: 存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(96);
        //问题一: 类型不安全
        //list.add("Tom");

        for (Integer score : list) {
            //问题二: 强转时, 有可能出现类型转换异常
            int studentScore = score; //ClassCastException
            System.out.println(studentScore);
        }
    }

    //在集合中使用泛型的情况: 以ArrayList为例
    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<>();

        //编译时就会进行类型检查, 保证数据的安全
        list.add(78);
        list.add(86);
        list.add(100);
        list.add(99);

        //方式一:
        for (Integer score : list) {
            //避免了强转操作
            int studentScore = score + 50;
            System.out.println(studentScore);
        }

        //方式二:
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    //在集合中使用泛型的情况: 以HashMap为例
    @Test
    public void test3() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 87);
        map.put("Jerry", 87);
        map.put("Jack", 67);

        //泛型的嵌套
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
}

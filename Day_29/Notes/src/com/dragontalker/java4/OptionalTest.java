package com.dragontalker.java4;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test1() {
        Girl girl = new Girl();
        girl = null;
        //of(T t): 保证t是非空的
        Optional<Girl> optionalGirl = Optional.of(girl);
        //System.out.println(optionalGirl);
    }

    @Test
    public void test2() {
        Girl girl = new Girl();
        girl = null;
        //ofNullable(T t): t可以为null
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        //orElse(T t): 如果当前的Optional内部封装的t是非空的, 则返回内部t
        //如果内部的t是空的, 则返回orElse()方法中的参数
        Girl elseGirl = optionalGirl.orElse(new Girl("赵丽颖"));
        System.out.println(elseGirl);
    }

    public String getGirlName(Boy boy) {
        return boy.getGirl().getName();
    }

    @Test
    public void test3() {
        Boy boy = new Boy();
        String girlName = getGirlName(boy);
        System.out.println(girlName);
    }

    //优化以后的getGirlName():
    public String improvedGetGirlName(Boy boy) {
        if (boy != null) {
            Girl girl = boy.getGirl();
            if (girl != null) {
                return girl.getName();
            }
        }
        return null;
    }

    @Test
    public void test4() {
        Boy boy = new Boy();
        String girlName = improvedGetGirlName(boy);
        System.out.println(girlName);
    }

    //使用Optional类的getGirlName()
    public String optionalGetGirlName(Boy boy) {
        return  null;
    }
}

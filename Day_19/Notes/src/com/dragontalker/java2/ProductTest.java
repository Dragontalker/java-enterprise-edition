package com.dragontalker.java2;

/*
线程通信的应用: 经典例题: Producer/Consumer问题

分析:
1. 是否是多线程问题? 是, Producer线程、Consumer线程
2. 是否有共享数据? 是, Clerk(Or Product)
3. 如何解决线程的安全问题? 同步机制, 有三种方法
4. 是否涉及到线程的通信? 是
 */

class Clerk {

}

class Producer extends Thread{

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }
}

class Consumer extends Thread{

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }
}

public class ProductTest {
}

package com.wang.demo;

import sun.java2d.loops.GraphicsPrimitive;

class MyThread implements Runnable{
    private String name;//线程名称
    public MyThread(String name){
        this.name = name; //
    }


    @Override
    public void run() {  //覆写run（）方法，作为线程的操作主体
        for(int i=0;i<10;i++){
            System.out.println(name + "运行,i= " + i);
        }

    }
};

public class RunnableDemo01 {
    public static  void main(String arg[]){
        MyThread mt1 = new MyThread("线程A ");//实力化对象
        MyThread mt2 = new MyThread("线程B ");
        Thread t1 = new Thread(mt1);//实力化Thread类对象
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
    }
}


package com.wang.demo;

class MyThread1 extends Thread{
    private String name;
    public MyThread1(String name) {
        this.name = name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name +"运行，i= " + i);
        }
    }

};

public class RunnableDemo02 {
    public static void main(String args[]){
        MyThread1 mt1 = new MyThread1("线程 A");
        MyThread1 mt2 = new MyThread1("线程B ");
        mt1.start();
        mt2.start();
    }




}

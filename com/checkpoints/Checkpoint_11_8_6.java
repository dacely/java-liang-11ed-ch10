package com.checkpoints;

public class Checkpoint_11_8_6
{
    public static void main(String[] args) {
        A a = new A(3);
    }
}

class A extends B
{
    public A(int t) {
        System.out.println("A's constructor is invoked");
    }
}

class B {
    public B() {
        System.out.println("B's constructor is invoked");
    }
}

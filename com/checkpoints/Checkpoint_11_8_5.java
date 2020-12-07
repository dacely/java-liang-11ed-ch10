package com.checkpoints;

public class Checkpoint_11_8_5
{
    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
}

class Student extends Person {
//    @Override
    private String getInfo() {
        return "Student";
    }
}
class Person {
    private String getInfo() {
        return "Person";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}

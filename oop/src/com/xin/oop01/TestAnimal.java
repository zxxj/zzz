package com.xin.oop01;

public class TestAnimal {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.name = "小狗";
        a1.date = "2024-6-6";
        a1.gender = '男';
        a1.eat();
        a1.run();
        System.out.println(a1.name);
        System.out.println(a1.date);
        System.out.println(a1.gender);
    }
}

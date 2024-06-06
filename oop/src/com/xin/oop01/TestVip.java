package com.xin.oop01;

public class TestVip {
    public static void main(String[] args) {

        Vip v1 = new Vip();
        v1.name = "zhangxinxin";
        v1.age = 18;
        v1.shopping();

        System.out.println(v1.name);
        System.out.println(v1.age);

        Vip v2 = new Vip();
        v2.name = "小明";
        v2.age = 22;
        v2.shopping();

        System.out.println(v2.name);
        System.out.println(v2.age);
    }
}

package com.xin.oop01;

public class Test {
    public static void main(String[] args) {

        // 通过学生类Student实例化学生对象
        // Student s1: s1是变量名,Student是一种数据类型,属于引用数据类型
        Student s1 = new Student();

        // 访问对象中的属性
        System.out.println(s1.name); // null
        System.out.println(s1.age); // 0
        System.out.println(s1.gender); // false

        // 修改对象中的属性
        s1.name = "xin";
        s1.age = 20;
        s1.gender = true;

        System.out.println(s1.name); // xin
        System.out.println(s1.age); // 20
        System.out.println("性别：" + (s1.gender ? '男' : "女")); // 男
    }
}

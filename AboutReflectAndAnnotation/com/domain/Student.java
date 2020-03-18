package com.domain;

public class Student {
    @Check
    public void sleep(){
        System.out.println("sleep...");
    }
    @Check
    public void slept(){
        int x=1/0;
        System.out.println("sleep...");
    }
}

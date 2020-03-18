package com.domain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;

public class TestCheck {
    public static void main(String[] args) throws IOException {
        Student student = new Student();
        Class studentClass = student.getClass();
        Method[] methods = studentClass.getMethods();

        int number=0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));


        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(student);
                } catch (Exception e) {
                    number++;
                    bw.write(method.getName()+" Exception");
                    bw.newLine();
                    bw.write("exceptionname"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("exceptioncause"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("======================");
                }
            }
        }
        bw.write("there is "+number+" exception");
        bw.flush();
        bw.close();
    }
}

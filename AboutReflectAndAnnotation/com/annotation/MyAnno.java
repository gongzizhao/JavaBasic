package com.annotation;

public @interface MyAnno {

    int show() default 3;
    String value();

}

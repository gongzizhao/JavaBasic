package com.annotation;

import javax.xml.transform.Source;
import java.lang.annotation.*;

@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno1 {

}

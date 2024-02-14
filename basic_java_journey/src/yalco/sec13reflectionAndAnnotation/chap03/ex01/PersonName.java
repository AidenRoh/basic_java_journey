package yalco.sec13reflectionAndAnnotation.chap03.ex01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PersonName {
	String first();
	String last();
}

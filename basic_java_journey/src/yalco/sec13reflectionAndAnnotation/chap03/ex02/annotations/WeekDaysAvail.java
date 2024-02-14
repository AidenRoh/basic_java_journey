package yalco.sec13reflectionAndAnnotation.chap03.ex02.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import yalco.sec13reflectionAndAnnotation.chap03.ex02.enums.WeekDay;

@Retention(RetentionPolicy.RUNTIME)
public @interface WeekDaysAvail {
	WeekDay[] value();
}
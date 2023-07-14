package com.wintone.excellibs.annotation;

import com.wintone.excellibs.service.IConvertParserAdapter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelWriteAdapter {

    Class adapter() default IConvertParserAdapter.class;
}

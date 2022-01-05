package com.example.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Khai báo 1 annotation = cách sử dụng @interface
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface NameOfClass {
    String value();
}

/**
 * @Retention: Dùng để chú thích mức độ tồn tại của một annotation
 *
 * SOURCE: Tồn tại trên code nguồn, và không được trình biên dịch (compiler) nhận ra.
 * CLASS: Mức tồn tại được compiler nhận ra, nhưng không được nhận biết bởi máy ảo tại thời điểm chạy (Runtime).
 * RUNTIME: Mức tồn tại lớn nhất, compiler nhận biết, và máy ảo (jvm) cũng nhận ra khi chạy chương trình.
 */

/**
 * @Target: Dùng để chú thích phạm vi sử dụng của một Annotation
 *
 * ElementType.TYPE - Cho phép chú thích trên Class, interface, enum, annotation.
 * ElementType.FIELD - Cho phép chú thích trường (field), bao gồm cả các hằng số enum.
 * ElementType.METHOD - Cho phép chú thích trên method.
 * ElementType.PARAMETER - Cho phép chú thích trên parameter
 * ElementType.CONSTRUCTOR - Cho phép chú thích trên constructor
 * ElementType.LOCAL_VARIABLE - Cho phép chú thích trên biến địa phương.
 * ElementType.ANNOTATION_TYPE - Cho phép chú thích trên Annotation khác
 * ElementType.PACKAGE - Cho phép chú thích trên package.
 */

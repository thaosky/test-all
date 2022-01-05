package com.example.demo.annotation;

public class NameOfClassProcessor {
    public static String toJson(Object object) {
        StringBuilder sb = new StringBuilder();
        Class<?> clazz = object.getClass();
        NameOfClass nameOfClass = clazz.getDeclaredAnnotation(NameOfClass.class);
        return nameOfClass.value();
    }
}

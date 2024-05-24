package org.example.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationHandler {
    private final Class<?> aClass;
    private final Method targetMethod;

    public AnnotationHandler(Class<?> aClass, Method targetMethod) {
        this.aClass = aClass;
        this.targetMethod = targetMethod;
    }

    public String handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object handler = declaredConstructor.newInstance();
        return (String) targetMethod.invoke(handler, request, response);
    }
}

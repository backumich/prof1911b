package com.vertex.prof.reflection;

import java.util.Arrays;

public class ReflectionExperiments {

    public String text;

    public static void main(String[] args) {

        Class<ReflectionExperiments> aClass = ReflectionExperiments.class;

        System.out.println(Arrays.toString(aClass.getClasses()));

//        System.out.println(SubClass.class.getDeclaringClass());
//        System.out.println(SubClass.class.getEnclosingClass());

    }

    public static class SubClass{

    }

    private static class PrivateSubClass{

    }

    private interface PrivateSubInterface {

    }

    public interface PublicSubInterface {

    }
}

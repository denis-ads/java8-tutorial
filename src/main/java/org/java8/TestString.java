package org.java8;

public class TestString {

    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        if (s1 == s2) {
            System.out.println("s1 == s2");
        }
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2)");
        }
        if (s1 == s3) {
            System.out.println("s1 == s3");
        }
        if (s1.equals(s3)) {
            System.out.println("s1.equals(3)");
        }

    }
}

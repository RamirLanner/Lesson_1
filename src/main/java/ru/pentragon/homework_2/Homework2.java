package ru.pentragon.homework_2;

public class Homework2 {

    private static byte byteVar;
    private static short shortVar;
    private static int intVar;
    private static long longVar;
    private static float floatVar;
    private static double doubleVar;
    private static char charVar;
    private static boolean booleanVar;
    private static String stringVar;

    public static void main(String[] args) {
        OutputVars();
        InicilizateVar();
        OutputVars();
    }

    private static void InicilizateVar(){
        byteVar = 126;
        shortVar = -32767;
        intVar = 2147483647;
        longVar = -9223372036854775808L;
        floatVar = 65463764.4544f;
        doubleVar = 74646.64445;
        charVar = '&';
        booleanVar = true;
        stringVar = "переменные переопределенны, строка тоже)";
    }

    private static void OutputVars(){
        System.out.println(byteVar);
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(charVar);
        System.out.println(booleanVar);
        System.out.println(stringVar);
    }
}

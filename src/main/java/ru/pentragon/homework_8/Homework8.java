package ru.pentragon.homework_8;

public class Homework8 {
    public static void YearDefinition(int year){
        boolean yearDiv4 = false;
        boolean yearDiv100 = false;
        boolean yearDiv400 = false;

        if ((year % 4) == 0){
            yearDiv4 = true;
        }
        if ((year % 100) == 0){
            yearDiv100 = true;
        }
        if ((year % 400) == 0){
            yearDiv400 = true;
        }
//можно конечно все условие закинуть в последний IF но мне кажется там будет не читаемо
        if((yearDiv4 & !yearDiv100) | yearDiv400){
            System.out.println("Год "+year+" виокосный");
        }
        else{
            System.out.println("Год "+year+" НЕ виокосный");
        }
    }
}

package ru.pentragon;

import ru.pentragon.homework_1.Homework1;
import ru.pentragon.homework_2.Homework2;
import ru.pentragon.homework_3.Homework3;
import ru.pentragon.homework_4.Homework4;
import ru.pentragon.homework_5.Homework5;
import ru.pentragon.homework_6.Homework6;
import ru.pentragon.homework_7.Homework7;
import ru.pentragon.homework_8.Homework8;


public class JavaMainApp {
    public static void main(String[] args) {
//для того что бы появились отличия в коде
        System.out.println("HomeWork - Task_1:");
        Homework1.main(null);
        System.out.println("HomeWork - Task_1 - End"+"\n");

        System.out.println("HomeWork - Task_2:");
        Homework2.main(null);
        System.out.println("HomeWork - Task_2 - End"+"\n");

        System.out.println("HomeWork - Task_3:");
        System.out.println(Homework3.CalcABCD(3,4,5,56.45f));
        System.out.println("HomeWork - Task_3- End"+"\n");
        //надо разобраться в исключениях(неужели автоматом срабатывет), не понял
        //почему при делении на 0 он не ущел в ошибку,
        //а выдал NAN

        System.out.println("HomeWork - Task_4:");
        System.out.println(Homework4.IncludeInRange(10,1));
        System.out.println("HomeWork - Task_4- End"+"\n");

        System.out.println("HomeWork - Task_5:");
        Homework5.IntSignDef(-11);
        System.out.println("HomeWork - Task_5- End"+"\n");

        System.out.println("HomeWork - Task_6:");
        //просто ради интереса пусть будет лонг вместо инт
        System.out.println(Homework6.InverseIntSignDef(456L));
        System.out.println("HomeWork - Task_6- End"+"\n");

        System.out.println("HomeWork - Task_7:");
        //просто ради интереса пусть будет лонг вместо инт
        Homework7.PrintName("Boris");
        System.out.println("HomeWork - Task_7- End"+"\n");

        System.out.println("HomeWork - Task_8:");
        //просто ради интереса пусть будет лонг вместо инт
        Homework8.YearDefinition(0);
        Homework8.YearDefinition(2000);
        Homework8.YearDefinition(2005);
        Homework8.YearDefinition(400);
        Homework8.YearDefinition(100);
        Homework8.YearDefinition(409);
        Homework8.YearDefinition(2020);
        System.out.println("HomeWork - Task_8- End"+"\n");
    }

}

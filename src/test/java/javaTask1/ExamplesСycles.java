package javaTask1;

import java.util.Scanner;

public class ExamplesСycles {
    public static void main(String[] args) {
        int count = 4;
        while (count > 0) {
            System.out.println("count while = " + count);
            count--;
        }
        while (true) {
            System.out.println("count while if = " + count);
            if (count > 4) {
                break;
            }
            count++;
        }

        do {
            System.out.println("count do while = " + count);
            count++;
        } while (count < 10);

        for (; count < 15; count++) {
            System.out.println("count for = " + count);
        }

        int variable = 100;
        while(true) {
            System.out.print(variable +" ");
            variable = variable / 2;
            if (variable == 25)
                continue;
            else if (variable == 0) {
                break;
            } else
                System.out.println("variable continue= " + variable);
        }

        int[] countForeach = {1, 2, 3, 4, 5};

        for (int countF : countForeach) {
            System.out.println("count foreach = " + countF);
        }

        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x :");
        x = Integer.parseInt(in.nextLine());

        if (x < 20) {
            System.out.print("Это оператор if. ");
        } else {
            System.out.print("Это оператор else. ");
        }

        int season;
        System.out.println(" Введите число от 1 до 4 и получите время года:");
        season = Integer.parseInt(in.nextLine());

        switch (season) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;
            default :
                System.out.println("Неверный ввод");
        }
    }
}

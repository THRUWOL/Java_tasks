/*
* Напишите программу, моделирующую бросок монетки.
*/

import java.util.Random;

public class Main {
    private static boolean flip(){
        Random r = new Random();
        System.out.println("Бросаем монетку...");
        return r.nextBoolean();
    }

    public static void main(String[] args) {
        boolean coinSide = flip();

        if (coinSide){
            System.out.println("Орёл");
        }
        else{
            System.out.println("Решка");
        }
    }
}

/*
* Напишите программу, которая генерирует 25 случайных значений типа int. Для 
* каждого значения команда if-e ls e сообщает, в каком отношении оно находится 
* с другим случайно сгенерированным числом (больше, меньше, равно).
*/

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(25);
        int b = random.nextInt(25);

        if (a > b){
            System.out.println(a + " > " + b);
        }
        else if (a < b){
            System.out.println(a + " < " + b);
        }
        else{
            System.out.println(a + " = " + b);
        }
    }
}

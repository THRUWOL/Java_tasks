/*
* Напишите программу, которая генерирует 25 случайных значений типа int. Для 
* каждого значения команда if-e ls e сообщает, в каком отношении оно находится 
* с другим случайно сгенерированным числом (больше, меньше, равно).
*/

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[25];

        for (int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
            int b = random.nextInt(100);
            if (a[i] > b){
                System.out.println(a[i] + " > " + b);
            }
            else if (a[i] < b){
                System.out.println(a[i] + " < " + b);
            }
            else{
                System.out.println(a[i] + " = " + b);
            }
        }
    }
}

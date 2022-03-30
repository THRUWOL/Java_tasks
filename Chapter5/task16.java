/*
* Создайте массив объектов String. Присвойте объект String каждому элементу. 
* Выведите содержимое массива в цикле for.
*/

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i ++){
            arr[i] = "Число: " + random.nextInt(20);
            System.out.println(arr[i]);
        }
    }
}

/*
* Измените упражнение 2 так, чтобы код выполнялся в «бесконечном» цикле 
* while. Программа должна работать до тех пор, пока ее выполнение не будет прервано с клавиатуры
*/

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);

            if (a > b) {
                System.out.println(a + " > " + b);
            } else if (a < b) {
                System.out.println(a + " < " + b);
            } else {
                System.out.println(a + " = " + b);
            }
        }
    }
}

/*
* Измените упражнение 1 так, чтобы выход из программы осуществлялся ключевым словом break при значении 99. Попробуйте использовать ключевое слово 
* return.
*/

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <=100; i++)
            if (i == 99)
                break;
            else
                System.out.println(i);
    }
}

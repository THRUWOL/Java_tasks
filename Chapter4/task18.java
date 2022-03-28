/*
* Напишите программу, использующую два вложенных цикла for и оператор 
* остатка (%) для поиска и вывода простых чисел (то есть целых чисел, не делящихся 
* нацело ни на какое другое число, кроме себя и 1).
*/

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i < 1000 ;i++){
            for (int j = 2, search = 0; j < i; j++){
                if (i % j == 0){
                    break;
                }
                else if (i == j +1){
                    System.out.println(i);
                }
            }
        }
    }
}

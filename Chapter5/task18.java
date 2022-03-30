/*
* Завершите предыдущее упражнение — создайте объекты, которыми заполняется 
* массив ссылок.
*/

class Str {

    Str(String element) {
        System.out.println(element);
    }
}

public class Main {

    public static void main(String[] args) {
        Str[] str = new Str[5];

        for(int i = 0; i < str.length; i++){
            str[i] = new Str("Text...");
            System.out.println(str[i]);
        }
    }
}

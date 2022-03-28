/*
* Создайте класс с неинициализированной ссылкой на String. Покажите, 4ToJava
* инициализирует ссылку значением null.
*/

class NonInitialize{
    String i;
}

public class Main {

    public static void main(String[] args) {
        System.out.print(new NonInitialize().i);
    }
}

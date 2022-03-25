/*
* Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен.
*/

class Test {
    float x;
}

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.x = 5.45f;
        t2.x = 1.11f;
        System.out.println("t1.x: " + t1.x +", t2.x: " + t2.x);

        t1.x = t2.x;
        System.out.println("t1.x: " + t1.x +", t2.x: " + t2.x);
        t2.x = 5.23f;
        System.out.println("t1.x: " + t1.x +", t2.x: " + t2.x);

    }
}

/*
* Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен при вызове методов.
*/

class Test {
    float x;
}

public class Main {
    static void f(Test arg){
        arg.x = 100f;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.x = 50f;
        System.out.println("t1.x: " + t1.x);
        f(t1);
        System.out.println("t1.x: " + t1.x);
    }
}

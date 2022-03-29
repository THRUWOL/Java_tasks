/*
* Создайте класс Dog (собака) с перегруженным методом bark() (лай). Методдолжен 
* быть перегружен для разных примитивных типов данных с целью вывода сообщения о лае, завывании, поскуливании и т. п. в зависимости от версии перегруженного 
* метода. Напишите метод main(), вызывающий все версии.
*/

class Dog{

    void bark (int i){
        System.out.println("лай");
    }
    void bark (float i){
        System.out.println("завыание");
    }
    void bark(double i){
        System.out.println("поскуливание");
    }

    void main(int a, double b, float c){
        bark(c);
        bark(b);
        bark(a);
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        int a = 1;
        float b = 1.0f;
        double c = 1.0d;

        dog.bark(a);
        dog.bark(b);
        dog.bark(c);

        dog.main(a,c,b);
    }
}

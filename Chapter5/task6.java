/*
* Измените предыдущее упражнение так, чтобы два перегруженных метода принимали два аргумента (разных типов) и отличались только порядком их следования 
* в списке аргументов. Проверьте, работает ли это
*/

class Dog{

    void bark (int i){
        System.out.println("лай");
    }
    void bark (float i, double j){
        System.out.println("завыание");
    }
    void bark(double i, float j){
        System.out.println("поскуливание");
    }

    void main(int a, double b, float c){
        bark(c, b);
        bark(b, c);
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
        dog.bark(b, c);
        dog.bark(c, b);

        dog.main(a,c,b);
    }
}

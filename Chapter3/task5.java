/*
* Создайте класс Dog, содержащий два поля типа String: name и says. В методе 
* main() создайте два объекта Dog с разными именами (spot и scruffy) и сообщениями. 
* Выведите значения обоих полей для каждого из объектов.
*/

class Dog{
    String name, says;

    public Dog(String name, String says){
        this.name = name;
        this.says = says;
    }

    public void dogSay(){
        System.out.println(name +": "+says);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Hello, world");
        Dog dog2 = new Dog("scruffy", "Hello, spot!");

        dog1.dogSay();
        dog2.dogSay();
    }
}

/*
* В упражнении 5 создайте новую ссылку на Dog и присвойте ее объекту spot. 
* Сравните ссылки оператором == и методом equals().
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
        System.out.println(dog1.equals(dog2));
        dog1 = dog2;
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1 == dog2);
    }
}

/*
*Напишите программу, которая демонстрирует, что независимо от количества 
*созданных объектов класс содержит только один экземпляр поля static.
*/

class StaticTest{
    static int i = 30;
}

public class Main {
    public static void main(String[] args) {
        StaticTest first = new StaticTest();
        StaticTest second = new StaticTest();

        first.i = 31;
        System.out.println(second.i); // 31
        System.out.println(first.i); // 31
    }
}

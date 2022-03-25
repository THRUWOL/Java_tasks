/*
*Превратите фрагменты кода с классом lncrementable в работающую программу.
*/

class StaticTest{
    static int i = 47;
    int x = 5;
}

class Incrementable {
    static void increment(){
        StaticTest.i++;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}

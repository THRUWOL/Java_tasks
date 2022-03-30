/*
* Напишите метод, получающий список аргументов переменной длины с массивом 
* String. Убедитесь в том, что этому методу может передаваться как список объектов 
* String, разделенных запятыми, так и String[].
*/

public class Main {

    static void f(String ... element){
        for (String i: element){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        f("Abc", "ddd", "321");
        String[] arr = {"aaa", "bbb", "ccc"};
        f(arr);
    }
}

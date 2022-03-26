/*
* Напишите метод, который получает два аргумента String, выполняет с ними 
* все операции логических сравнений и выводит результаты. Для операций == и I = 
* также выполните проверку equals(). Вызовите свой метод из main() для нескольких 
* разных объектов String.
*/

public class Main {
    public static void stringOperator(String a, String b){
        System.out.println("equals(): " + a.equals(b));
        System.out.println("==: " + a == b);
        System.out.println("!=: " + a != b);
    }

    public static void main(String[] args) {
        stringOperator("text1", "text2");
        stringOperator("abc", "abc");
    }
}

/*Создайте класс с полями int и char, которые не инициализируются в программе. 
*Выведите их значения, чтобы убедиться в том, что Java выполняет инициализацию 
*по умолчанию.
*/

class Test{
    int x;
    char y;
}

public class Main {

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.x);
        System.out.println(t.y);
    }
}

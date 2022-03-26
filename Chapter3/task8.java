/*
* Покажите, что шестнадцатеричная и восьмеричная записи могут использоваться 
* с типом long. Для вывода результатов используйте метод Long.toBinaryString().
*/

public class Main {

    public static void main(String[] args) {
        int a = 0x264ab54f;
        int b = 222225642;
        System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toBinaryString(b));
    }
}

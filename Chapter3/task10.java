/*
* Напишите программу с двумя константами: обе константы состоят из чередующихся нулей и единиц, но у одной нулю равен младший бит, а у другой старший 
* (подсказка: константы проще всего определить в шестнадцатеричном виде). Объедините эти две константы всеми возможными поразрядными операторами. Для 
* вывода результатов используйте метод Integer.toBinaryString().
*/

public class Main {

    public static void main(String[] args) {
        final int FIRST = 0X010101;
        final int SECOND = 0x101010;
        System.out.println("FIRST: " + Integer.toBinaryString(FIRST) + "\nSECOND: " + Integer.toBinaryString(SECOND));
        System.out.println("|: " + Integer.toBinaryString(FIRST | SECOND));
        System.out.println("&: " + Integer.toBinaryString(FIRST & SECOND));
        System.out.println("^: " + Integer.toBinaryString(FIRST ^ SECOND));
    }
}

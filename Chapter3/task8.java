/*
* Покажите, что шестнадцатеричная и восьмеричная записи могут использоваться 
* с типом long. Для вывода результатов используйте метод Long.toBinaryString().
*/

public class Main {

    public static void main(String[] args) {
        // 10011001001010101101011111111111110100001000110010001101001111
        long a = 0x264ab5fff423234fL;
        System.out.println(Long.toBinaryString(a));
        
        // 1111011010111000010100111000100100111110001100101101110010011
        long b = 2222256422245522323L;
        System.out.println(Long.toBinaryString(b));
    }
}

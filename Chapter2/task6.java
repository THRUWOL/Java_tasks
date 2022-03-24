/* 
*Напишите программу, включающую метод storage(), 
*приведенный ранее в этой главе
*/

class ByteInfo {
    String storage(String s){
        return s.length() * 2 + " byte";
    }
}

public class Main {
    public static void main(String[] args) {
        ByteInfo byteInfo = new ByteInfo();
        String hello = "Hello, world";

        System.out.println(byteInfo.storage(hello));
    }
}

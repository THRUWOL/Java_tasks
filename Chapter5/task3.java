/*
*  Создайте класс с конструктором по умолчанию (без параметров), который выводит на экран сообщение. Создайте объект этого класса.
*/

class Text{
    final void outText(){
        System.out.println("Объект :)");
    }
}

public class Main {

    public static void main(String[] args) {
        new Text().outText();
    }
}

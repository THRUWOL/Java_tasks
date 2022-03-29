/*
* Добавьте к классу из упражнения 3 перегруженный конструктор, принимающий 
* в качестве параметра строку (String) и распечатывающий ее вместе с сообщением.
*/

class Text{
    void outText(){
        System.out.println("Объект :)");
    }
    void outText(String name){
        System.out.println("Здарова, " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        new Text().outText();
        new Text().outText("Никита");
    }
}

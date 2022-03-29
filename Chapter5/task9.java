/*
* Подготовьте класс с двумя (перегруженными) конструкторами. Используя 
* ключевое слово this, вызовите второй конструктор из первого.
*/

class Empty{
    Empty(){ 
        new Empty(5);
    }
    Empty(int i){
        
    }

}

public class Main {

    public static void main(String[] args) {
        Empty e = new Empty();
    }
}

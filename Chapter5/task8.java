/*
* Создайте класс с двумя методами. В первом методе дважды вызовите второй 
* метод: один раз без ключевого слова this, а во второй с this — просто для того, чтобы убедиться в работоспособности этого синтаксиса; не используйте этот способ 
* вызова на практике.
*/

class Empty{
    Empty(){
        first();
    }
    void first(){
        second();
        this.second();
    }

    void second(){
        System.out.println("Робит");
    }
}

public class Main {

    public static void main(String[] args) {
        Empty e = new Empty();
    }
}

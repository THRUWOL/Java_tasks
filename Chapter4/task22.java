/*
* Создайте команду switch, которая выводит сообщение в каждой секции case. 
* Разместите ее в цикле for, проверяющем все допустимые значения case. Каждая
* секция case должна завершаться командой break. Затем удалите команды break
* и посмотрите, что произойдет.
*/

public class Main {

    public static void main(String[] args) {
        for(int input = 0; input < 5; input++){
            switch (input){
                case 1: System.out.println("Один");
                break;
                case 2: System.out.println("Два");
                break;
                case 3: System.out.println("Три");
                break;
                case 4: System.out.println("Четыре");
                break;
                default: System.out.println("Всё");
                break;
            }
        }
    }
}

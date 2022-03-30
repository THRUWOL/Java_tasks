/*
* Создайте перечисление с названиями шести типов бумажных денег. Переберите 
* результат values() с выводом каждого значения и его ordinal().
*/

public class Main {
    public enum Money{
        Капуста, Кеш, Бабло, Зелень, Деньги, Мани
    }

    public static void main(String[] args) {
        for (Money i: Money.values()){
            System.out.println(i + ":" + i.ordinal());
        }
    }
}

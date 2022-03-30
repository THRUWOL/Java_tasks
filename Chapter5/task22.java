/*
* Напишите команду switch для перечисления из предыдущего примера. Для 
* каждого случая выведите расширенное описание конкретной валюты
*/

public class Main {
    public enum Money{
        Капуста, Кеш, Бабло, Зелень, Деньги, Мани
    }

    public static void main(String[] args) {
        Random random = new Random();
        Money i = Money.values()[random.nextInt(6)];
        switch (i){
            case Капуста:   System.out.println("Ну типо капуста");
                            break;
            case Кеш:       System.out.println("Ну типо Кеш");
                            break;
            case Бабло:     System.out.println("Ну типо бабло");
                            break;
            case Зелень:    System.out.println("Ну типо зелень");
                            break;
            case Деньги:    System.out.println("Ну типо деньги");
                            break;
            case Мани:      System.out.println("Ну типо мани");
                            break;
            default:        System.out.println("ХЗ");
        }
    }
}

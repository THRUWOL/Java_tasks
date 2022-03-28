/*
* Числами Фибоначчи называется числовая последовательность 1,1,2,3,5,8,13, 
* 21, 34 и т. д., в которой каждое число, начиная с третьего, является суммой двух 
* предыдущих. Напишите метод, который получает целочисленный аргумент и выводит указанное количество чисел Фибоначчи. Например, при запуске командой java
* Fibonacci 5 (где Fibonacci — имя класса) должна выводиться последовательность 
* 1, 1, 2, 3, 5.
*/

public class Main {

    static int Fibonacci (int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return Fibonacci(n-2) + Fibonacci(n-1);
    }

    public static void main(String[] args) {
        int maxNumber = 5;
        for(int i = 0; i <= maxNumber; i++){
            System.out.print(Fibonacci(i) +" ");
        }
    }
}

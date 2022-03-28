/*
* Измените метод test() так, чтобы он получал два дополнительных аргумента 
* begin и end, а значение testval проверялось на принадлежность к диапазону [ begin,
* end] (с включением границ).
*/

public class Main {

    static int test(int testval, int target, int begin, int end){
        if (testval >= begin && testval <= end && testval > target)
            return  +1;
        else if (testval >= begin && testval <= end && testval < target)
            return -1;
        else if (testval == target && testval >= begin && testval <= end)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(test(10,5,1,10));
        System.out.println(test(10,5,10,20));
        System.out.println(test(10,5,-5,5));
    }
}

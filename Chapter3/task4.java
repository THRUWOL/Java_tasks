/*
* Напишите программу, которая вычисляет скорость для постоянных значений 
* расстояния и времени.
*/

public class Main {
    public static float getSpeed(float distance, float time){
        return distance / time;
    }

    public static void main(String[] args) {
        float distance = 1280;
        float time = 13;
        System.out.println(getSpeed(distance, time));
    }
}

/*
*Измените упражнение 4 так, чтобы данным класса DataOnly присваивались 
*значения, а затем распечатайте их в методе main().
*/

public class DataOnly {
    int x = 5, y = 10;

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        System.out.printf("x: %d, y: %d", dataOnly.x, dataOnly.y);
    }
}

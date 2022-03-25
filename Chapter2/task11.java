/*
*Преобразуйте пример с классом AllTheColorsOfTheRainbow в работающую программу.
*/

class AllTheColorsOfTheRainbow{
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        anIntegerRepresentingColors = newHue;
    }
}

public class Main {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow x = new AllTheColorsOfTheRainbow();
        x.changeTheHueOfTheColor(20);

        System.out.println(x.anIntegerRepresentingColors);
    }
}

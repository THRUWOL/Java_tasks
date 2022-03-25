/*
* Напишите программу, которая выводит три параметра командной строки. Для 
*получения аргументов вам потребуется обращение к элементам массива строк 
*(String).
*/

public class Main {
    public static void main(String[] args) {
         String[] arr = new String[3];

         for (String element: arr){
             System.out.println(element);
         }
    }
}

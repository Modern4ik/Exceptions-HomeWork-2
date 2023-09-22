package task3;

import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;

            System.out.println(a / b);

            printSum(23, 234);

            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("На 0 делить нельзя!");
        } catch (FileNotFoundException ex) {
            System.out.println("По данному пути файл не был найден!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Индекс вышел за пределы массива!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель указывать на null");
        } catch (Exception ex) {
            System.out.println("Произошла ошибка: " + ex);
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);

    }
}

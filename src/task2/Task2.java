package task2;

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException exc) {
            System.out.println("Catching exception: " + exc);
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("Catching exception: " + exc);
        } catch (Exception exc){
            System.out.println("Произошла ошибка: " + exc);
        }
    }
}

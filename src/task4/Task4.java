package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();

        if (!result.isEmpty()){
            System.out.println(result);
            input.close();
        }else{
            input.close();
            throw new RuntimeException("Нельзя вводить пустую строку!");
        }
    }
}

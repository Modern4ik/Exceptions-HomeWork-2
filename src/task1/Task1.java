package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        float result = userInput();
        System.out.printf("Вы ввели число %f", result);
    }

    public static float userInput(){
        Scanner input = new Scanner(System.in);
        boolean isNotGetted = true;
        float res = 0.0f;

        while (isNotGetted){
            System.out.println("-------------------------");
            System.out.printf("Введите дробное число: ");
            
            if (input.hasNextFloat() && !input.hasNextInt() ){
                res = input.nextFloat();

                input.close();
                isNotGetted = false;
            }else{
                System.out.println("Вы должны ввести дробное число!(Число с плавающей точкой).\nПопробуйте снова!");
                input.next();
            }
        }

        return res;
        
    }
}

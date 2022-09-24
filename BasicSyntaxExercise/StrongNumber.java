package BasicSyntaxExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int numberCompare = number;
        int product= 1;
        int sumProduct = 0;


        while(number>0){
            int lastDigit = number%10;

            for (int i = 1; i <=lastDigit ; i++) {
                product = product * i;



            }
            sumProduct = sumProduct + product;

            number = number/10;
            product = 1;



        }
        if(sumProduct==numberCompare){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }


    }
}

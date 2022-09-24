package BasicSyntaxLab;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isFound = false;

        String command = scanner.nextLine();



        while(!isFound){
            int number = Integer.parseInt(command);
            if(!(number%2==0)) {
                System.out.printf("Please write an even number.%n");
                command = scanner.nextLine();
                continue;

            }else{
                System.out.printf("The number is: %d", Math.abs(number));
                isFound = true;

            }



        }



    }



}

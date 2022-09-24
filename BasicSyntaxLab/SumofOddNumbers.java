package BasicSyntaxLab;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isEnough = false;
        int counter = 0;
        int sum = 0;


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=100 ; j+=2) {
                System.out.println(j);
                sum +=j;
                counter++;
                if(counter==n){
                    isEnough = true;
                    break;
                }
            }
            if(isEnough){
                break;
            }

        }
        System.out.println("Sum: " + sum);
    }
}

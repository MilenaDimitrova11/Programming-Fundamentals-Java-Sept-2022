package BasicSyntaxExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;


        String command = scanner.nextLine();
        while(!command.equals("Start")){
            double coins = Double.parseDouble(command);
            if(coins==0.1 || coins==0.2 || coins==0.5 || coins==1 || coins==2){
                sum = sum + coins;
            }else{
                System.out.printf("Cannot accept %.2f%n", coins);
                command = scanner.nextLine();
                continue;
            }


            command = scanner.nextLine();
        }

        String input = scanner.nextLine();
        while(!input.equals("End")){
            String product = input;
            if(product.equals("Nuts")){
                if(sum>=nutsPrice){
                    sum = sum - nutsPrice;
                    System.out.printf("Purchased %s%n", product);
                }else{
                    System.out.printf("Sorry, not enough money%n");
                }
            }else if(product.equals("Water")){
                if(sum>=waterPrice){
                    sum = sum - waterPrice;
                    System.out.printf("Purchased %s%n", product);
                }else{
                    System.out.printf("Sorry, not enough money%n");
                }
            }else if(product.equals("Crisps")){
                if(sum>=crispsPrice){
                    sum = sum - crispsPrice;
                    System.out.printf("Purchased %s%n", product);
                }else{
                    System.out.printf("Sorry, not enough money%n");
                }
            }else if(product.equals("Soda")){
                if(sum>=sodaPrice){
                    sum = sum - sodaPrice;
                    System.out.printf("Purchased %s%n", product);
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if(product.equals("Coke")){
                if(sum>=cokePrice){
                    sum = sum - cokePrice;
                    System.out.printf("Purchased %s%n", product);
                }else{
                    System.out.printf("Sorry, not enough money%n");
                }
            }else{
                System.out.printf("Invalid product%n");
            }


            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);



    }
}

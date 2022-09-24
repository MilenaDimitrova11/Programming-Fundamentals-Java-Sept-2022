package BasicSyntaxExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;

        if (type.equals("Students") && day.equals("Friday")) {
            price = 8.45;
        }else if (type.equals("Students") && day.equals("Saturday")) {
            price = 9.80;
        }else if (type.equals("Students") && day.equals("Sunday")) {
            price = 10.46;
        }else if (type.equals("Business") && day.equals("Friday")) {
            price = 10.90;
        }else if (type.equals("Business") && day.equals("Saturday")) {
            price = 15.60;
        }else if (type.equals("Business") && day.equals("Sunday")) {
            price = 16;
        }else if (type.equals("Regular") && day.equals("Friday")) {
            price = 15;
        }else if (type.equals("Regular") && day.equals("Saturday")) {
            price = 20;
        }else if (type.equals("Regular") && day.equals("Sunday")) {
            price = 22.50;
        }




        if(type.equals("Students") && peopleCount>=30){
            totalPrice = price * peopleCount;
            totalPrice = totalPrice - (totalPrice * 0.15);
        }else if(type.equals("Business") && peopleCount>=100){
            totalPrice = price * (peopleCount - 10);
        }else if(type.equals("Regular") && peopleCount>=10 && peopleCount<=20){
            totalPrice = price * peopleCount;
            totalPrice = totalPrice - (totalPrice * 0.05);
        }else{
            totalPrice = price * peopleCount;
        }


        System.out.printf("Total price: %.2f", totalPrice);
    }
}

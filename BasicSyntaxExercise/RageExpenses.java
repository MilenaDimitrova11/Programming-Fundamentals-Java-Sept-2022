package BasicSyntaxExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double expensesTotal = 0;
        int counterKeyboard = 0;

        for (int i = 1; i <=lostGamesCount ; i++) {
            if(i%2==0){
                expensesTotal = expensesTotal + headsetPrice;
            }
            if(i%3==0){
                expensesTotal = expensesTotal + mousePrice;
            }
            if(i%2==0 && i%3==0){
                expensesTotal = expensesTotal + keyboardPrice;
                counterKeyboard++;
            }
            if(counterKeyboard==2){
                expensesTotal = expensesTotal + displayPrice;
                counterKeyboard=0;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", expensesTotal);

    }
}

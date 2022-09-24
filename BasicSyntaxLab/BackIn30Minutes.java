package BasicSyntaxLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int hourinMin = hour * 60;
        int allMins = hourinMin + minutes + 30;
        int hours = allMins / 60;
        int totalMin = allMins % 60;

        if(hours==24){
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, totalMin);
    }
}

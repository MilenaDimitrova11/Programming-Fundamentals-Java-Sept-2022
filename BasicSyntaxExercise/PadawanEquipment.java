package BasicSyntaxExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double robesTotal = studentsCount * robesPrice;
        double lightsabersTotal = Math.ceil((studentsCount + studentsCount * 0.10)) * lightsabersPrice;
        double beltsTotal = (studentsCount - (studentsCount / 6)) * beltsPrice;
        double sumTotal = robesTotal + lightsabersTotal + beltsTotal;

        if(sumTotal<=budget){
            System.out.printf("The money is enough - it would cost %.2flv.", sumTotal);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(budget - sumTotal));
        }



    }
}

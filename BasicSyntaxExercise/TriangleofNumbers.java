package BasicSyntaxExercise;

import java.util.Scanner;

public class TriangleofNumbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isEnd = false;

        for (int rolls = 1; rolls <=n ; rolls++) {
            System.out.printf("%d%n", rolls);

                        for (int column = 1; column <=rolls ; column++) {
                            if(rolls==n){
                                isEnd = true;
                                break;
                            }
                            System.out.printf("%d ", rolls+1);






            }
            if(isEnd){
                break;
            }



        }



    }
}

package BasicSyntaxExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        int length = username.length();
        String password = "";
        int counter = 0;
        boolean isBlocked = false;

        for (int i = username.length()-1; i >=0 ; i--) {
            password = password + username.charAt(i);


        }

        String command = scanner.nextLine();
        while(!command.equals(password)){
            System.out.println("Incorrect password. Try again.");
            counter++;

            if(counter==3){
                System.out.printf("User %s blocked!", username);
                isBlocked = true;
                break;
            }


            command = scanner.nextLine();
        }

        if(!isBlocked){
            System.out.printf("User %s logged in.", username);
        }






    }
}

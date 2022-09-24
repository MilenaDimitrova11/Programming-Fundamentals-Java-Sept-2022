package BasicSyntaxLab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        boolean isEnough = false;


        for (int i = n; i <= n; i++) {
            for (int j = m; j <= 10; j++) {
                int product = n * j;

                    System.out.printf("%d X %d = %d%n", n, j, product);
                }

            }
        if (m > 10) {
            System.out.printf("%d X %d = %d%n", n, m, (n * m));
            }

        }
    }



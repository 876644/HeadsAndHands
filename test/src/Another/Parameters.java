package Another;

import java.util.Scanner;

public class Parameters {
    public static int writeAttackOrProtection(String name){
        Scanner scanner = new Scanner(System.in);
        int newAttackOrProtection = 0;
        while (true) {
            System.out.println("Write " + name + ", it is number from 1 to 30:");
            try {
                newAttackOrProtection = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Try again. You need write natural number.");
                scanner.next();
                continue;
            }
            if (newAttackOrProtection <= 30 && newAttackOrProtection >= 0) break;
            else System.out.println("Try again.");
        }
        return newAttackOrProtection;
    }
    public static int writeHealth(){
        Scanner scanner = new Scanner(System.in);
        int newHealth = 0;
        while (true) {
            System.out.println("Write health, it is number from 0:");
            try {
                newHealth = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Try again. You need write natural number.");
                scanner.next();
                continue;
            }
            if (newHealth > 0) break;
            else System.out.println("Try again.");
        }
        return newHealth;
    }
    public static int[] writeDamages(){
        Scanner scanner = new Scanner(System.in);
        int[] newDamages;
        int M = 0;
        int N = 0;
        System.out.println("Write damages, it is a range of numbers from M to N:");
        while (true) {
            System.out.println("Write M:");
            try {
                M = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Try again.You need write natural number.");
                scanner.next();
                continue;
            }
            if (M > 0) break;
            else System.out.println("Try again. You need write M > 0 ");
        }
        while (true) {
            System.out.println("Write N:");
            try {
                N = scanner.nextInt();
            }catch (Exception e) {
                System.out.println("Try again.");
                scanner.next();
                continue;
            }
            if (N > M) break;
            else System.out.println("Try again. You need write N > M.");
        }
        newDamages = new int[N-M+1];
        for (int i = 0; i<N-M+1;i++){
            newDamages[i] = M+i;
        }
        return newDamages;
    }
}

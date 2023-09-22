package java;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class First {

    public static short sum(int nr) {
        short sum = 0;
        while (nr != 0) {
            short cifra = (short) (nr % 10);
            sum += cifra;
            nr /= 10;
        }
        return sum;
    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for (int num : nums) {
            if (map.containsKey(num) == true) {
                return true;
            }
            map.put(num, true);
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        System.out.println(nr);

        Random rnd = new Random();
        System.out.println(rnd.nextInt(nr));
        if (args.length > 0) {
            System.out.print(args[0]);
        }
        System.out.println("test");

        // ex 1
        // a
        System.out.println("ex 1 a");
        if (args.length > 1) {
            System.out.println((Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
            System.out.println((Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
        }
        // b
        System.out.println("ex 1 b cat si rest:");
        if (args.length > 1) {
            System.out.println((Integer.parseInt(args[0]) / Integer.parseInt(args[1])));
            System.out.println((Integer.parseInt(args[0]) % Integer.parseInt(args[1])));
        }
        // c
        System.out.println("ex 1 c valoare:");
        if (args.length > 1) {
            System.out.println((Integer.parseInt(args[0]) * rnd.nextDouble() * rnd.nextInt()));
            System.out.println((Integer.parseInt(args[1]) * rnd.nextDouble() * rnd.nextInt()));
        }

        // ex 2
        System.out.println("ex 2:");
        int nr1 = scanner.nextInt();
        int nr2 = scanner.nextInt();

        System.out.println(nr1 + nr2);
        System.out.println(nr1 * nr2);

        System.out.println(nr1 / nr2);
        System.out.println(nr1 % nr2);

        // c

        System.out.println(nr1 * rnd.nextDouble() * rnd.nextInt());

        // ex 3
        System.out.print("introduceti un nr: ");
        int nr4 = scanner.nextInt();
        System.out.println("Ati introdus" + nr4);
        System.out.println("Meniu:\n1.Afișare paritate ultima cifră.\n" +
                "2. Afișare paritate prima cifră.\n" +
                "3. Afișare suma cifrelor.");
        System.out.print("Alegeti o optiune(1/2/3): ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println((nr4 % 10) % 2 == 0);
                break;
            case 2:
                System.out.println((nr4 / 1000) % 2 == 0);
                break;
            case 3:
                System.out.println(sum(nr4));
                System.out.println(nr4);
                break;

            default:
                break;
        }

        // ex 4
        System.out.println("ex 4:");
        float x = scanner.nextFloat();
        System.out.println(Math.sin((double) x));
        System.out.println(Math.cos((double) x));
        System.out.println(Math.sqrt((double) x));

        //

        scanner.close();
    }
}

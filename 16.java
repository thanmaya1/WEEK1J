import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        // Check if number fits in byte
        if (n.length() < 4) {
            int num = Integer.parseInt(n);
            if (num >= -128 && num <= 127) {
                System.out.println("byte");
                return;
            }
        }

        // Check if number fits in short
        if (n.length() < 7) {
            int num = Integer.parseInt(n);
            if (num >= -32768 && num <= 32767) {
                System.out.println("short");
                return;
            }
        }

        // Check if number fits in int
        if (n.length() < 12) {
            long num = Long.parseLong(n);
            if (num >= -2147483648L && num <= 2147483647L) {
                System.out.println("int");
                return;
            }
        }

        // Check if number fits in long
        if (n.length() < 20) {
            BigInteger num = new BigInteger(n);
            if (num.compareTo(BigInteger.valueOf(-9223372036854775808L)) >= 0 && num.compareTo(BigInteger.valueOf(9223372036854775807L)) <= 0) {
                System.out.println("long");
                return;
            }
        }

        // If none of the above cases, use BigInteger
        System.out.println("BigInteger");
    }
}

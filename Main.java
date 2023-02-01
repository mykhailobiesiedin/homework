import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choose a number :");
        int arg1 = keyboard.nextInt(2);

        System.out.println("Choose a second number :");
        int arg2 = keyboard.nextInt(2);

        int res = arg1 + arg2;

        System.out.println("Your result :" + Integer.toBinaryString(arg1) + "+" +
                Integer.toBinaryString(arg2) + "=" + res);
        System.out.println("Your result :" + Integer.toBinaryString(arg1) + "+" +
                Integer.toBinaryString(arg2) + "=" + Integer.toBinaryString(res));





    }
}
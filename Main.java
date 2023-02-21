import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dictionary = new Scanner(System.in);
        System.out.println("Enter the word you would like to be translated : ");
        String word = dictionary.next();

        switch (word) {
            case "Window" -> System.out.println("Окно");
            case "Table" -> System.out.println("Стол");
            case "Chair" -> System.out.println("Стул");
            case "Wardrobe" -> System.out.println("Гардероб");
            case "Floor" -> System.out.println("Пол");
            default -> System.out.println("The translation of word " + word + " is absent");
        }
    }
}
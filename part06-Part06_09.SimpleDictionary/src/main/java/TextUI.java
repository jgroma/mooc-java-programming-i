import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            // System.out.println("Command: " + word);
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
                continue;
            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                if (this.dictionary.translate(word) == null) {
                    System.out.println("Translation: null");
                } else {
                    String translation = this.dictionary.translate(word);
                    System.out.println("Translation:" + translation);
                }
                continue;
            } else {
                System.out.println("Unknown command");
                continue;
            }
        }
    }
}

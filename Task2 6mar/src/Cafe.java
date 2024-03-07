import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    ArrayList<String> coffeeMenu = new ArrayList<>();
    public void loadMenuData() {

        File file = new File("coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String coffeeName = scan.nextLine();
                coffeeMenu.add(coffeeName);
                System.out.println(coffeeMenu);;
            }
        } catch (FileNotFoundException e) {
            System.out.println("not found.");
        }
    }
}











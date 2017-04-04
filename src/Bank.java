/**
 * Created by jaradtouchberry on 3/31/17.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    public static Scanner scanner = new Scanner(System.in);
    public static Account currentAccount = new Account();
    public static HashMap<String, Double> users = new HashMap<>();

    ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, To Bank of America.");

        while (true) {
            //  ask the user for their name
            currentAccount.getName();

            //  see if the name exists in the hashmap
            //  users.get(currentAccount.name) == null

            //  if it doesn't, add the name to the hashmap with $100.00
            //  users.put(currentAccount.name, 100.00);

            //  while current user doesn't choose "cancel":
            int currentSelection;

            do {
                // ask a user for some input
                currentSelection = currentAccount.makeSelection();

                // interpret the user command (check balance, withdraw, deposit)
                // based off input, alter user's double in the hashmap.
            } while (currentSelection != 4);
        }
    }
}




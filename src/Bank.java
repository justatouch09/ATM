/**
 * Created by jaradtouchberry on 3/31/17.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    public static Scanner scanner = new Scanner(System.in);
    public static Account currentAccount = new Account();
    public static HashMap<String, Double> users = new HashMap<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, To Bank of America.");
        users.put("Jarad", 100.00);
        users.remove("Jarad");
        users.put("Albert", 100.00);
        users.remove("Jarad");
        users.put("Ben", 100.00);
        users.remove("Ben");

        while (true) {
            //  ask the user for their name///Remove add Account
           currentAccount.getName();

            //  see if the name exists in the hashmap
            if (users.get(currentAccount.name) == null) {
                users.put(currentAccount.name, 100.00);
            }
            //  if it doesn't, add the name to the hashmap with $100.00
            //users.put(currentAccount.name, 100.00);

            //  while current user doesn't choose "cancel":
            int currentSelection;

            do {
                currentSelection = currentAccount.makeSelection();

                if (currentSelection == 1) {
                    System.out.println("Your balance is: " + users.get(currentAccount.name));
                } else if (currentSelection == 2) {
                    System.out.print("Deposit Amount?: ");
                    BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
                    String D = Br.readLine();
                    double J = Double.parseDouble(D);
                    double Balance = users.get(currentAccount.name);
                    users.put(currentAccount.name, Balance + J);

                } else if (currentSelection == 3) {
                    System.out.println("Withdraw Amount: " + users.get(currentAccount.name));
                    BufferedReader Wa = new BufferedReader(new InputStreamReader(System.in));
                    String W = Wa.readLine();
                    double Wr = Double.parseDouble(W);
                    double Withdraw = users.get(currentAccount.name);
                    users.put(currentAccount.name, Withdraw - Wr);
                    //System.out.println("You did withdrawl);

                } else if (currentSelection == 5) {
                    // Add Account
                    System.out.println("Create an Account Name.");
                    String name = Bank.scanner.nextLine();
                    users.put(name,100.00);
                    // ask for new account name
                    // once you get a name, add it to the accounts hash map with a default value
                } else if (currentSelection == 6) {
                    // Remove account.
                    System.out.println("Remove Account.");
                    String name = Bank.scanner.nextLine();
                    users.remove(name);
                    // read in an account name to remove
                    // remove account from hashmap.
                    // account.remove(nameYouReadInFromTheScanner);
                }
                // interpret the user command (check balance, withdraw, deposit)
                // based off input, alter user's double in the hashmap.
            } while (currentSelection != 4);
                System.out.println("________________");
                System.out.println("--  Goodbye!  --");
                System.out.println("________________");

            //boolean validName = true;
            //while(validName== false) {
               // System.out.println("Enter your account name");
            }

            //    String name = Scanner.nextLine();

           // if(users.containsKey(name));


            }

        }





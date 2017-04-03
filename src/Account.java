/**
 * Created by jaradtouchberry on 3/31/17.
 */
public class Account {
    String name;
    String menuEntry;
    String withdrawal;

    public void getName() throws Exception {
        System.out.println("Enter Account Name.");

        name = Bank.scanner.nextLine();

        if (name.isEmpty()) {
            // panic and stop the program.
            throw new Exception("Invalid Name.");
        } else {
            System.out.println("Hello! " + name + ", Welcome to the ATM!\n");
        }
    }

    public void getMenu()throws Exception {
        System.out.println("Please select an Option from the menu!");
        System.out.println("--------------------------------------");
        System.out.println("| Option   [1]   Check Balance       |");
        System.out.println("| Option   [2]   Withdraw Funds      |");
        System.out.println("| Option   [3]   Cancel              |");
        System.out.println("--------------------------------------");
        System.out.println("Please select an option now.");

        menuEntry = Bank.scanner.nextLine();

        if (menuEntry.contains("1")) {
            System.out.println("You have $100.00.");
        }

        else if (menuEntry.contains("2")) {
            System.out.println("How much money would you like to withdrawal?");

            withdrawal = Bank.scanner.nextLine();

//            if (withdrawal.contains("3")) {
                System.out.println("Here is your $" + withdrawal);
//            }
        }else if (menuEntry.contains("3")) {
            System.out.println("Thank you and please come again!");
        } else {
            throw new Exception("INvalid selection");
        }
    }
}
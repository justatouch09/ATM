/**
 * Created by jaradtouchberry on 3/31/17.
 */
public class Account {
    String name;

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

    public int makeSelection() throws Exception {
        System.out.println("Please select an Option from the menu!");
        System.out.println(".------------------------------------,");
        System.out.println("| Option   [1]   Check Balance       |");
        System.out.println("| Option   [2]   Deposit             |");
        System.out.println("| Option   [3]   Withdraw Funds      |");
        System.out.println("| Option   [4]   Log Out             |");
        System.out.println("'------------------------------------'");
        System.out.println("Please select an option now.");

        return Integer.valueOf(Bank.scanner.nextLine());
    }
}
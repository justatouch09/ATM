/**
 * Created by jaradtouchberry on 3/31/17.
 */
import java.util.Scanner;

public class Bank {
    public static Scanner scanner = new Scanner(System.in);

    public static Account account = new Account();


    {

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, To Bank of America.");

        account.getName();

        account.getMenu();
    }
}




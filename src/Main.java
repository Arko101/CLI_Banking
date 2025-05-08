import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       // UserInfo user = new UserInfo("Arko" , 123456 );
        //user.displayUserInfo();
       // user.getCurrentBalance();

        Scanner sc =  new Scanner(System.in);
        UserInfo user = new UserInfo();
        Transaction amount =  new Transaction();

        boolean running = true;

        while(running){
            System.out.println("Enter selection of Choice");
            System.out.println("1. Create User");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Balance");
            System.out.println("5. Credit Card");
            System.out.println("6. Apply for loan");
            System.out.println("7. EXIT");
            int n = sc.nextInt();

            switch(n){
                case 1:
                    //Create user

                    user.setUserName();
                    user.setAccountNumber();
                    user.displayUserInfo();
                    break;

                case 2:
                    //Deposit

                    amount.depositMoney();

                    break;
                case 3:
                    //withdraw
                    //amount = new Transaction(); //do not create new object every time> reruns everything from start, everthing goes back to default
                    amount.withdrawMoney();
                    break;
                case 4:
                    //view Balance
                    //UserInfo balance = new UserInfo();
                    user.getCurrentBalance();

                    break;
                case 5:
                    //credit card
                    break;
                case 6:
                    //loan
                    break;
                case 7:
                    running = false;
                    break;

            }
        }

        }
    }

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Transaction user = new Transaction(); // ✅ Single persistent object

        boolean running = true;

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Create User");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Balance");
            System.out.println("5. Credit Card (Not implemented)");
            System.out.println("6. Apply for loan (Not implemented)");
            System.out.println("7. EXIT");
            System.out.print("Your choice: ");

            int n = sc.nextInt();

            switch (n) {
                case 1:
                    user.setUserName();
                    user.setAccountNumber();
                    break;

                case 2:
                    user.depositMoney();
                    break;

                case 3:
                    user.withdrawMoney();
                    break;

                case 4:
                    user.displayUserInfo(); // prints balance and account info
                    break;

                case 5:
                    System.out.println("Credit Card feature coming soon...");
                    break;

                case 6:
                    System.out.println("Loan feature coming soon...");
                    break;

                case 7:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}*/


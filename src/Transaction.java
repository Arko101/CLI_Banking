import java.util.Scanner;

public class Transaction extends UserInfo{

    Scanner sc = new Scanner(System.in);

    private double depositAmount;
    private double withdrawAmount;

    public double depositMoney(){
        System.out.println("Enter amount to be deposited");
        depositAmount = sc.nextDouble();
        double newBalance = getCurrentBalance() + depositAmount;
        setCurrentBalance(newBalance);
        System.out.println("New balance is "+ getCurrentBalance());
        return getCurrentBalance();
    }

    public double withdrawMoney(){
        System.out.println("Enter amount to be withdrawn");
        withdrawAmount = sc.nextDouble();
        double current = getCurrentBalance();
        double updatedBalance = current - withdrawAmount;
        setCurrentBalance(updatedBalance);
        System.out.println("New balance is "+ updatedBalance);
        return updatedBalance;
    }
}
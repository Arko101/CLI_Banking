
import java.util.Scanner;

public class UserInfo {

    private String userName;
    private int accountNumber;

    Scanner sc = new Scanner(System.in);

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        System.out.println("Enter user name");
        userName = sc.nextLine();
        //this.userName = userName; >>> usrName already assigned
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber() {
        System.out.println("Enter account number");
        accountNumber = sc.nextInt();
        sc.nextLine();
        //this.accountNumber = accountNumber;
    }

    /*public UserInfo(String userName , int accountNumber){
        this.userName = userName;
        this.accountNumber = accountNumber;
        //this.currentBalance = currentBalance;
    }*/
    private double currentBalance = 0.0  ;
    public double getCurrentBalance() {

        return currentBalance;
    }
    public void setCurrentBalance(double currentBalance) {

        this.currentBalance = currentBalance;
    }


    public void displayUserInfo(){
        System.out.println("Username is: " + userName + " Account number of user is: " + accountNumber);
        System.out.println("Current account balance is " + currentBalance);
    }

    }


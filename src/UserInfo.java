public class UserInfo {

    private String userName;
    private int accountNumber;

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    private double currentBalance;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public UserInfo(String userName , int accountNumber){
        this.userName = userName;
        this.accountNumber = accountNumber;
        //this.currentBalance = currentBalance;
    }

    public void displayUserInfo(){
        System.out.println("Username is: " + userName + " Account number of user is: " + accountNumber);
        System.out.println("Current account balance is " + currentBalance);
    }

    }


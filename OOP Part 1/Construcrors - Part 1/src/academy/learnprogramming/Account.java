package academy.learnprogramming;

public class Account {
    private String number;
    private double balance;
    private String costumerName;
    private String costumerEmailAddress;
    private String costumerPhoneNumber;

    public Account() {
        this("56789", 2.50, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called.");
    }

    public Account(String number, double balance, String costumerName,
                   String costumerEmailAddress, String costumerPhoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.number = number;
        this.balance = balance;
        this.costumerName = costumerName;
        this.costumerEmailAddress = costumerEmailAddress;
        this.costumerPhoneNumber = costumerPhoneNumber;
    }

    public Account(String costumerName, String costumerEmailAddress,
                   String costumerPhoneNumber) {
        this("99999", 10.55, costumerName
        , costumerEmailAddress, costumerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getCostumerEmailAddress() {
        return costumerEmailAddress;
    }

    public void setCostumerEmailAddress(String costumerEmailAddress) {
        this.costumerEmailAddress = costumerEmailAddress;
    }

    public String getCostumerPhoneNumber() {
        return costumerPhoneNumber;
    }

    public void setCostumerPhoneNumber(String costumerPhoneNumber) {
        this.costumerPhoneNumber = costumerPhoneNumber;
    }


}

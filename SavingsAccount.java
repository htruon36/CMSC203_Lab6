public class SavingsAccount extends BankAccount{
    static double rate=0.025;
    private int savingsNumber=0;
    private String accountNumber;


    public SavingsAccount(String name, double amount) {
        super(name, amount);
        accountNumber=super.getAccountNumber()+"-"+savingsNumber;    
    }


    SavingsAccount(SavingsAccount yourAccount, int i) {
       super(yourAccount,i);
       this.accountNumber=super.getAccountNumber()+"-"+(yourAccount.savingsNumber+1);
    }
    
    
    void postInterest(){
        double currBalance=super.getBalance();
        double Interest = currBalance*(rate/12);
        super.deposit(Interest);   
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getAccountNumber() {
     return this.accountNumber;
    }
 }

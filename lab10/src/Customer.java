
public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int NumOfAccount;
    public Customer(){
        this("", "");
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString(){
        if(acct[0] != null){
        return firstName + " " +  lastName + " Account has " + NumOfAccount;
        }
        else{
            return firstName + " " + lastName + " doesn't have account.";
        }
        }
    public boolean equals(Customer c){
       return (this.getFirstName().equals(c.getFirstName()))&&(this.getLastName().equals(c.getLastName()));
    }
    public void addAccount(Account ac){
        for(int i=0;i<5;i++){
            if(acct[i] == null){
               acct[i] = ac;
                NumOfAccount += 1;
                break;
            }
        }
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumOfAccount(){
        return NumOfAccount;
    }
    
    public static void main(String[] args) {
 Customer cust = new Customer("Somsri", "Boonjing");
 Account acct1 = new Account(5000, "Somsri01");
 Account acct2 = new Account(3000, "Somsri02");
 cust.addAccount(acct1);
 cust.addAccount(acct2);
 cust.getAccount(0).withdraw(3000);
 cust.getAccount(1).deposit(3000);
 System.out.println(cust);
 for (int i = 0; i < cust.getNumOfAccount(); i++) {
 cust.getAccount(i).showAccount();
 }
}
}

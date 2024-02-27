
import java.util.*;
public class CustomerAPI {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int NumOfAccount;
    public CustomerAPI(){
        this("", "");
    }
    public CustomerAPI(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
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
        if(acct != null){
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
        acct.add(ac);
    }
    public Account getAccount(int index){
        return (Account)acct.get(index);
    }
    public int getNumOfAccount(){
        return acct.size();
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

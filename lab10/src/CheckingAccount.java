
public class CheckingAccount extends Account{
  private double credit;
  public CheckingAccount(){
      super(0,"");
      credit = 0;
  }
  public CheckingAccount(double balance, String name, double credit){
      super(balance, name);
      this.credit = credit;
  }
  public void setCredit(double credit){
      if(credit > 0){
      this.credit = credit;
      }
      else{
          System.out.println("Input number must be a positive integer.");
      }
  }
  public double getCredit(){
      return credit;
  }
  @Override
  public void withdraw(double a){
     if (a > 0){
            if (this.getBalance() > a){
                this.setBalance(this.getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
            else if ((this.getBalance() < a)&&(this.getCredit() > a)) {
                balance = 0;
                this.setCredit(this.getCredit() - a);
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
            else {
                System.out.println("Not enough money!");
            }
        }
  }
  public void withdraw(String a){
      Double a1 = Double.valueOf(a);
      if (a1 > 0){
            if (this.getBalance() > a1){
                this.setBalance(this.getBalance() - a1);
                System.out.println(a1 + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
            else if ((this.getBalance() < a1)&&(this.getCredit() > a1)) {
                balance = 0;
                this.setCredit(this.getCredit() - a1);
                System.out.println(a1 + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
            else {
                System.out.println("Not enough money!");
            }
        }
      }
  @Override
  public String toString(){
      return ("The " + name + " account has " + balance + " baht and " + credit + " credits.");
  }
  }
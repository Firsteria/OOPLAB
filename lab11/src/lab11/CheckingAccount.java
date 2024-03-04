package lab11;


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
  public void withdraw(double a)throws WithdrawException{
     if ( a > 0){
            if ((this.getBalance() - a) >= 0){
                System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
                this.setBalance(this.getBalance() - a);
            }
            else if ((this.getBalance() - a + this.getCredit()) >= 0){
                this.setCredit(this.getCredit() + (this.getBalance() - a));
                System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.getCredit()+".");
                this.setBalance(0);
            }
            else{
                throw new WithdrawException("Account "+this.getName()+" has not enough money!");
            }
        }
  }
  public void withdraw(String a)throws WithdrawException{
     this.withdraw(Double.parseDouble(a));
      }
  @Override
  public String toString(){
      return ("The " + name + " account has " + balance + " baht and " + credit + " credits.");
  }
  }
  
 

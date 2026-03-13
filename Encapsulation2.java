class BankAccount{
    private double balance;
    public void setBalance(double amount){
        if(amount >0){
            balance=amount;
        }
        else{
            System.out.println("Invalid balance amount");
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class Encapsulation2 {
  public static void main(String[] args) {
      BankAccount b=new BankAccount();
    b.setBalance(00);
    System.out.println("current Balance:"+ b.getBalance());
    
  }
}

class Bank{
  public static void main(String[] args){
   BankAccount acc1=new BankAccount();
   System.out.println(acc1.isActive());
   
  if(acc1.isActive())
    System.out.println("active");
  else
   System.out.println("not active");
   
  acc1.setActive(true);
  System.out.println(acc1.isActive()?"active":"!active");

  }
}
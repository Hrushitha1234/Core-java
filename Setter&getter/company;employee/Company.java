class Company{
   public static void main(String[] args){
   
   Employee e1=new Employee();
    e1.display();
    
   e1.setEno(435);
   e1.setEname("Honey");
   e1.setSal(5000);

   e1.display();

   e1.setSal(e1.getSal()+e1.getSal()*20/100);
   System.out.println(e1.getSal());
  }
}

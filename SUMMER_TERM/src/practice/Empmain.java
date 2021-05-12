package practice;



public class Empmain {
public static void main(String[] args) {
Address ad=new Address();
ad.setCity("vijayawada");
ad.setCountry("India");
ad.setState("AP");

Employee e=new Employee();
e.setEmpno(101);
e.setEmpname("karthik");
e.setEmail("k@c.c");
e.setAddress(ad);

System.out.println(e.getAddress().getCity());

}



}
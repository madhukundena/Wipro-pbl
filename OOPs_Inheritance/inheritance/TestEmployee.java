package inheritance;

public class TestEmployee {
 public static void main(String args[])
 {
   Person per=new Person("madhu_kundena");	 
   Employee emp = new Employee(per,1000.00,200,"0432111");
   System.out.println(emp.getPer()+" "+emp.getStart_year()+" "+emp.getAnnual_salary()+" "+emp.getNIN());

 }
}

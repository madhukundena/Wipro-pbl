package inheritance;
public class Employee extends Person{
  Person per;
  static String name;
  private double annual_salary;
  private int start_year;
  private String NIN;
  
  public Employee(Person per, double annual_salary, int start_year, String NIN) {
        super(name);
	    this.per = per;
		this.annual_salary = annual_salary;
		this.start_year = start_year;
		this.NIN = NIN;
	}

  
public String getPer() {
	return per.getName();
}


public void setPer(Person per) {
	this.per = per;
}


public double getAnnual_salary() {
	return annual_salary;
}


public void setAnnual_salary(double annual_salary) {
	this.annual_salary = annual_salary;
}


public int getStart_year() {
	return start_year;
}


public void setStart_year(int start_year) {
	this.start_year = start_year;
}


public String getNIN() {
	return NIN;
}


public void setNIN(String nIN) {
	NIN = nIN;
}




}

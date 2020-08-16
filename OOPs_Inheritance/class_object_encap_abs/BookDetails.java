package class_object_encap_abs;
//encapsulation/abstraction

class Author{
	private String name,email;
	private char gender;
	Author(String name,String email,char gender)
	{
	    this.name=name;
		this.email=email;
		this.gender=gender;
	}
	Author()
	{
		 name="not given";
		 email="not given";
		 gender=' ';
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String name, Author author, double price, int qtyInStock) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author.getName()+" "+author.getEmail()+" "+author.getGender();
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	
	
	}
public class BookDetails
{
	public static void main(String args[])
	{
		Author at=new Author("APJ","apj@gmail.com",'m');	
		Book bk = new Book("Wings of fire",at,99.9,100);
	    System.out.println(bk.getName()+"\n"+bk.getPrice()+"\n"+bk.getQtyInStock()+"\n"+bk.getAuthor());
	}
}


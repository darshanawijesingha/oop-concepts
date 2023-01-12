
class oop {
	
	oop()
	{
		System.out.println(" \n ============================this is the way inheritance working with constructor \n");
	}
	void object() 
	{
		System.out.println("Object is the thing from real world \n  this is the parent class \n");
	}
	
	void clasess(String name) 
	{
		System.out.println("Class is the template definition of the methods and variables in a perticular objects\n");
	}
	
	
	
	public static void main(String [] args) 
	{
		oop ww =new oop();
		ww.object();
		ww.clasess("name  \n");
		
		child cc = new child();
		cc.eyes();
		cc.hair();
		cc.ears();
		cc.genatic();
		
		 //creating instance of Account class  
	    encapsule acc=new encapsule();  
	    //setting values through setter methods  
	    acc.setAcc_no(7560504000L);  
	    acc.setName("Sonoo Jaiswal");  
	    acc.setEmail("sonoojaiswal@javatpoint.com");  
	    acc.setAmount(500000f);  
	    //getting values through getter methods  
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
		
	    abstraction b =new bank();
	    b. interest();
	    
	    polymophism cs =new overridingg();
	    cs.run();
	    polymophism css =new overloadingg();
	    css.compile("saf",12);
	    css.compile("saf");
	}

}
class inheritance extends oop
{
	void intro()
	{
		System.out.println("inheritance is the way to derive a class from another class");
	}
	void hair()
	{
		System.out.println("Black hair");
	}
	void eyes()
	{
		System.out.println("brown eyes");
	}
	void ears()
	{
		System.out.println("point ears      the parent class has ths property but also has child");
	}
		
}
class child extends inheritance
{
	
	void hair()
	{
		System.out.println("Black hair");
	}
	void eyes()
	{
		System.out.println("black eyes         but parent eyes are brown");
	}
	void genatic()
	{
		super.eyes();
		System.out.println("----------------- its work as super as inheritance--");
	}
	
}
class encapsule extends oop
{
	//private data members  
	private long acc_no;  
	private String name,email;  
	private float amount;  
	//public getter and setter methods  
	public long getAcc_no() {  
	    return acc_no;  
	}  
	public void setAcc_no(long acc_no) {  
	    this.acc_no = acc_no;  
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
	public float getAmount() {  
	    return amount;  
	}  
	public void setAmount(float amount) {  
	    this.amount = amount;  
	}  
	  
	
}
abstract class abstraction extends oop
{
	abstract void interest();
}
class bank extends abstraction
{
	void interest()
	{
		System.out.println("\n interest is 10%");
	}
}
class polymophism extends oop
{	
	String name;
	int id;
	
	void run()
	{
		System.out.println("polymophism");
	}
	void compile(String name)
	{
		System.out.println("polymophism");
	}
	void compile(String name,int id)
	{
		System.out.println("polymophism");
	}
}
class overridingg extends polymophism
{
	void run()
	{
		System.out.println("overriding");
	}
	
}
class overloadingg extends polymophism
{
	void compile(String name,int id)
	{
		System.out.println("overloading");
	}
}
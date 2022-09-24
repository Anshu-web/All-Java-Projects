
public class ConstructorExample {

	
	public static void main(String[] args) {
		
		new Emp("anshu",44);
		
	}
	
	
}

class Emp
{
	String name;
	int roll;
	
	public Emp(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	
}

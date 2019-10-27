package stringsInterviewProgram;

public class Employee {
	
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	
	public void display(){
		System.out.println(id +" "+ name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		Address address1=new Address("Hyderabad","rangareddy","Telangana");
		
		Employee e1=new Employee(1, "Manoj", address1);
        e1.display();
	}

}

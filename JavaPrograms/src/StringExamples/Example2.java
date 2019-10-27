package StringExamples;

public class Example2 {
	int rollnum;
	String fname;
	
	Example2(int rollnum, String fname){
		this.rollnum=rollnum;
		this.fname=fname;
	}
	
	public String toString(){//overriding the toString() method  
		  return rollnum+" "+fname; 
		 }  
	
	public static void main(String[] args){
		System.out.println("Heloo");
		
		Example2 e=new Example2(1,"ksk");
		System.out.println(e);
	}

}

package stringsInterviewProgram;

public class Tester1 implements Drawble {
	
	public void draw(){
		System.out.println("Drwable");
	}
	
	public static void main(String[] args){
		
		Drawble t=new Tester1();
		
		t.draw();
		t.msg();
	}

	
	

}

package StringExamples;

import org.testng.annotations.Test;

public class Example4_PrintingAll_Odd_Elements_AssendingOrder {

	@Test
	public void f(){
		String str = "Welcome to Javatpoint portal";   
		
		for(int i=0; i<=str.length()-1; i++){
			if(i%2!=0){
				System.out.println("char At "+i+" place: "+str.charAt(i));
			}
		}
	}
}

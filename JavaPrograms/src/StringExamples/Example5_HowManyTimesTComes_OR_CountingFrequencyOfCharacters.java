package StringExamples;

import org.testng.annotations.Test;

public class Example5_HowManyTimesTComes_OR_CountingFrequencyOfCharacters {

	@Test
	public void f(){
		String str = "Welcome to Javatpoint portal"; 
		int count = 0;
		for(int i=0; i<str.length()-1; i++){
			if(str.charAt(i)=='t'){
				count++;
			}
		}
		
		System.out.println("Number of Times 'T' is available: "+ count);
	}
}

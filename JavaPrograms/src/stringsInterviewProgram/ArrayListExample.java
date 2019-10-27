package stringsInterviewProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayListExample {
	
	int id;
	String name;
	int age;
	
	ArrayListExample(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	ArrayListExample(){
	
	}
	
	
	
	
	void display(){
		System.out.println(id +" "+name+ " "+age);
	}
	
 public static void main(String[] args){
	
	 ArrayListExample a=new ArrayListExample(1,"Maya", 12);	
	 ArrayListExample a1=new ArrayListExample();
	a1.id=a.id;
	a1.name=a.name;
	a1.age=a.age;
	 
	 a.display();
	 a1.display();
	
 }
 }
package stringsInterviewProgram;

public interface Drawble {

	public default  void msg(){
		System.out.println("Drwan");
	}
	
	void draw();
}

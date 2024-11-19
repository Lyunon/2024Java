package ygh.sec02.exam01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		
		Parent parent = new Child();
		m.Check(new Parent());
	}
	
	void Check(Parent parent) {
		parent.ShowInfo();
	}

}

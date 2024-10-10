package ygh.sec04.exam01;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            if(keyCode == 123) {
                break;
            }
        }

        System.out.println("종료");
	}

}

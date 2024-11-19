package ygh.sec01.exam01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button callButton = new Button();
		CallListener callListener = new CallListener();
		callButton.SetOnClickListener(callListener);
		callButton.SetOnClickListener(new CallListener());
		callButton.Touch();
		
		Button messageButton = new Button();
		MessageListener MessageListener = new MessageListener();
		callButton.SetOnClickListener(MessageListener);
		callButton.SetOnClickListener(new MessageListener());
		callButton.Touch();
	}

}

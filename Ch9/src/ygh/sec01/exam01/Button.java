package ygh.sec01.exam01;

public class Button {
	OnClickListener listener;
	
	public void SetOnClickListener(OnClickListener listener)
	{
		this.listener = listener;
	}
	
	public void Touch() {
		if(listener != null)
			listener.OnClick();
	}
	
	public interface OnClickListener {
		void OnClick();
	}
}

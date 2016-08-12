package android.and04;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FullScrollActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		OnClickListener btListener = new OnClickListener() {
			@Override
			public void onClick(View view) {
			Intent intent = new Intent(
			FullScrollActivity.this,
			FrameActivity.class);
			FullScrollActivity.this.startActivity(intent);
			}
			};
			Button btBack_ol = (Button)
			this.findViewById(R.id.button_back_ol);
			btBack_ol.setOnClickListener(btListener);
			/*Button btBack_or = (Button)
			this.findViewById(R.id.button_back_or);
			btBack_or.setOnClickListener(btListener);
			Button btBack_ul = (Button)
			this.findViewById(R.id.button_back_ul);
			btBack_ul.setOnClickListener(btListener);
			Button btBack_ur = (Button)
			this.findViewById(R.id.button_back_ur);
			btBack_ur.setOnClickListener(btListener);*/
		
	}
	
	OnClickListener btClickListener = new OnClickListener()
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
		/*@Override
	public void onClick(View view) {
	Class<? extends Activity> destinationClass =
	null;
	if(((Button)view).equals(btLinear))
	destinationClass = LinearActivity.class;
	else if(((Button)view).equals(btFullScroll))
	destinationClass = FullScrollActivity.class;
	Intent intent = new Intent(FrameActivity.this,
	destinationClass);
	Log.d(TAG, "onClick mit Ziel: "
	+ destinationClass.getSimpleName());
	try {
		FrameActivity.this.startActivity(intent);
		} catch (ActivityNotFoundException anfe) {
		Log.e(TAG, "Button \"" +
		((Button)view).getText()
		+ "\" - " + anfe.toString());
		}
		}*/
	  };
}

package android.and04;

import java.util.Vector;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;

public class AbsoluteActivity extends Activity  {
	private static final String TAG = AbsoluteActivity.class.getSimpleName();
	private Button btLinear, btTable, btRelative, btFrame;
	private Vector<Button> buttons = new Vector<Button>();
	private ImageView ivLinear, ivTable, ivRelative, ivFrame;
	private Vector<ImageView> icons = new Vector<ImageView>();
	private int widthView =
			ViewGroup.LayoutParams.WRAP_CONTENT;
			private int buttonWidth = 230;
			private int iconWidth = 75;
			private int leftBorder = 5;
			private int topBorder = 50;
			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	this.setContentView(R.layout.absolute);
	// alle Views referenzieren und
	// in zwei Vector-Objekte sortieren:
	btLinear = (Button) this.findViewById(R.id.button_llo);
	buttons.add(btLinear);
	btTable = (Button) this.findViewById(R.id.button_tlo);
	buttons.add(btTable);
	btRelative = (Button)this.findViewById(R.id.button_rlo);
	buttons.add(btRelative);
	btFrame = (Button) this.findViewById(R.id.button_flo);
	buttons.add(btFrame);
	btFrame.setOnClickListener(new OnClickListener(){
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			getSizes();
		}
	
	}
	);
	ivLinear = (ImageView) this.findViewById(R.id.icon_llo);
	icons.add(ivLinear);
	ivTable = (ImageView) this.findViewById(R.id.icon_tlo);
	icons.add(ivTable);
	ivRelative = (ImageView)
	this.findViewById(R.id.icon_rlo);
	icons.add(ivRelative);
	ivFrame = (ImageView) this.findViewById(R.id.icon_flo);
	icons.add(ivFrame);
	//this.getSizes();
	this.layout();
	}
	
	private void layout() {
		Display display = this.getWindowManager().getDefaultDisplay();
		int displayWidth = display.getWidth();
		int displayHeight = display.getHeight();
		int x = leftBorder;
		int y = topBorder;
		for (int i = 0; i < icons.size(); i++) {
			if (x + iconWidth + buttonWidth >= displayWidth) {
			x = leftBorder;
			y += iconWidth;
			}
			AbsoluteLayout.LayoutParams layoutParams
			= new AbsoluteLayout.LayoutParams(widthView, widthView, x, y);
			icons.elementAt(i).setLayoutParams(layoutParams);
			x += iconWidth;
			layoutParams = new AbsoluteLayout.LayoutParams(
			widthView, widthView, x, y);
			buttons.elementAt(i).setLayoutParams(layoutParams);
			x += buttonWidth;
			}
			}
	
	// TODO hier noch Logging ergänzen!
	private void getSizes() {
	// Ermittlung der maximalen Button-Breite
	int tempWidth = 0;
	for (Button button : buttons) {
		Log.d(TAG, button.getText() + "-Width: "+ button.getWidth());
	tempWidth = Math.max(tempWidth, button.getWidth());
	}
	
	// Ermittlung der Icon-Größe
	Log.d(TAG, "MaxButtonWidth: " + tempWidth);
	int iconWidth = icons.elementAt(0).getWidth();
	int iconHeight = icons.elementAt(0).getHeight();
	Log.d(TAG, "Icon-Size: " + iconWidth + " x " + iconHeight);

}
}

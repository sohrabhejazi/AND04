package android.and04;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LinearActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_linear);
		//setContentView(R.layout.table);
		//setContentView(R.layout.table2ralative);
		//setContentView(R.layout.relative);
		setContentView(R.layout.aufgabe4);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.linear, menu);
		return true;
	}

}

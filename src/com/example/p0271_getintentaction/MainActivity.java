package com.example.p0271_getintentaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button btnTime;
	Button btnDate;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btnTime = (Button)findViewById(R.id.btnTime);
		btnDate = (Button)findViewById(R.id.btnDate);
		
		btnTime.setOnClickListener(this);
		btnDate.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		
		Intent intent;
		
		switch(v.getId()) {
		
		case R.id.btnTime:
			intent = new Intent("ru.startandroid.intent.action.showtime");
		startActivity(intent);
		break;
		
		case R.id.btnDate:
			intent = new Intent("ru.startandroid.intent.action.showdate");
		startActivity(intent);
		break;
		}
		
	}

}
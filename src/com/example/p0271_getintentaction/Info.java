package com.example.p0271_getintentaction;

import java.sql.Date;
import java.text.SimpleDateFormat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Info extends Activity {

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.info);
	    
	    // otrumyje intent kotruj wuklukaw ce activity
	    Intent intent = getIntent();
	    // chutajemo z niogo action
	    String action = intent.getAction();
	    
	    String format = "", textInfo = "";
	    
	    // w zaleznosti wid action zapownyjemo zminni
	    if (action.equals("ru.startandroid.intent.action.showtime")) { 
	      format = "HH:mm:ss";
	      textInfo = "Time: ";
	    }
	    else if (action.equals("ru.startandroid.intent.action.showdate")) { 
	      format = "dd.MM.yyyy";
	      textInfo = "Date: ";
	    }
	    
	    // w zaleznosti wid wmisty zminnoji format 
	    // otrumyjemo daty abo chas w zminny datetime
	    SimpleDateFormat sdf = new SimpleDateFormat(format);
	    String datetime = sdf.format(new Date(System.currentTimeMillis()));
	    
	    TextView tvDate = (TextView) findViewById(R.id.tvInfo);
	    tvDate.setText(textInfo + datetime);
	  }
	}
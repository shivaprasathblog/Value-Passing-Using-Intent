package com.example.valuepassingusingintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends Activity
{
	TextView tv1,tv2,tv3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2);

		tv1= (TextView) findViewById(R.id.textView1);
		tv2= (TextView) findViewById(R.id.textView2);
		tv3= (TextView) findViewById(R.id.textView3);
		
		Intent i = getIntent();
		
		String name = i.getStringExtra("key_name");
		String place = i.getStringExtra("key_place");
		String age = i.getStringExtra("key_age");
		
		tv1.setText("Your Name is: "+name );
		tv2.setText("Your Place is: "+place );
		tv3.setText("Your Age is: "+age );

	}

}

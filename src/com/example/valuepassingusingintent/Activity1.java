package com.example.valuepassingusingintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends Activity 
{

	EditText et1,et2,et3;
	Button b;
	String name;
	String place;
	String age;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		et1=(EditText)findViewById(R.id.editText1);
		et2=(EditText)findViewById(R.id.editText2);
		et3=(EditText)findViewById(R.id.editText3);
		
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				name=et1.getText().toString();
				place=et2.getText().toString();
				age=et3.getText().toString();
				int age_coversion_to_Integer = Integer.parseInt(age);
				
				
				Intent i = new Intent(Activity1.this,Activity2.class);
				
				i.putExtra("key_name",name);
				i.putExtra("key_place",place);
				i.putExtra("key_age", age);

				startActivity(i);
				
			}
		});
		
	}

	

}

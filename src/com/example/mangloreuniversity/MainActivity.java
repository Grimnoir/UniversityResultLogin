package com.example.mangloreuniversity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
Button jbtn1,jbtn2,jbtn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jbtn1=(Button)findViewById(R.id.button1);
        jbtn2=(Button)findViewById(R.id.button2);
        jbtn3=(Button)findViewById(R.id.button3);
        
        jbtn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			try
			{
				Intent i=new Intent(getApplicationContext(),button1.class);
			    startActivity(i);
			}catch(Exception e)
			{
				Toast.makeText(getApplicationContext(),"Button 1 failded to start"+e.toString(),Toast.LENGTH_LONG).show();
			}
				
			}
        });
        jbtn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i=new Intent(getApplicationContext(),button2.class);
				startActivity(i);
				
			}
		});
        jbtn3.setOnClickListener(new View.OnClickListener() {
			
     			@Override
     			public void onClick(View arg0) {
     				Intent i=new Intent(getApplicationContext(),button3.class);
     				startActivity(i);
     				
     			}
     		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

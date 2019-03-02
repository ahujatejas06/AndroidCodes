package com.example.login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText u, p;
	String s1, s2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		u = (EditText) findViewById(R.id.euser);
		p = (EditText) findViewById(R.id.epass);
	}

	public void login(View v) {
		s1 = u.getText().toString();
		s2 = p.getText().toString();
		if ((s1.contentEquals("abcde")) && (s2.contentEquals("12345"))) {
			Toast.makeText(getApplicationContext(), "Welcome",
					Toast.LENGTH_LONG).show();
			Intent it = new Intent(MainActivity.this,Smsact.class);
			startActivity(it);
		} else {
			Toast.makeText(getApplicationContext(), "Try Again",
					Toast.LENGTH_LONG).show();
		}
	}
}

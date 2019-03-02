package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Smsact extends Activity{
	
	EditText t,n;
	String ts,ns;
	Button bt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.smsactivity);
		t = (EditText)findViewById(R.id.etext);
		n = (EditText)findViewById(R.id.en);
		bt = (Button)findViewById(R.id.bsend);
		
		bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ts = t.getText().toString(); 
				ns = n.getText().toString();
				SmsManager sms = SmsManager.getDefault();
				sms.sendTextMessage(ns, null, ts, null, null);
			}
		});
		
	}

}

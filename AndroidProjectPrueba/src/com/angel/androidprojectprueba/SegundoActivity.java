package com.angel.androidprojectprueba;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SegundoActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segundo_activity);
		
		TextView et_user = (TextView)findViewById(R.id.vistaingresar2);
		TextView et_clave = (TextView)findViewById(R.id.vistadevuelto2);
		
		String textuser = getIntent().getExtras().getString("user");
		String textclave = getIntent().getExtras().getString("clave");
		
		et_user.setText("user: "+textuser);
		et_clave.setText("clave: "+textclave);
		
		Button toast_normal = (Button)findViewById(R.id.toast_normal);
		toast_normal.setOnClickListener(new ToastListener());
		
		Button toast_gravity = (Button)findViewById(R.id.toast_gravity);
		toast_gravity.setOnClickListener(new ToastListener());
		
		Button toast_personalizado = (Button)findViewById(R.id.toast_personalizado);
		toast_personalizado.setOnClickListener(new ToastListener());
		
	}
}

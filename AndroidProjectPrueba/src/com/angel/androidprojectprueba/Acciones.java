package com.angel.androidprojectprueba;

import android.view.View;
import android.view.View.OnClickListener;

public class Acciones implements OnClickListener {
	
	@Override
	public void onClick(View v) 
	{
		String textuser = MainActivity.getTextuser().getText().toString();
		String textclave = MainActivity.getTextclave().getText().toString();
		
		System.out.println("Usuario: "+textuser+" | Clave: "+textclave);
	}

}

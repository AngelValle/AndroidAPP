package com.angel.androidprojectprueba;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class MainActivity extends Activity {

	private static EditText textuser;
	private static EditText textclave;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		textuser = (EditText)findViewById(R.id.textuser);
//		textclave = (EditText)findViewById(R.id.textclave);
//		
//		Button b_registrar = (Button)findViewById(R.id.registrar);
//		b_registrar.setOnClickListener(new Acciones());
//		
//		Button b_loguear = (Button)findViewById(R.id.loguear);
//		b_loguear.setOnClickListener(new Acciones());
		
//		if (savedInstanceState == null) {
//			getFragmentManager().beginTransaction()
//					.add(R.id.container, new PlaceholderFragment()).commit();
//		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		
		switch (id) 
		{
			case R.id.action_close: finish();
				break;
				
			case R.id.action_1: 
				Intent marca = new Intent("android.intent.action.VIEW", Uri.parse("http://www.marca.com"));
				startActivity(marca);
			break;
			
			case R.id.action_2: 
				Intent as = new Intent("android.intent.action.VIEW", Uri.parse("http://www.as.com"));
				startActivity(as);
			break;
			
			case R.id.action_3: 
				Intent elconfidencial = new Intent("android.intent.action.VIEW", Uri.parse("http://www.elconfidencial.com"));
				startActivity(elconfidencial);
			break;
			
			case R.id.action_4: 
				Intent emparejaloscolores = new Intent(this, ActivityParejas.class);
				startActivity(emparejaloscolores);
				break;
				
			case R.id.action_5: 
				Intent eltiempo = new Intent(this, ActivityTiempo.class);
				startActivity(eltiempo);
				break;
//			case R.id.action_settings: return true;
//				break;
//	
			default: return true;
		}
		
		return true;
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

	public void mostrar(View v)
	{
		EditText et_user = (EditText)findViewById(R.id.textuser);
		EditText et_clave = (EditText)findViewById(R.id.textclave);
		
		String textuser = et_user.getText().toString();
		String textclave = et_clave.getText().toString();
		
		Intent i = new Intent(this, SegundoActivity.class);
		i.putExtra("user", textuser);
		i.putExtra("clave", textclave);
		
		System.out.println("Usuario: "+textuser+" | Clave: "+textclave);
		
		startActivity(i);
	}
	
	public static EditText getTextuser() {
		return textuser;
	}

	public static EditText getTextclave() {
		return textclave;
	}
}

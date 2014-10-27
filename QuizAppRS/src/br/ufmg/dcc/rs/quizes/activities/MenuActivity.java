package br.ufmg.dcc.rs.quizes.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	}

	public void acessarAulas(View view) {
		startActivity(new Intent(this, LessonsActivity.class));
	}
	
	public void acessarTreinos(View view) {
		startActivity(new Intent(this, TrainsActivity.class));
	}
	
	public void acessarTorneios(View view) {
		//startActivity(new Intent(this, TorneiosActivity.class));
	}
	
	public void acessarTrofeus(View view) {
		//startActivity(new Intent(this, TrofeusActivity.class));
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

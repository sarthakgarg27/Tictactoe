package com.sarthakgarg27.tictactoe;



import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class Menun extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_menun);
	}
public void start(View v) {
	startActivity(new Intent(Menun.this,Game.class));
	
}
public void hint(View v) {
	AlertDialog.Builder ab=new AlertDialog.Builder(Menun.this);
ab.setTitle("HINT");
ab.setMessage("Players try to place their mark in horizontal ,vertical or diagonal row to win the game ");
ab.show();
	
}
public void about(View v)
{
	AlertDialog.Builder ab=new AlertDialog.Builder(Menun.this);
	ab.setTitle("ABOUT");
	ab.setMessage("HPES ANDROID PROJECT\n"
			+ "BY Sarthak garg ");
	ab.show();	}
public void exit(View v) {
	finish();
System.exit(0);}
}
	


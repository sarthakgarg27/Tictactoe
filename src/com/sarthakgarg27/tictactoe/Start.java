package com.sarthakgarg27.tictactoe;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Start extends Activity implements AnimationListener {
TextView ttt;
Animation anim;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_start);
		ttt=(TextView) findViewById(R.id.ttt);
		ttt.setTextScaleX(1.5f);
		ttt.setTypeface(Typeface.MONOSPACE);
		anim=AnimationUtils.loadAnimation(this,R.anim.zoom_in);
		ttt.startAnimation(anim);
		anim.setAnimationListener(this);
		
	}
	@Override
	public void onAnimationEnd(Animation animation) {
		// TODO Auto-generated method stub
		startActivity(new Intent(Start.this,Menun.class));
		finish();
	}
	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub
		
	}

	

}

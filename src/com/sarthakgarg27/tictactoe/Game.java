package com.sarthakgarg27.tictactoe;



import android.R.layout;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

public class Game extends Activity implements OnClickListener {
int a[]={0,0,0,0,0,0,0,0,0};
int turn=1;
ImageButton one,two,three,four,five,six,seven,eight,nine;
View lay;int count=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_game);
		one=(ImageButton) findViewById(R.id.one);
		two=(ImageButton) findViewById(R.id.two);
		three=(ImageButton) findViewById(R.id.three);
		four=(ImageButton) findViewById(R.id.four);
		five=(ImageButton) findViewById(R.id.five);
		six=(ImageButton) findViewById(R.id.six);
		
		eight=(ImageButton) findViewById(R.id.eight);
		nine=(ImageButton) findViewById(R.id.nine);
		seven=(ImageButton) findViewById(R.id.seven);
		lay=findViewById(R.id.lay);
		
		
	}

	
	public void one(View v)
	{
		if(a[0]==0)
		{
			if(turn==1)
			{
				one.setImageResource(R.drawable.cross);
				turn=2;
				a[0]=1;
				lay.setBackgroundResource(R.drawable.playtwo);
				validate();
				
			}
			else if(turn==2)
			{
				one.setImageResource(R.drawable.zero);
				turn=1;
				a[0]=2;
				lay.setBackgroundResource(R.drawable.playone);
				validate();
			}
			++count;
		}
		else
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("WRONG BLOCK");
			ab.setMessage("block already used ");
			ab.show();
		}
	}
	public void two(View v)
	{
		if(a[1]==0)
		{
			if(turn==1)
			{
				two.setImageResource(R.drawable.cross);
				turn=2;
				a[1]=1;
				lay.setBackgroundResource(R.drawable.playtwo);
				validate();
				
			}
			else if(turn==2)
			{
				two.setImageResource(R.drawable.zero);
				turn=1;
				a[1]=2;
				lay.setBackgroundResource(R.drawable.playone);
				validate();
			}++count;
		}
		else
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("WRONG BLOCK");
			ab.setMessage("block already used ");
			ab.show();
		}
	}
	public void three(View v)
	{
		if(a[2]==0)
		{
			if(turn==1)
			{
				three.setImageResource(R.drawable.cross);
				turn=2;
				a[2]=1;
				lay.setBackgroundResource(R.drawable.playtwo);
				validate();
				
			}
			else if(turn==2)
			{
				three.setImageResource(R.drawable.zero);
				turn=1;
				a[2]=2;
				lay.setBackgroundResource(R.drawable.playone);
				validate();
			}++count;
		}
		else
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("WRONG BLOCK");
			ab.setMessage("block already used ");
			ab.show();
		}
	}
	public void four(View v)
	{
		if(a[3]==0)
		{
			if(turn==1)
			{
				four.setImageResource(R.drawable.cross);
				turn=2;
				a[3]=1;
				lay.setBackgroundResource(R.drawable.playtwo);
				validate();
				
			}
			else if(turn==2)
			{
				four.setImageResource(R.drawable.zero);
				turn=1;
				a[3]=2;
				lay.setBackgroundResource(R.drawable.playone);
				validate();
			}++count;
		}
		else
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("WRONG BLOCK");
			ab.setMessage("block already used ");
			ab.show();
		}
	}
	public void five(View v)
	{
		if(a[4]==0)
		{
			if(turn==1)
			{
				five.setImageResource(R.drawable.cross);
				turn=2;
				a[4]=1;
				lay.setBackgroundResource(R.drawable.playtwo);
				validate();
				
			}
			else if(turn==2)
			{
				five.setImageResource(R.drawable.zero);
				turn=1;
				a[4]=2;
				lay.setBackgroundResource(R.drawable.playone);
				validate();
			}++count;
		}
		else
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("WRONG BLOCK");
			ab.setMessage("block already used ");
			ab.show();
		}
	}
	public void six(View v)
	{
		if(a[5]==0)
		{
			if(turn==1)
			{
				six.setImageResource(R.drawable.cross);
				turn=2;
				a[5]=1;
				lay.setBackgroundResource(R.drawable.playtwo);
				validate();
				
			}
			else if(turn==2)
			{
				six.setImageResource(R.drawable.zero);
				turn=1;
				a[5]=2;
				lay.setBackgroundResource(R.drawable.playone);
				validate();
				
			}++count;
		}
		else
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("WRONG BLOCK");
			ab.setMessage("block already used ");
			ab.show();
		}
	}
	public void seven(View v)
	{
		if(a[6]==0)
		{
			if(turn==1)
			{
				seven.setImageResource(R.drawable.cross);
				turn=2;
				a[6]=1;
				lay.setBackgroundResource(R.drawable.playtwo);
				validate();
				
			}
			else if(turn==2)
			{
				seven.setImageResource(R.drawable.zero);
				turn=1;
				a[6]=2;
				lay.setBackgroundResource(R.drawable.playone);
				validate();
			}++count;
		}
		else
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("WRONG BLOCK");
			ab.setMessage("block already used ");
			ab.show();
		}
	}
	public void eight(View v)
	{
		if(a[7]==0)
		{
			if(turn==1)
			{
				eight.setImageResource(R.drawable.cross);
				turn=2;
				a[7]=1;
				lay.setBackgroundResource(R.drawable.playtwo);validate();
				
			}
			else if(turn==2)
			{
				eight.setImageResource(R.drawable.zero);
				turn=1;
				a[7]=2;
				lay.setBackgroundResource(R.drawable.playone);validate();
			}++count;
		}
		else
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("WRONG BLOCK");
			ab.setMessage("block already used ");
			ab.show();
		}
	}
	public void nine(View v)
	{
		if(a[8]==0)
		{
			if(turn==1)
			{
				nine.setImageResource(R.drawable.cross);
				turn=2;
				a[8]=1;
				lay.setBackgroundResource(R.drawable.playtwo);validate();
				
			}
			else if(turn==2)
			{
				nine.setImageResource(R.drawable.zero);
				turn=1;
				a[8]=2;
				lay.setBackgroundResource(R.drawable.playone);validate();
			}++count;
		}
		else
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("WRONG BLOCK");
			ab.setMessage("block already used ");
			ab.show();
		}
	}
	public void validate()
	{
		if((a[0]==1&&a[1]==1&&a[2]==1)||(a[2]==1&&a[5]==1&&a[8]==1)||(a[6]==1&&a[7]==1&&a[8]==1)||(a[0]==1&&a[3]==1&&a[6]==1)||(a[0]==1&&a[4]==1&&a[8]==1)||(a[2]==1&&a[4]==1&&a[6]==1)||(a[1]==1&&a[4]==1&&a[7]==1)||(a[3]==1&&a[4]==1&&a[5]==1))
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("PLAYER 1 IS WINNER");
			ab.setMessage("back to menu");
			ab.setPositiveButton("ok",new DialogInterface.OnClickListener() {
				
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				startActivity(new Intent(Game.this,Menun.class));
				}
			});
				
			
			ab.show();
			
		}
		else if((a[0]==2&&a[1]==2&&a[2]==2)||(a[2]==2&&a[5]==2&&a[8]==2)||(a[6]==2&&a[7]==2&&a[8]==2)||(a[0]==2&&a[3]==2&&a[6]==2)||(a[0]==2&&a[4]==2&&a[8]==2)||(a[2]==2&&a[4]==2&&a[6]==2)||(a[1]==2&&a[4]==2&&a[7]==2)||(a[3]==2&&a[4]==2&&a[5]==2))
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("PLAYER 2 IS WINNER");
			ab.setMessage("back to menu");
			ab.setPositiveButton("ok",new DialogInterface.OnClickListener() {
				
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				startActivity(new Intent(Game.this,Menun.class));
				}
			});
				
			
			ab.show();
		}
		if(count==8)
		{
			AlertDialog.Builder ab=new AlertDialog.Builder(Game.this);
			ab.setTitle("GAME DRAW");
			ab.setMessage("back to menu");
			ab.setPositiveButton("ok",new DialogInterface.OnClickListener() {
				
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
				startActivity(new Intent(Game.this,Menun.class));
				}
			});
				
			
			ab.show();
		}
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}


}

package com.govchecker;

import com.govchecker.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class OpenAusSearchDroid extends Activity
{
	/** Called when the activity is first created. */

	private Button repbutt;
	private Button senbutt;
	private Button hansbutt;
	private ImageView gcLogo;
	private OpenAusDB dh;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		repbutt = (Button) findViewById(R.id.SearchRep_Reps);
		senbutt = (Button) findViewById(R.id.SearchRep_Senate);
		gcLogo = (ImageView) findViewById(R.id.gcLogo);
		gcLogo.setImageResource(R.drawable.gc);
		hansbutt = (Button) findViewById(R.id.SearchHansard);
		this.dh = new OpenAusDB(this);

		repbutt.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(v.getContext(), SearchRepsActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});

		senbutt.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(v.getContext(), SearchSenate.class);
				startActivityForResult(myIntent, 0);
			}
		});

		hansbutt.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(v.getContext(), SearchHansardActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});

	}
	@Override
	public void onPause()
	{
		super.onPause();
	}


}

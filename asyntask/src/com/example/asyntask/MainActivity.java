package com.example.asyntask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
	private Button button;
	private ProgressBar progressBar;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		button = (Button) findViewById(R.id.button03);
		progressBar = (ProgressBar) findViewById(R.id.progressBar02);
		textView = (TextView) findViewById(R.id.textView01);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				ProgressBarAsyncTask progressBarAsyncTask = new ProgressBarAsyncTask(
						textView, progressBar);
				progressBarAsyncTask.execute(1000);
			}
		});
	}
}

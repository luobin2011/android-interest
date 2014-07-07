package com.example.asyntask;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarAsyncTask extends AsyncTask<Integer, Integer, String> {

	private final TextView textView;
	private final ProgressBar progressBar;

	public ProgressBarAsyncTask(TextView textView, ProgressBar progressBar) {
		this.textView = textView;
		this.progressBar = progressBar;
	}

	@Override
	protected String doInBackground(Integer... params) {
		NetOperator netOperator = new NetOperator();
		int i = 0;
		for (i = 10; i < 100; i += 10) {
			netOperator.operate();
			publishProgress(i);
		}
		return i + params[0].intValue() + "";
	}

	@Override
	protected void onPostExecute(String result) {
		super.onPostExecute(result);
		textView.setText("异步操作执行结束" + result);
	}

	@Override
	protected void onPreExecute() {
		super.onPreExecute();
		textView.setText("开始执行异步线程");
	}

	@Override
	protected void onProgressUpdate(Integer... values) {
		super.onProgressUpdate(values);
		progressBar.setProgress(values[0]);
	}

}

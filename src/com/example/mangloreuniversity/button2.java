package com.example.mangloreuniversity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class button2 extends Activity {
WebView webView2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.button2);
		webView2=(WebView)findViewById(R.id.webview2);
		WebSettings wbsettings2=webView2.getSettings();
		wbsettings2.setJavaScriptEnabled(true);
		webView2.loadUrl("http://52.77.88.220:3331/");
		webView2.setWebViewClient(new WebViewClient());
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}

	
	

}

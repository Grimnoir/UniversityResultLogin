package com.example.mangloreuniversity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class button1 extends Activity {
private WebView webView;

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.button1);
	webView=(WebView)findViewById(R.id.webview1);
	WebSettings wbSettings1=webView.getSettings();
	wbSettings1.setJavaScriptEnabled(true);
	webView.loadUrl("http://52.77.88.220:4422/");
	webView.setWebViewClient(new WebViewClient());
}

@Override
public void onBackPressed() {
	if(webView.canGoBack())
	{
		webView.goBack();
	}else
	{
	super.onBackPressed();
	}
}

}

package com.example.mangloreuniversity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class button3 extends Activity {
WebView webView3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.button3);
webView3=(WebView)findViewById(R.id.webview3);
WebSettings wbsettings3=webView3.getSettings();
wbsettings3.setJavaScriptEnabled(true);
webView3.loadUrl("https://mangaloreuniversity.ac.in/exam-results");
webView3.setWebViewClient(new WebViewClient());
	}

	@Override
	public void onBackPressed() {
		if(webView3.canGoBack())
		{
			webView3.goBack();
		}
		else
		{
		super.onBackPressed();
		}
		}

}

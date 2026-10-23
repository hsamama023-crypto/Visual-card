package com.zain.weddingcard;
import android.app.Activity; import android.os.Bundle; import android.webkit.*;
public class MainActivity extends Activity {
    WebView webView;
    protected void onCreate(Bundle b){
        super.onCreate(b);
        webView = new WebView(this); setContentView(webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl("https://hsamama023-crypto.github.io/Visual-card/");
    }
}

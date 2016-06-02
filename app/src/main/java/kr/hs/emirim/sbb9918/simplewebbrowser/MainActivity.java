package kr.hs.emirim.sbb9918.simplewebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editText;
    Button butMove, butPre;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.edit_url);
        butMove = (Button)findViewById(R.id.but_move);
        butPre = (Button)findViewById(R.id.but_pre);
        web = (WebView)findViewById(R.id.web_view);
        butMove.setOnClickListener(this);
        butPre.setOnClickListener(this);
        web.setWebViewClient(new WebViewClient());
        WebSettings webSet = web.getSettings();
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);
        web.loadUrl("http://www.naver.com");



    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.but_move : web.loadUrl(editText.getText().toString()); break;
            case R.id.but_pre : web.goBack();

        }
    }
}

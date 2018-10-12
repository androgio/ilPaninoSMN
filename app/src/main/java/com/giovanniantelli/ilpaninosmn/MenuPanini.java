package com.giovanniantelli.ilpaninosmn;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;


public class MenuPanini extends AppCompatActivity {

    private WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_panini);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        WebView webView;
        setContentView(R.layout.content_menu_panini);
        webView = (WebView)findViewById(R.id.paniniURL);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.foodora.it/restaurant/s7lm/il-panino-santa-maria-novella");


        /*

        ESEMPIO DI URL DA CARICARE


        myWebView.loadUrl
                ("javascript:(function() { " +
                        "document.getElementsByClassName('header_wrapper')[0].style.display='none'; " +
                        "document.getElementsByClassName('footer-contact')[0].style.display='none'; "+
                        "document.getElementsByClassName('navbar-header')[0].style.display='none'; "+
                        "document.getElementsByClassName('footer-social')[0].style.display='none'; "+
                        "document.getElementById('footer_bottom').style.display='none'; "+
                        "document.getElementById('footer_content').style.display='none'; "+
                        "document.getElementById('core_mobile_menu').style.display='none'; "+
                        "document.getElementById('catapult-cookie-bar').style.display='none'; "+
                        "}
                )()");
                */

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }
}

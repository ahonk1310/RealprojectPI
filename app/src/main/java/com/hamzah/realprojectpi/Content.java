package com.hamzah.realprojectpi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;




public class Content extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        webView = (WebView)findViewById(R.id.webView);

        Intent i = getIntent();
        if(i.getExtras() != null){
            int title = i.getIntExtra("img_id",0);
            switch (title){

                case R.drawable.bumi1:
                    webView.loadUrl("file:///android_asset/bumi.html");
                    break;
                case R.drawable.komet_encke:
                    webView.loadUrl("file:///android_asset/komet_encke.html");
                    break;
                case R.drawable.komet_halley:
                    webView.loadUrl("file:///android_asset/komet_halley.html");
                    break;
                case R.drawable.komet_hyakutake:
                    webView.loadUrl("file:///android_asset/komet_hyakutake.html");
                    break;
                case R.drawable.komet_ikeya_seki:
                    webView.loadUrl("file:///android_asset/komet_ikeya_seki.html");
                    break;
                case R.drawable.komet_kohoutek:
                    webView.loadUrl("file:///android_asset/komet_kohoutek.html");
                    break;
                case R.drawable.merkurius:
                    webView.loadUrl("file:///android_asset/merkurius.html");
                    break;
                case R.drawable.mars:
                    webView.loadUrl("file:///android_asset/mars.html");
                    break;
                case R.drawable.matahari1:
                    webView.loadUrl("file:///android_asset/matahari.html");
                    break;

                case R.drawable.saturnus:
                    webView.loadUrl("file:///android_asset/saturnus.html");
                    break;
                case R.drawable.uranus:
                    webView.loadUrl("file:///android_asset/uranus.html");
                    break;
                case R.drawable.venus:
                    webView.loadUrl("file:///android_asset/venus.html");
                    break;

                case R.drawable.asteroid_pallas:
                    webView.loadUrl("file:///android_asset/Asteroid_Pallas");
                    break;
                case R.drawable.ceres:
                    webView.loadUrl("file:///android_asset/Asteroid_Ceres.html");
                    break;
                case R.drawable.interamnia:
                    webView.loadUrl("file:///android_asset/Asteroid_Interamnia.html");
                    break;
                case R.drawable.vesta1:
                    webView.loadUrl("file:///android_asset/Asteroid_Vesta.html");
                    break;
                case R.drawable.hygiea:
                    webView.loadUrl("file:///android_asset/Asteroid_hygiea.html");
                    break;

                case R.drawable.jupiter_altair:
                    webView.loadUrl("file:///android_asset/jupiter.html");
                    break;

                case R.drawable.neptun1:
                    webView.loadUrl("file:///android_asset/neptun.html");
                    break;
            }

                }
            }

        }

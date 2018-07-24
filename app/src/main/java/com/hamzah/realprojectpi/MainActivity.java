package com.hamzah.realprojectpi;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonmateri = (Button)findViewById(R.id.buttonmateri);
        Button buttonkuis = (Button)findViewById(R.id.buttonkuis);
        Button buttonabout = (Button)findViewById(R.id.buttonabout);
        Button buttonkeluar = (Button)findViewById(R.id.buttonkeluar);

        buttonmateri.setOnClickListener(this);
        buttonkuis.setOnClickListener(this);
        buttonabout.setOnClickListener(this);
        buttonkeluar.setOnClickListener(this);

    }
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Anda yakin ingin keluar?")
                .setCancelable(false)

                .setPositiveButton("Ya", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1)
                    {
                        Intent i = getBaseContext().getPackageManager()
                                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                        moveTaskToBack(true);
                        Process.killProcess(Process.myPid());
                        System.exit(0);}

                })

                .setNegativeButton("Tidak", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int arg1) {
                        dialog.cancel();
                    }
                }).show();
    }
    @Override
    public void onClick(View v) {
        Intent pindah;
        switch (v.getId()){
            case R.id.buttonmateri:
                pindah = new Intent(this, Fragmentactivity.class);
                startActivity(pindah);
                break;
            case R.id.buttonkuis:
                pindah = new Intent(this, QuizActivity.class);
                startActivity(pindah);
                break;
            case R.id.buttonabout:
                startActivity(new Intent(this, about.class));
                break;
            case R.id.buttonkeluar:
                AlertDialog.Builder keluar = new AlertDialog.Builder(MainActivity.this);
                keluar.setMessage("Anda yakin ingin keluar?")
                        .setCancelable(false)
                        .setPositiveButton("Ya", new AlertDialog.OnClickListener()
                        {
                            public void onClick(DialogInterface arg0, int arg1)
                                {
                                    Intent i = getBaseContext().getPackageManager()
                                            .getLaunchIntentForPackage( getBaseContext().getPackageName() );
                                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    startActivity(i);
                                    moveTaskToBack(true);
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                    System.exit(0);}

                        })
                        .setNegativeButton("Tidak", new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface dialog, int arg1) {
                                dialog.cancel();
                            }
                        }).show();
                break;


        }
    }
}

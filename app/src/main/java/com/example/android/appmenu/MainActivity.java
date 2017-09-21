package com.example.android.appmenu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFb(View view){
         String fbPackageName = "com.facebook.katana";
         try {
             lunchApp(fbPackageName);
         }
         catch (Exception e) {
             openPlayStore(fbPackageName);
         }
    }
    public void openWa(View view){
        String whatsAppPackageName = "com.whatsapp";
        try {
            lunchApp(whatsAppPackageName);
        }
        catch (Exception e) {
            openPlayStore(whatsAppPackageName);
        }
    }
    public void openTw(View view){
        String twitterPackageName = "com.twitter.android";
        try {
            lunchApp(twitterPackageName);
        }
         catch (Exception e) {
            openPlayStore(twitterPackageName);
        }
    }
    public void openInsta(View view){
        String instaPackageName = "com.instagram.android";
        try {
            lunchApp(instaPackageName);
        }
        catch (Exception e) {
            openPlayStore(instaPackageName);
        }
    }
    public void openAsk(View view){
        String askPackageName = "com.askfm";
        try {
            lunchApp(askPackageName);
        }
        catch (Exception e) {
            openPlayStore(askPackageName);
        }
    }
    public void openSnap(View view){
        String snapPackageName = "com.snapchat.android";
        try {
            lunchApp(snapPackageName);
        }
        catch (Exception e) {
            openPlayStore(snapPackageName);
        }
    }
    public void openYouTube(View view){
        String youtTubePackageName = "com.google.android.youtube";
        try {
            lunchApp(youtTubePackageName);
        }
        catch (Exception e) {
            openPlayStore(youtTubePackageName);
        }
    }
    public void openQoura(View view){
        String quoraPackageName = "com.quora.android";
        try {
            lunchApp(quoraPackageName);
        }
        catch (Exception e) {
            openPlayStore(quoraPackageName);
        }
    }
    public void openRayesFbPage(View view){
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001001118645"));
            startActivity(intent);
        }
        catch (Exception e) {
            Toast.makeText(this,"Omar ELRayes", Toast.LENGTH_SHORT);
        }
    }
    /**
     * Launch the choosen app's intent using its package name
     * @param packageName the package name for the the app
     */
    public void lunchApp(String packageName){
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        startActivity(launchIntent);
    }

    /**
     * When the app is no where to be found in the device , it opens the playstore directing at the missing app page
     * @param packageName the package name for the app
     */
    public void openPlayStore(String packageName){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id="+packageName));
        startActivity(intent);
    }

}

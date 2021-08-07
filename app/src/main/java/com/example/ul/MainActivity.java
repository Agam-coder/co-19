package com.example.ul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

       @Override
       protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);
              ImageView Button = (ImageView) findViewById(R.id.vn);
              ImageView Button2 = (ImageView) findViewById(R.id.ox);
              ImageView Button3 = (ImageView) findViewById(R.id.rd);
              ImageView Button4 = (ImageView) findViewById(R.id.pla);
              ImageView Button5 = (ImageView) findViewById(R.id.vc);
               ImageView Button6 = (ImageView) findViewById(R.id.am);

              //ImageView Button4 = (ImageView) findViewById(R.id.imageView4);

              Button.setOnClickListener(new OnClickListener() {
                     public void onClick(View view) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            intent.addCategory(Intent.CATEGORY_BROWSABLE);
                            intent.setData(Uri.parse("https://www.covid19resourcesindia.com/search/all/beds"));
                            startActivity(intent);
                     }
              });
              Button2.setOnClickListener(new OnClickListener() {
                     public void onClick(View view) {
                            Intent intent = new Intent();
                            intent.setAction(Intent.ACTION_VIEW);
                            intent.addCategory(Intent.CATEGORY_BROWSABLE);
                            intent.setData(Uri.parse("https://www.covid19resourcesindia.com/search/all/oxygen-cylinders"));
                            startActivity(intent);
                     }
              });
           Button3.setOnClickListener(new OnClickListener() {
               public void onClick(View view) {
                   Intent intent = new Intent();
                   intent.setAction(Intent.ACTION_VIEW);
                   intent.addCategory(Intent.CATEGORY_BROWSABLE);
                   intent.setData(Uri.parse("https://www.covid19resourcesindia.com/search/all/remdesivir"));
                   startActivity(intent);
               }
           });
           Button4.setOnClickListener(new OnClickListener() {
               public void onClick(View view) {
                   Intent intent = new Intent();
                   intent.setAction(Intent.ACTION_VIEW);
                   intent.addCategory(Intent.CATEGORY_BROWSABLE);
                   intent.setData(Uri.parse("https://www.covid19resourcesindia.com/search/all/plasma"));
                   startActivity(intent);
               }
           });
           Button5.setOnClickListener(new OnClickListener() {
               public void onClick(View view) {
                   Intent intent = new Intent();
                   intent.setAction(Intent.ACTION_VIEW);
                   intent.addCategory(Intent.CATEGORY_BROWSABLE);
                   intent.setData(Uri.parse("https://www.covid19resourcesindia.com/search/all/remdesivir"));
                   startActivity(intent);
               }
           });
           Button6.setOnClickListener(new OnClickListener() {
               public void onClick(View view) {
                   Intent intent = new Intent();
                   intent.setAction(Intent.ACTION_VIEW);
                   intent.addCategory(Intent.CATEGORY_BROWSABLE);
                   intent.setData(Uri.parse("https://www.covid19resourcesindia.com/search/all/ambulance"));
                   startActivity(intent);
               }
           });
              //Button4.setOnClickListener(new OnClickListener() {
              //public void onClick(View view) {
              // Intent intent  = new  Intent (MainActivity.this,ScrollingActivity.class);
              //startActivity(intent);

              //}
              // });
       }
}



package com.dev.theblueorb.gsheetjavaapisample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button appendToSheetBtn,readFromSheetBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appendToSheetBtn =(Button) findViewById(R.id.append_to_sheet_btn);
        readFromSheetBtn = (Button) findViewById(R.id.fetch_sheet_btn);


        appendToSheetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, appendToSheetActivity.class);
                startActivity(intent);
            }});
        readFromSheetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SpreadSheetFetcherActivity.class);
                startActivity(intent);
            }});
    }
}

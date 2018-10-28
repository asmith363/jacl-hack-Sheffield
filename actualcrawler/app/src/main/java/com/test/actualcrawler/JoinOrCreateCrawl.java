package com.test.actualcrawler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JoinOrCreateCrawl extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_or_create_crawl);

    }

    public void openJoinCrawl(View view){
        Intent intent = new Intent(this, JoinCrawl.class);
        startActivity(intent);
    }


    public void openCreateCrawl(View view){
        Intent intent = new Intent(this, CreateCrawl.class);
        startActivity(intent);
    }
}

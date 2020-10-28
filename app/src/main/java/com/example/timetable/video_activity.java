package com.example.timetable;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class video_activity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_activity);
        intiviews();
    }
    private void intiviews() {
        Button btnBack = findViewById(R.id.btn_video_back);
        btnBack.setOnClickListener(this);
        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        Button btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        Button btn6 = findViewById(R.id.button6);
        btn6.setOnClickListener(this);
        Button btn7 = findViewById(R.id.button7);
        btn7.setOnClickListener(this);
        Button btn8 = findViewById(R.id.button8);
        btn8.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ketangpai.com/Interact/index/courseid/MDAwMDAwMDAwMLSstZiHqcls.html")));
                break;
            case R.id.button2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ketangpai.com/Interact/index/courseid/MDAwMDAwMDAwMLSssduHqc1p.html")));
                break;
            case R.id.button3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ketangpai.com/Interact/index/courseid/MDAwMDAwMDAwMLSsrZmGz7ex.html")));
                break;
            case R.id.button4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ketangpai.com/Interact/index/courseid/MDAwMDAwMDAwMLSssdyH39Fp.html")));
                break;
            case R.id.button5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ketangpai.com/Interact/index/courseid/MDAwMDAwMDAwMLSssduHqbdo.html")));
                break;
            case R.id.button6:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ketangpai.com/Interact/index/courseid/MDAwMDAwMDAwMLSsrZmGz6do.html")));
                break;
            case R.id.button7:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ketangpai.com/Interact/index/courseid/MDAwMDAwMDAwMLSssdyH39Fs.html")));
                break;
            case R.id.button8:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ketangpai.com/Interact/index/courseid/MDAwMDAwMDAwMLR2z92GudFt.html")));
                break;
            case R.id.btn_video_back:
                finish();
                break;
        }
    }
}
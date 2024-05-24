package com.fabrisayko.generatoresorteggi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.fabrisayko.generatoresorteggi.writing.WritingController;

public class MainActivity extends AppCompatActivity {

    private WritingController writingController = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        writingController = new WritingController(this);
        setContentView(writingController.writingView);
    }
}
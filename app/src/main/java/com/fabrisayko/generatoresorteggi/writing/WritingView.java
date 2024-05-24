package com.fabrisayko.generatoresorteggi.writing;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fabrisayko.generatoresorteggi.writing.inserttext.InsertTextView;

public class WritingView extends LinearLayout {
    private TextView logo = null, title = null, result = null;
    public Button start = null;

    Callback callback = null;
    private InsertTextView insertTextView = null;
    public WritingView(Context context) {
        super(context);

        setLayoutParams(new LayoutParams(-1,-1));
        setBackgroundColor(Color.WHITE);
        setOrientation(VERTICAL);
        setGravity(Gravity.CENTER_HORIZONTAL);

        logo = new TextView(context);
        {
            logo.setLayoutParams(new LayoutParams(-1,100));
            logo.setGravity(Gravity.CENTER);
            logo.setTextColor(Color.BLACK);
            logo.setTextSize(30);
            logo.setTypeface(Typeface.DEFAULT_BOLD);
            logo.setText("Generatore di Sorteggi");
        }
        addView(logo);

        title = new TextView(context);
        {
            title.setLayoutParams(new LayoutParams(-1,100));
            title.setGravity(Gravity.CENTER);
            title.setTextColor(Color.BLACK);
            title.setTextSize(15);
            title.setTypeface(Typeface.DEFAULT_BOLD);
            title.setText("by Fabri & Sayko");
        }
        addView(title);

        insertTextView = new InsertTextView(context);
        addView(insertTextView);

        result = new TextView(context);
        {
            result.setLayoutParams(new LayoutParams(-1,-2));
            result.setGravity(Gravity.CENTER);
            result.setTextColor(Color.BLACK);
            result.setTextSize(15);
            result.setTypeface(Typeface.DEFAULT_BOLD);
        }
        addView(result);

        start = new Button(context);
        {
            LayoutParams params = new LayoutParams(-1,100);
            params.setMargins(100,100,100,100);

            start.setLayoutParams(params);

            start.setText("Start");
            start.setOnClickListener(view -> {
                click();
        }) ;
        }
        addView(start);


    }

    public InsertTextView getInsertTextView() {return  insertTextView; }

    public void setResult(String str) {result.setText(str);}

    public static interface Callback {
        public void onClick();
    }

    public void setCallback(Callback call) {
        callback = call;
    }

    public void click() {
        if (callback != null) callback.onClick();

    }
}

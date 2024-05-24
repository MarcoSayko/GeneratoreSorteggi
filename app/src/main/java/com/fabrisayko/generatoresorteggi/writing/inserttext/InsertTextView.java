package com.fabrisayko.generatoresorteggi.writing.inserttext;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.LinearLayout;

public class InsertTextView extends LinearLayout {

    private EditText editText = null;
    private GradientDrawable drawable = null;
    public InsertTextView(Context context) {
        super(context);
        LayoutParams params = new LayoutParams(-1, 400);
        params.setMargins(40,40,40,40);

        setLayoutParams(params);

        drawable = new GradientDrawable();
        drawable.setColor(Color.GRAY);
        drawable.setCornerRadius(15);

        setBackground(drawable);
        setGravity(Gravity.CENTER);

        editText = new EditText(context);
        editText.setLayoutParams(new LayoutParams(-1,-1));
        editText.setTextColor(Color.WHITE);

        addView(editText);

    }

    public EditText getEditText() { return editText; }
}

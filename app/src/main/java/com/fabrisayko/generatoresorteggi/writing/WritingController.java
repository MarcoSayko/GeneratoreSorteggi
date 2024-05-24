package com.fabrisayko.generatoresorteggi.writing;

import android.content.Context;

import com.fabrisayko.generatoresorteggi.generatore.GeneratoreController;

public class WritingController {
    public WritingView writingView = null;
    public WritingController(Context context) {
        writingView = new WritingView(context);

        writingView.setCallback(new WritingView.Callback() {
            @Override
            public void onClick() {
                String scritto = writingView.getInsertTextView().getEditText().getText().toString();

                scritto = GeneratoreController.generaSorteggi(scritto);

                writingView.setResult(scritto);
            }
        });

    }


}

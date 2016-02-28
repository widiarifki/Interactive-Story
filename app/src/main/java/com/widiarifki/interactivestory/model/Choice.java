package com.widiarifki.interactivestory.model;

/**
 * Created by Widia Rifkianti on 29/02/2016.
 */
public class Choice {
    // this class has 2 main properties
    private int mNextPage;
    private String mText;

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }
}

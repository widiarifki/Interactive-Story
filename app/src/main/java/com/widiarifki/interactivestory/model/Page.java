package com.widiarifki.interactivestory.model;

/**
 * Created by Widia Rifkianti on 28/02/2016.
 */
public class Page {
    // this model has 2 main properties
    // 1. Image of the story
    // 2. Text / Paragraph of the story
    private int mImageId;
    private String mText;
    // Bcos a page possibly has two choices for the next page
    // So create variable with Choice class as object
    private Choice mChoice1;
    private Choice mChoice2;

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}

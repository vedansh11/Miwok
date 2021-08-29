package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mMediaResourceId;
    private int mImageResourceId;
    private boolean Checkid;

    public Word(String DefaultTranslation ,String MiwokTranslation , int ImageResourceId , int MediaResourceId) {
        mDefaultTranslation= DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mMediaResourceId= MediaResourceId;
        // used to check if there is image or not
        Checkid=true;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mMediaResourceId=" + mMediaResourceId +
                ", mImageResourceId=" + mImageResourceId +
                ", Checkid=" + Checkid +
                '}';
    }

    public Word(String DefaultTranslation , String MiwokTranslation , int MediaResourceId) {
        mDefaultTranslation= DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mMediaResourceId=MediaResourceId;
        Checkid=false;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmMediaResourceId() {
        return mMediaResourceId;
    }

    public boolean hasImage(){
        return Checkid;
    }
}

package com.example.android.miwok;

public class word {
     private String mmiwokname;
     private String menglishname;
     private int mMedia;
     private  final int NO_IMAGE_CONSTANT=-1;
     private int mimage=NO_IMAGE_CONSTANT;
   public  word(String miwokname, String englishname,int image, int media)
    {
        mmiwokname=miwokname;
        menglishname=englishname;
        mimage=image;
        mMedia=media;
    }
    public word(String miwokname, String englishname, int media)
    {
        mmiwokname=miwokname;
        menglishname=englishname;
        mMedia=media;
    }

    public String getMenglishname() {
        return menglishname;
    }

    public String getMmiwokname() {
        return mmiwokname;
    }

    public int getMimage() {
        return mimage;
    }

    public boolean hasImage(){ return mimage!=NO_IMAGE_CONSTANT; }

    public int getAudioResourceId() {
        return mMedia;
    }
}

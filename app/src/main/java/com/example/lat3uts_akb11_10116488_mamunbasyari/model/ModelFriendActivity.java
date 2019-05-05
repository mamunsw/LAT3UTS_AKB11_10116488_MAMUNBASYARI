package com.example.lat3uts_akb11_10116488_mamunbasyari.model;

public class ModelFriendActivity {

    private int imgGambarFriend;
    private String txtJudulFriend;

    public ModelFriendActivity(int imgGambarFriend, String txtJudulFriend) {
        this.imgGambarFriend= imgGambarFriend;
        this.txtJudulFriend= txtJudulFriend;

    }


    public String getTxtJudulFriend() {
        return txtJudulFriend;
    }

    public int getImgGambarFriend() {
        return imgGambarFriend;
    }
}
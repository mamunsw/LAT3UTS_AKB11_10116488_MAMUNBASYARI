package com.example.lat3uts_akb11_10116488_mamunbasyari.model;
//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->
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
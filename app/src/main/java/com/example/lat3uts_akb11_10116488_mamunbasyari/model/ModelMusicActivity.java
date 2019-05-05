package com.example.lat3uts_akb11_10116488_mamunbasyari.model;

//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->
public class ModelMusicActivity {

    private String txtJudulMusic;
    private String txtArtisMusic;
    private int imgMusicLagu;
    private int rawAudio;
//    private int rawAudio;

    public ModelMusicActivity(int imgMusicLagu, String txtJudulMusic, String txtArtisMusic, int rawAudio) {
        this.txtJudulMusic = txtJudulMusic;
        this.txtArtisMusic = txtArtisMusic;
        this.imgMusicLagu = imgMusicLagu;
        this.rawAudio = rawAudio;
    }

    public String getTxtJudulMusic() {
        return txtJudulMusic;
    }

    public String getTxtArtisMusic() {
        return txtArtisMusic;
    }


    public int getImgMusicLagu() {
        return imgMusicLagu;
    }

    public int getRawAudio() {
        return rawAudio;
    }
}
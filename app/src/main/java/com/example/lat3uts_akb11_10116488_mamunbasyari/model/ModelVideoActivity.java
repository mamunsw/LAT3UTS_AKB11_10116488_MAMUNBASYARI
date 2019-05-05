package com.example.lat3uts_akb11_10116488_mamunbasyari.model;


//<!-- Nama : Mamun Basyari
//        Nim : 10116488
//        Kelas : AKB11
//        Tgl Kerja : 26-April-2019-->
public class ModelVideoActivity {

    private String txtNamaVideo;
    private String rawVideo;

    public ModelVideoActivity(String txtNamaVideo, String rawVideo) {
        this.txtNamaVideo = txtNamaVideo;
        this.rawVideo = rawVideo;

    }

    public String getTxtNamaVideo() {
        return txtNamaVideo;
    }

    public String getRawVideo() {
        return rawVideo;
    }
}
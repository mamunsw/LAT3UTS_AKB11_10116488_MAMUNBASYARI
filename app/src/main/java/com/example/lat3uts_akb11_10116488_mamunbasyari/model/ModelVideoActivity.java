package com.example.lat3uts_akb11_10116488_mamunbasyari.model;

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
package com.example.lat3uts_akb11_10116488_mamunbasyari.model;

public class ModelDailyActivity {

    private int imgGambarDaily;
    private String txtJudulDaily;

    public ModelDailyActivity(int imgGambarDaily, String txtJudulDaily) {
        this.imgGambarDaily= imgGambarDaily;
        this.txtJudulDaily = txtJudulDaily;

    }


    public String getTxtJudulDaily() {
        return txtJudulDaily;
    }

    public int getImgGambarDaily() {
        return imgGambarDaily;
    }
}
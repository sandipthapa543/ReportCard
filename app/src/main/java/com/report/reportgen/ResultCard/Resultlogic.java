package com.report.reportgen.ResultCard;

public class Resultlogic {
    private String names;
    private Double androidm, iotm, webm;
    Double result;

    String status = "";


    public Resultlogic(String names, Double androidm, Double iotm, Double webm) {
        this.names = names;
        this.androidm = androidm;
        this.iotm = iotm;
        this.webm = webm;
        this.status = status;
    }


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public double getAndroidm() {
        return androidm;
    }

    public void setAndroidm(double androidm) {
        this.androidm = androidm;
    }

    public double getIotm() {
        return iotm;
    }

    public void setIotm(double iotm) {
        this.iotm = iotm;
    }

    public double getWebm() {
        return webm;
    }

    public void setWebm(double webm) {
        this.webm = webm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Double percent() {
        result = ((androidm + iotm + webm) / 3);

        return (result);


    }

    public String condition() {


        if (androidm >= 40 && iotm >= 40 && webm >= 40) {
            status = "Pass";

        } else {
            status = "fail";
        }

return (status);
    }

}




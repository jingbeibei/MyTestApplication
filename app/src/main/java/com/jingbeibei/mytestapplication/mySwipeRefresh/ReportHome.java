package com.jingbeibei.mytestapplication.mySwipeRefresh;

import java.io.Serializable;

/**
 * Created by 景贝贝 on 2016/7/14.
 */
public class ReportHome implements Serializable {
    private String ReportHomeID;
    private String Name;
    private String Sex;
    private String HomeType;
    private String IDNumber;
    public String getReportHomeID() {
        return ReportHomeID;
    }

    public void setReportHomeID(String reportHomeID) {
        ReportHomeID = reportHomeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getHomeType() {
        return HomeType;
    }

    public void setHomeType(String homeType) {
        HomeType = homeType;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }


}

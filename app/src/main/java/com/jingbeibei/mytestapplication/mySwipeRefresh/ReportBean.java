package com.jingbeibei.mytestapplication.mySwipeRefresh;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 景贝贝 on 2016/7/7.
 */
public class ReportBean implements Serializable {

    private String ID,Title, ReportType, Contents, SubmitTime;
    private String Instruction0, Instruction0Time, Instruction1, Instruction1Time, Instruction2, Instruction2Time;

    private String StartTime, EndTime;
    private List<ReportHome> ReportHomes;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<ReportHome> getReportHomes() {
        return ReportHomes;
    }

    public void setReportHomes(List<ReportHome> reportHomes) {
        ReportHomes = reportHomes;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getReportType() {
        return ReportType;
    }

    public void setReportType(String reportType) {
        ReportType = reportType;
    }

    public String getContents() {
        return Contents;
    }

    public void setContents(String contents) {
        Contents = contents;
    }

    public String getSubmitTime() {
        return SubmitTime.substring(0,9);
    }

    public void setSubmitTime(String submitTime) {
        SubmitTime = submitTime.substring(0,9);
    }

    public String getInstruction0() {
        return Instruction0;
    }

    public void setInstruction0(String instruction0) {
        if (instruction0.equals("null")) {
            instruction0 = "审核处理中...";
        } else {
            Instruction0 = instruction0;
        }
    }

    public String getInstruction0Time() {
        if(Instruction0Time!=null){
            Instruction0Time=Instruction0Time.substring(0,9);
        }
        return Instruction0Time;
    }

    public void setInstruction0Time(String instruction0Time) {
        if(instruction0Time.equals("null")){
            instruction0Time="";
        }else{
            Instruction0Time = instruction0Time.substring(0,9);
        }

    }

    public String getInstruction1() {

        return Instruction1;
    }

    public void setInstruction1(String instruction1) {
        if (instruction1.equals("null")) {
            instruction1 = "审核处理中...";
        } else {
            Instruction1 = instruction1;
        }
    }

    public String getInstruction1Time() {
        if(Instruction1Time!=null){
            Instruction1Time=Instruction1Time.substring(0,9);
        }
        return Instruction1Time;
    }

    public void setInstruction1Time(String instruction1Time) {
        if(instruction1Time.equals("null")){
            instruction1Time="";
        }else{
            Instruction1Time = instruction1Time.substring(0,9);
        }
    }

    public String getInstruction2() {
        return Instruction2;
    }

    public void setInstruction2(String instruction2) {
        if (instruction2.equals("null")) {
            instruction2 = "审核处理中...";
        } else {
            Instruction2 = instruction2;
        }
    }

    public String getInstruction2Time() {
        if(Instruction2Time!=null){
            Instruction2Time=Instruction2Time.substring(0,9);
        }
        return Instruction2Time;
    }

    public void setInstruction2Time(String instruction2Time) {
        if(instruction2Time.equals("null")){
            instruction2Time="";
        }else{
            Instruction2Time = instruction2Time.substring(0,9);
        }
    }


    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }
}

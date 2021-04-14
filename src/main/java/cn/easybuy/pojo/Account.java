package cn.easybuy.pojo;

import java.util.Date;

public class Account {
    private int id;
    private String devCode;
    private String devName;
    private String devPassword;
    private String devEmail;
    private String devInfo;
    private int createdBy;
    private Date creationDate;
    private int modifyBy;
    private Date modifyDate;

    public Account() {
    }

    public int getId() {
        return id;
    }

    public String getDevCode() {
        return devCode;
    }

    public String getDevName() {
        return devName;
    }

    public String getDevPassword() {
        return devPassword;
    }

    public String getDevEmail() {
        return devEmail;
    }

    public String getDevInfo() {
        return devInfo;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public int getModifyBy() {
        return modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword;
    }

    public void setDevEmail(String devEmail) {
        this.devEmail = devEmail;
    }

    public void setDevInfo(String devInfo) {
        this.devInfo = devInfo;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Account(int id, String devCode, String devName, String devPassword, String devEmail, String devInfo, int createdBy, Date creationDate, int modifyBy, Date modifyDate) {
        this.id = id;
        this.devCode = devCode;
        this.devName = devName;
        this.devPassword = devPassword;
        this.devEmail = devEmail;
        this.devInfo = devInfo;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;

    }
}

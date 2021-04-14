package cn.easybuy.pojo;

import java.util.Date;

public class Address {

    private int id;
    private String contact;   //  //联系人姓名
    private String addressDesc;   //收货地址明细
    private String postCode;   //邮编
    private String tel;   //联系人电话
    private int createdBy;   //创建者
    private Date creationDate;   //创建时间
    private int modifyBy;   //修改者
    private Date modifyDate;   //修改时间
    private int userId;   //用户ID

    public Address() {
    }

    public Address(int id, String contact, String addressDesc, String postCode, String tel, int createdBy, Date creationDate, int modifyBy, Date modifyDate, int userId) {
        this.id = id;
        this.contact = contact;
        this.addressDesc = addressDesc;
        this.postCode = postCode;
        this.tel = tel;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getContact() {
        return contact;
    }

    public String getAddressDesc() {
        return addressDesc;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getTel() {
        return tel;
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

    public int getUserId() {
        return userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

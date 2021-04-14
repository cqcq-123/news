package cn.easybuy.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    private int id;
    private String billCode;   //账单编码
    private String productName;   //商品名称
    private String productDesc;   //商品描述
    private String productUnit;   //商品单位
    private BigDecimal productCount;   //商品数量
    private BigDecimal totalPrice;   //商品总额
    private int isPayment;   //是否支付
    private int createdBy;   //创建者
    private Date creationDate;   //创建时间
    private int modifyBy;   //更新者
    private Date modifyDate;   //更新时间
    private int providerId;   //供应商ID
    private String billProName;   //供应商名称

    public Bill() {
    }

    public Bill(int id, String billCode, String productName, String productDesc, String productUnit, BigDecimal productCount, BigDecimal totalPrice, int isPayment, int createdBy, Date creationDate, int modifyBy, Date modifyDate, int providerId, String billProName) {
        this.id = id;
        this.billCode = billCode;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productUnit = productUnit;
        this.productCount = productCount;
        this.totalPrice = totalPrice;
        this.isPayment = isPayment;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.providerId = providerId;
        this.billProName = billProName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public void setProductCount(BigDecimal productCount) {
        this.productCount = productCount;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setIsPayment(int isPayment) {
        this.isPayment = isPayment;
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

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public void setBillProName(String billProName) {
        this.billProName = billProName;
    }

    public int getId() {
        return id;
    }

    public String getBillCode() {
        return billCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public BigDecimal getProductCount() {
        return productCount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public int getIsPayment() {
        return isPayment;
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

    public int getProviderId() {
        return providerId;
    }

    public String getBillProName() {
        return billProName;
    }
}

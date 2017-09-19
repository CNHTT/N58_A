package com.extra.n58.model;

import java.io.Serializable;

/**
 * Created by Extra on 2017/9/19.
 * GitHub cnhttt@163.com
 * Work to SZFP
 */
public class TransactionData implements Serializable{
    private Long adminID;
    private  Long  id;
    private String cardId;
    private String amount;
    private String currency;
    private String merchantId;
    private String terminalId;
    private String batchId;
    private String serialNo;
    private String date;
    private String time;
    private String authCode;
    private String sysRefNo;
    private String oldSerialNo="-1";
    private String tType;


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getSysRefNo() {
        return sysRefNo;
    }

    public void setSysRefNo(String sysRefNo) {
        this.sysRefNo = sysRefNo;
    }

    public String getOldSerialNo() {
        return oldSerialNo;
    }

    public void setOldSerialNo(String oldSerialNo) {
        this.oldSerialNo = oldSerialNo;
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }
}

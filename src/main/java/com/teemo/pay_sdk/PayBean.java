package com.teemo.pay_sdk;

public class PayBean {


    /**
     * appid : 应用ID
     * partnerid : 商户号
     * prepayid : 预支付交易会话ID
     * package : Sign=WXPay
     * noncestr : 随机字符串
     * timestamp :
     * sign :
     */

    public String appid;
    public String partnerid;
    public String prepayid;
    public String packageX;
    public String noncestr;
    public String timestamp;
    public String sign;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getPrepayid() {
        return prepayid;
    }

    public void setPrepayid(String prepayid) {
        this.prepayid = prepayid;
    }

    public String getPackageX() {
        return packageX;
    }

    public void setPackageX(String packageX) {
        this.packageX = packageX;
    }

    public String getNoncestr() {
        return noncestr;
    }

    public void setNoncestr(String noncestr) {
        this.noncestr = noncestr;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}

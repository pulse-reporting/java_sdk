package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "localeNo",    "localeName"})
@XmlRootElement(name = "get_acct_plans_m")
public class GetAcctPlansM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "locale_no")
    protected Long localeNo;
        @XmlElement(name = "locale_name")
    protected String localeName;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public Long getLocaleNo() {
        return localeNo;
    }

    public void setLocaleNo(Long value) {
        this.localeNo = value;
    }
            public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String value) {
        this.localeName = value;
    }
            
}

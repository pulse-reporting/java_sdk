package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "startDateRange",    "endDateRange"})
@XmlRootElement(name = "get_all_client_receipt_ids")
public class GetAllClientReceiptIds {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "start_date_range")
    protected String startDateRange;
        @XmlElement(name = "end_date_range")
    protected String endDateRange;
    
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

    public String getStartDateRange() {
        return startDateRange;
    }

    public void setStartDateRange(String value) {
        this.startDateRange = value;
    }
            public String getEndDateRange() {
        return endDateRange;
    }

    public void setEndDateRange(String value) {
        this.endDateRange = value;
    }
            
}

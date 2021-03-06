package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "dunningGroupName",    "dunningGroupDescription",    "clientDunningGroupId",    "dunningProcessNo",    "clientDunningProcessId",    "masterPlansSummary",    "clientReceiptId"})
@XmlRootElement(name = "create_acct_dunning_group_m")
public class CreateAcctDunningGroupM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "dunning_group_name")
    protected String dunningGroupName;
        @XmlElement(name = "dunning_group_description")
    protected String dunningGroupDescription;
        @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
        @XmlElement(name = "dunning_process_no")
    protected Long dunningProcessNo;
        @XmlElement(name = "client_dunning_process_id")
    protected String clientDunningProcessId;
        @XmlElement(name = "master_plans_summary")
    protected MasterPlansSummaryArray masterPlansSummary;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    
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
            public String getDunningGroupName() {
        return dunningGroupName;
    }

    public void setDunningGroupName(String value) {
        this.dunningGroupName = value;
    }
            public String getDunningGroupDescription() {
        return dunningGroupDescription;
    }

    public void setDunningGroupDescription(String value) {
        this.dunningGroupDescription = value;
    }
            public String getClientDunningGroupId() {
        return clientDunningGroupId;
    }

    public void setClientDunningGroupId(String value) {
        this.clientDunningGroupId = value;
    }
            public Long getDunningProcessNo() {
        return dunningProcessNo;
    }

    public void setDunningProcessNo(Long value) {
        this.dunningProcessNo = value;
    }
            public String getClientDunningProcessId() {
        return clientDunningProcessId;
    }

    public void setClientDunningProcessId(String value) {
        this.clientDunningProcessId = value;
    }
            public MasterPlansSummaryArray getMasterPlansSummary() {
        return masterPlansSummary;
    }

    public void setMasterPlansSummary(MasterPlansSummaryArray value) {
        this.masterPlansSummary = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            
}

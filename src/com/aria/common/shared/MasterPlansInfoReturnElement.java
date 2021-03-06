package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plans_info_ReturnElement", propOrder = {"masterPlanInstanceNo", "clientMasterPlanInstanceId", "clientMasterPlanId", "masterPlanNo", "masterPlanInstanceDescription", "dunningGroupNo", "clientDunningGroupId", "dunningGroupName", "dunningGroupDescription", "dunningProcessNo", "clientDunningProcessId", "billingGroupNo", "clientBillingGroupId", "masterPlanInstanceStatus", "mpInstanceStatusLabel", "masterPlanUnits", "respLevelCd", "parentMasterPlanInstNo", "altRateScheduleNo", "clientAltRateScheduleId", "promoCd", "billDay", "lastArrearsBillThruDate", "lastBillDate", "lastBillThruDate", "nextBillDate", "planDate", "statusDate", "masterPlanInstanceBalance", "statusDegradeDate", "recurringBillingInterval", "usageBillingInterval", "initialPlanStatus", "rolloverPlanStatus", "rolloverPlanStatusDuration", "rolloverPlanStatusUomCd", "initFreePeriodDuration", "initFreePeriodUomCd", "dunningState", "dunningStep", "dunningDegradeDate", "planDeprovisionedDate", "couponCodes", "masterPlanProductFields", "mpPlanInstFields", "poNum", "suppPlansInfo"})
public class MasterPlansInfoReturnElement {

    @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
    @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
    @XmlElement(name = "client_master_plan_id")
    protected String clientMasterPlanId;
    @XmlElement(name = "master_plan_no")
    protected Long masterPlanNo;
    @XmlElement(name = "master_plan_instance_description")
    protected String masterPlanInstanceDescription;
    @XmlElement(name = "dunning_group_no")
    protected Long dunningGroupNo;
    @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
    @XmlElement(name = "dunning_group_name")
    protected String dunningGroupName;
    @XmlElement(name = "dunning_group_description")
    protected String dunningGroupDescription;
    @XmlElement(name = "dunning_process_no")
    protected Long dunningProcessNo;
    @XmlElement(name = "client_dunning_process_id")
    protected String clientDunningProcessId;
    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
    @XmlElement(name = "master_plan_instance_status")
    protected Long masterPlanInstanceStatus;
    @XmlElement(name = "mp_instance_status_label")
    protected String mpInstanceStatusLabel;
    @XmlElement(name = "master_plan_units")
    protected Long masterPlanUnits;
    @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
    @XmlElement(name = "parent_master_plan_inst_no")
    protected Long parentMasterPlanInstNo;
    @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
    @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
    @XmlElement(name = "promo_cd")
    protected String promoCd;
    @XmlElement(name = "bill_day")
    protected Long billDay;
    @XmlElement(name = "last_arrears_bill_thru_date")
    protected String lastArrearsBillThruDate;
    @XmlElement(name = "last_bill_date")
    protected String lastBillDate;
    @XmlElement(name = "last_bill_thru_date")
    protected String lastBillThruDate;
    @XmlElement(name = "next_bill_date")
    protected String nextBillDate;
    @XmlElement(name = "plan_date")
    protected String planDate;
    @XmlElement(name = "status_date")
    protected String statusDate;
    @XmlElement(name = "master_plan_instance_balance")
    protected Double masterPlanInstanceBalance;
    @XmlElement(name = "status_degrade_date")
    protected String statusDegradeDate;
    @XmlElement(name = "recurring_billing_interval")
    protected Long recurringBillingInterval;
    @XmlElement(name = "usage_billing_interval")
    protected Long usageBillingInterval;
    @XmlElement(name = "initial_plan_status")
    protected Long initialPlanStatus;
    @XmlElement(name = "rollover_plan_status")
    protected Long rolloverPlanStatus;
    @XmlElement(name = "rollover_plan_status_duration")
    protected Long rolloverPlanStatusDuration;
    @XmlElement(name = "rollover_plan_status_uom_cd")
    protected Long rolloverPlanStatusUomCd;
    @XmlElement(name = "init_free_period_duration")
    protected Long initFreePeriodDuration;
    @XmlElement(name = "init_free_period_uom_cd")
    protected String initFreePeriodUomCd;
    @XmlElement(name = "dunning_state")
    protected Long dunningState;
    @XmlElement(name = "dunning_step")
    protected Long dunningStep;
    @XmlElement(name = "dunning_degrade_date")
    protected String dunningDegradeDate;
    @XmlElement(name = "plan_deprovisioned_date")
    protected String planDeprovisionedDate;
    @XmlElement(name = "coupon_codes")
    protected List<CouponCodesReturnElement> couponCodes;
    @XmlElement(name = "master_plan_product_fields")
    protected List<MasterPlanProductFieldsReturnElement> masterPlanProductFields;
    @XmlElement(name = "mp_plan_inst_fields")
    protected List<MpPlanInstFieldsReturnElement> mpPlanInstFields;
    @XmlElement(name = "po_num")
    protected String poNum;
    @XmlElement(name = "supp_plans_info")
    protected List<SuppPlansInfoReturnElement> suppPlansInfo;
    
    public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }

    public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }

    public String getClientMasterPlanId() {
        return clientMasterPlanId;
    }

    public void setClientMasterPlanId(String value) {
        this.clientMasterPlanId = value;
    }

    public Long getMasterPlanNo() {
        return masterPlanNo;
    }

    public void setMasterPlanNo(Long value) {
        this.masterPlanNo = value;
    }

    public String getMasterPlanInstanceDescription() {
        return masterPlanInstanceDescription;
    }

    public void setMasterPlanInstanceDescription(String value) {
        this.masterPlanInstanceDescription = value;
    }

    public Long getDunningGroupNo() {
        return dunningGroupNo;
    }

    public void setDunningGroupNo(Long value) {
        this.dunningGroupNo = value;
    }

    public String getClientDunningGroupId() {
        return clientDunningGroupId;
    }

    public void setClientDunningGroupId(String value) {
        this.clientDunningGroupId = value;
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

    public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }

    public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
    }

    public Long getMasterPlanInstanceStatus() {
        return masterPlanInstanceStatus;
    }

    public void setMasterPlanInstanceStatus(Long value) {
        this.masterPlanInstanceStatus = value;
    }

    public String getMpInstanceStatusLabel() {
        return mpInstanceStatusLabel;
    }

    public void setMpInstanceStatusLabel(String value) {
        this.mpInstanceStatusLabel = value;
    }

    public Long getMasterPlanUnits() {
        return masterPlanUnits;
    }

    public void setMasterPlanUnits(Long value) {
        this.masterPlanUnits = value;
    }

    public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }

    public Long getParentMasterPlanInstNo() {
        return parentMasterPlanInstNo;
    }

    public void setParentMasterPlanInstNo(Long value) {
        this.parentMasterPlanInstNo = value;
    }

    public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }

    public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }

    public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }

    public Long getBillDay() {
        return billDay;
    }

    public void setBillDay(Long value) {
        this.billDay = value;
    }

    public String getLastArrearsBillThruDate() {
        return lastArrearsBillThruDate;
    }

    public void setLastArrearsBillThruDate(String value) {
        this.lastArrearsBillThruDate = value;
    }

    public String getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(String value) {
        this.lastBillDate = value;
    }

    public String getLastBillThruDate() {
        return lastBillThruDate;
    }

    public void setLastBillThruDate(String value) {
        this.lastBillThruDate = value;
    }

    public String getNextBillDate() {
        return nextBillDate;
    }

    public void setNextBillDate(String value) {
        this.nextBillDate = value;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String value) {
        this.planDate = value;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String value) {
        this.statusDate = value;
    }

    public Double getMasterPlanInstanceBalance() {
        return masterPlanInstanceBalance;
    }

    public void setMasterPlanInstanceBalance(Double value) {
        this.masterPlanInstanceBalance = value;
    }

    public String getStatusDegradeDate() {
        return statusDegradeDate;
    }

    public void setStatusDegradeDate(String value) {
        this.statusDegradeDate = value;
    }

    public Long getRecurringBillingInterval() {
        return recurringBillingInterval;
    }

    public void setRecurringBillingInterval(Long value) {
        this.recurringBillingInterval = value;
    }

    public Long getUsageBillingInterval() {
        return usageBillingInterval;
    }

    public void setUsageBillingInterval(Long value) {
        this.usageBillingInterval = value;
    }

    public Long getInitialPlanStatus() {
        return initialPlanStatus;
    }

    public void setInitialPlanStatus(Long value) {
        this.initialPlanStatus = value;
    }

    public Long getRolloverPlanStatus() {
        return rolloverPlanStatus;
    }

    public void setRolloverPlanStatus(Long value) {
        this.rolloverPlanStatus = value;
    }

    public Long getRolloverPlanStatusDuration() {
        return rolloverPlanStatusDuration;
    }

    public void setRolloverPlanStatusDuration(Long value) {
        this.rolloverPlanStatusDuration = value;
    }

    public Long getRolloverPlanStatusUomCd() {
        return rolloverPlanStatusUomCd;
    }

    public void setRolloverPlanStatusUomCd(Long value) {
        this.rolloverPlanStatusUomCd = value;
    }

    public Long getInitFreePeriodDuration() {
        return initFreePeriodDuration;
    }

    public void setInitFreePeriodDuration(Long value) {
        this.initFreePeriodDuration = value;
    }

    public String getInitFreePeriodUomCd() {
        return initFreePeriodUomCd;
    }

    public void setInitFreePeriodUomCd(String value) {
        this.initFreePeriodUomCd = value;
    }

    public Long getDunningState() {
        return dunningState;
    }

    public void setDunningState(Long value) {
        this.dunningState = value;
    }

    public Long getDunningStep() {
        return dunningStep;
    }

    public void setDunningStep(Long value) {
        this.dunningStep = value;
    }

    public String getDunningDegradeDate() {
        return dunningDegradeDate;
    }

    public void setDunningDegradeDate(String value) {
        this.dunningDegradeDate = value;
    }

    public String getPlanDeprovisionedDate() {
        return planDeprovisionedDate;
    }

    public void setPlanDeprovisionedDate(String value) {
        this.planDeprovisionedDate = value;
    }

    public List<CouponCodesReturnElement> getCouponCodes() {
        if (this.couponCodes == null) {
            this.couponCodes = new ArrayList<CouponCodesReturnElement>();
        }
        return this.couponCodes;
    }public List<MasterPlanProductFieldsReturnElement> getMasterPlanProductFields() {
        if (this.masterPlanProductFields == null) {
            this.masterPlanProductFields = new ArrayList<MasterPlanProductFieldsReturnElement>();
        }
        return this.masterPlanProductFields;
    }public List<MpPlanInstFieldsReturnElement> getMpPlanInstFields() {
        if (this.mpPlanInstFields == null) {
            this.mpPlanInstFields = new ArrayList<MpPlanInstFieldsReturnElement>();
        }
        return this.mpPlanInstFields;
    }public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String value) {
        this.poNum = value;
    }

    public List<SuppPlansInfoReturnElement> getSuppPlansInfo() {
        if (this.suppPlansInfo == null) {
            this.suppPlansInfo = new ArrayList<SuppPlansInfoReturnElement>();
        }
        return this.suppPlansInfo;
    }
}

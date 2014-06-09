package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_client_plans_ReturnElement", propOrder = {"planNo", "planName", "planDesc", "suppPlanInd", "billingInterval", "billingInd", "displayInd", "rolloverMonths", "rolloverPlanNo", "earlyCancelFee", "earlyCancelMinMonths", "suspensionPeriod", "newAcctStatus", "rolloverAcctStatus", "rolloverAcctStatusDays", "initFreeMonths", "plan2AssignOnSusp", "defaultNotifyMethod", "prepaidInd", "currencyCd", "clientPlanId", "clientRolloverPlanId", "planServices", "planRateSchedules", "planGroups", "promotionalPlanSets", "parentPlans", "planSuppFields", "firstRetrievalLevelInd", "childPlanNo"})
public class AllClientPlansReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_desc")
    protected String planDesc;
    @XmlElement(name = "supp_plan_ind")
    protected Long suppPlanInd;
    @XmlElement(name = "billing_interval")
    protected Long billingInterval;
    @XmlElement(name = "billing_ind")
    protected Long billingInd;
    @XmlElement(name = "display_ind")
    protected Long displayInd;
    @XmlElement(name = "rollover_months")
    protected Long rolloverMonths;
    @XmlElement(name = "rollover_plan_no")
    protected Long rolloverPlanNo;
    @XmlElement(name = "early_cancel_fee")
    protected Double earlyCancelFee;
    @XmlElement(name = "early_cancel_min_months")
    protected Long earlyCancelMinMonths;
    @XmlElement(name = "suspension_period")
    protected Long suspensionPeriod;
    @XmlElement(name = "new_acct_status")
    protected Long newAcctStatus;
    @XmlElement(name = "rollover_acct_status")
    protected Long rolloverAcctStatus;
    @XmlElement(name = "rollover_acct_status_days")
    protected Long rolloverAcctStatusDays;
    @XmlElement(name = "init_free_months")
    protected Long initFreeMonths;
    @XmlElement(name = "plan_2_assign_on_susp")
    protected Long plan2AssignOnSusp;
    @XmlElement(name = "default_notify_method")
    protected Long defaultNotifyMethod;
    @XmlElement(name = "prepaid_ind")
    protected Long prepaidInd;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "client_rollover_plan_id")
    protected String clientRolloverPlanId;
    @XmlElement(name = "plan_services")
    protected List<PlanServicesReturnElement> planServices;
    @XmlElement(name = "plan_rate_schedules")
    protected List<PlanRateSchedulesReturnElement> planRateSchedules;
    @XmlElement(name = "plan_groups")
    protected List<PlanGroupsReturnElement> planGroups;
    @XmlElement(name = "promotional_plan_sets")
    protected List<PromotionalPlanSetsReturnElement> promotionalPlanSets;
    @XmlElement(name = "parent_plans")
    protected List<ParentPlansReturnElement> parentPlans;
    @XmlElement(name = "plan_supp_fields")
    protected List<PlanSuppFieldsReturnElement> planSuppFields;
    @XmlElement(name = "first_retrieval_level_ind")
    protected String firstRetrievalLevelInd;
    @XmlElement(name = "child_plan_no")
    protected List<ChildPlanNoReturnElement> childPlanNo;
    
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public String getPlanDesc() {
        return planDesc;
    }

    public void setPlanDesc(String value) {
        this.planDesc = value;
    }

    public Long getSuppPlanInd() {
        return suppPlanInd;
    }

    public void setSuppPlanInd(Long value) {
        this.suppPlanInd = value;
    }

    public Long getBillingInterval() {
        return billingInterval;
    }

    public void setBillingInterval(Long value) {
        this.billingInterval = value;
    }

    public Long getBillingInd() {
        return billingInd;
    }

    public void setBillingInd(Long value) {
        this.billingInd = value;
    }

    public Long getDisplayInd() {
        return displayInd;
    }

    public void setDisplayInd(Long value) {
        this.displayInd = value;
    }

    public Long getRolloverMonths() {
        return rolloverMonths;
    }

    public void setRolloverMonths(Long value) {
        this.rolloverMonths = value;
    }

    public Long getRolloverPlanNo() {
        return rolloverPlanNo;
    }

    public void setRolloverPlanNo(Long value) {
        this.rolloverPlanNo = value;
    }

    public Double getEarlyCancelFee() {
        return earlyCancelFee;
    }

    public void setEarlyCancelFee(Double value) {
        this.earlyCancelFee = value;
    }

    public Long getEarlyCancelMinMonths() {
        return earlyCancelMinMonths;
    }

    public void setEarlyCancelMinMonths(Long value) {
        this.earlyCancelMinMonths = value;
    }

    public Long getSuspensionPeriod() {
        return suspensionPeriod;
    }

    public void setSuspensionPeriod(Long value) {
        this.suspensionPeriod = value;
    }

    public Long getNewAcctStatus() {
        return newAcctStatus;
    }

    public void setNewAcctStatus(Long value) {
        this.newAcctStatus = value;
    }

    public Long getRolloverAcctStatus() {
        return rolloverAcctStatus;
    }

    public void setRolloverAcctStatus(Long value) {
        this.rolloverAcctStatus = value;
    }

    public Long getRolloverAcctStatusDays() {
        return rolloverAcctStatusDays;
    }

    public void setRolloverAcctStatusDays(Long value) {
        this.rolloverAcctStatusDays = value;
    }

    public Long getInitFreeMonths() {
        return initFreeMonths;
    }

    public void setInitFreeMonths(Long value) {
        this.initFreeMonths = value;
    }

    public Long getPlan2AssignOnSusp() {
        return plan2AssignOnSusp;
    }

    public void setPlan2AssignOnSusp(Long value) {
        this.plan2AssignOnSusp = value;
    }

    public Long getDefaultNotifyMethod() {
        return defaultNotifyMethod;
    }

    public void setDefaultNotifyMethod(Long value) {
        this.defaultNotifyMethod = value;
    }

    public Long getPrepaidInd() {
        return prepaidInd;
    }

    public void setPrepaidInd(Long value) {
        this.prepaidInd = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public String getClientRolloverPlanId() {
        return clientRolloverPlanId;
    }

    public void setClientRolloverPlanId(String value) {
        this.clientRolloverPlanId = value;
    }

    public List<PlanServicesReturnElement> getPlanServices() {
        if (this.planServices == null) {
            this.planServices = new ArrayList<PlanServicesReturnElement>();
        }
        return this.planServices;
    }public List<PlanRateSchedulesReturnElement> getPlanRateSchedules() {
        if (this.planRateSchedules == null) {
            this.planRateSchedules = new ArrayList<PlanRateSchedulesReturnElement>();
        }
        return this.planRateSchedules;
    }public List<PlanGroupsReturnElement> getPlanGroups() {
        if (this.planGroups == null) {
            this.planGroups = new ArrayList<PlanGroupsReturnElement>();
        }
        return this.planGroups;
    }public List<PromotionalPlanSetsReturnElement> getPromotionalPlanSets() {
        if (this.promotionalPlanSets == null) {
            this.promotionalPlanSets = new ArrayList<PromotionalPlanSetsReturnElement>();
        }
        return this.promotionalPlanSets;
    }public List<ParentPlansReturnElement> getParentPlans() {
        if (this.parentPlans == null) {
            this.parentPlans = new ArrayList<ParentPlansReturnElement>();
        }
        return this.parentPlans;
    }public List<PlanSuppFieldsReturnElement> getPlanSuppFields() {
        if (this.planSuppFields == null) {
            this.planSuppFields = new ArrayList<PlanSuppFieldsReturnElement>();
        }
        return this.planSuppFields;
    }public String getFirstRetrievalLevelInd() {
        return firstRetrievalLevelInd;
    }

    public void setFirstRetrievalLevelInd(String value) {
        this.firstRetrievalLevelInd = value;
    }

    public List<ChildPlanNoReturnElement> getChildPlanNo() {
        if (this.childPlanNo == null) {
            this.childPlanNo = new ArrayList<ChildPlanNoReturnElement>();
        }
        return this.childPlanNo;
    }
}

package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_client_plans_services_ReturnElement", propOrder = {"parentPlanInstanceNo", "parentClientPlanInstanceId", "planNo", "clientPlanId", "planName", "planDesc", "suppPlanInd", "billingInd", "displayInd", "rolloverMonths", "rolloverPlanNo", "clientRolloverPlanId", "earlyCancelFee", "earlyCancelMinMonths", "suspensionPeriod", "newPlanStatus", "rolloverPlanStatus", "rolloverPlanStatusDays", "initFreeMonths", "plan2AssignOnSusp", "clientPlan2AssignOnSusp", "defaultNotifyMethod", "prepaidInd", "currencyCd", "rolloverPlanDuration", "rolloverPlanUomCd", "initFreePeriodDuration", "initFreePeriodUomCd", "initialPlanStatusCd", "rolloverPlanStatusDuration", "rolloverPlanStatusUomCd", "rolloverPlanStatusCd", "planServices", "planRateSchedulesDetails", "contractRolloverPlanNo", "contractRolloverClientPlanId", "contractRolloverRateSched"})
public class AllClientPlansServicesReturnElement {

    @XmlElement(name = "parent_plan_instance_no")
    protected Long parentPlanInstanceNo;
    @XmlElement(name = "parent_client_plan_instance_id")
    protected String parentClientPlanInstanceId;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_desc")
    protected String planDesc;
    @XmlElement(name = "supp_plan_ind")
    protected Long suppPlanInd;
    @XmlElement(name = "billing_ind")
    protected Long billingInd;
    @XmlElement(name = "display_ind")
    protected Long displayInd;
    @XmlElement(name = "rollover_months")
    protected Long rolloverMonths;
    @XmlElement(name = "rollover_plan_no")
    protected Long rolloverPlanNo;
    @XmlElement(name = "client_rollover_plan_id")
    protected String clientRolloverPlanId;
    @XmlElement(name = "early_cancel_fee")
    protected Double earlyCancelFee;
    @XmlElement(name = "early_cancel_min_months")
    protected Long earlyCancelMinMonths;
    @XmlElement(name = "suspension_period")
    protected Long suspensionPeriod;
    @XmlElement(name = "new_plan_status")
    protected Long newPlanStatus;
    @XmlElement(name = "rollover_plan_status")
    protected Long rolloverPlanStatus;
    @XmlElement(name = "rollover_plan_status_days")
    protected Long rolloverPlanStatusDays;
    @XmlElement(name = "init_free_months")
    protected Long initFreeMonths;
    @XmlElement(name = "plan_2_assign_on_susp")
    protected Long plan2AssignOnSusp;
    @XmlElement(name = "client_plan_2_assign_on_susp")
    protected String clientPlan2AssignOnSusp;
    @XmlElement(name = "default_notify_method")
    protected Long defaultNotifyMethod;
    @XmlElement(name = "prepaid_ind")
    protected Long prepaidInd;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "rollover_plan_duration")
    protected String rolloverPlanDuration;
    @XmlElement(name = "rollover_plan_uom_cd")
    protected Long rolloverPlanUomCd;
    @XmlElement(name = "init_free_period_duration")
    protected Long initFreePeriodDuration;
    @XmlElement(name = "init_free_period_uom_cd")
    protected String initFreePeriodUomCd;
    @XmlElement(name = "initial_plan_status_cd")
    protected Long initialPlanStatusCd;
    @XmlElement(name = "rollover_plan_status_duration")
    protected Long rolloverPlanStatusDuration;
    @XmlElement(name = "rollover_plan_status_uom_cd")
    protected Long rolloverPlanStatusUomCd;
    @XmlElement(name = "rollover_plan_status_cd")
    protected Long rolloverPlanStatusCd;
    @XmlElement(name = "plan_services")
    protected List<PlanServicesReturnElement> planServices;
    @XmlElement(name = "plan_rate_schedules_details")
    protected List<PlanRateSchedulesDetailsReturnElement> planRateSchedulesDetails;
    @XmlElement(name = "contract_rollover_plan_no")
    protected Long contractRolloverPlanNo;
    @XmlElement(name = "contract_rollover_client_plan_id")
    protected String contractRolloverClientPlanId;
    @XmlElement(name = "contract_rollover_rate_sched")
    protected List<ContractRolloverRateSchedReturnElement> contractRolloverRateSched;
    
    public Long getParentPlanInstanceNo() {
        return parentPlanInstanceNo;
    }

    public void setParentPlanInstanceNo(Long value) {
        this.parentPlanInstanceNo = value;
    }

    public String getParentClientPlanInstanceId() {
        return parentClientPlanInstanceId;
    }

    public void setParentClientPlanInstanceId(String value) {
        this.parentClientPlanInstanceId = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
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

    public String getClientRolloverPlanId() {
        return clientRolloverPlanId;
    }

    public void setClientRolloverPlanId(String value) {
        this.clientRolloverPlanId = value;
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

    public Long getNewPlanStatus() {
        return newPlanStatus;
    }

    public void setNewPlanStatus(Long value) {
        this.newPlanStatus = value;
    }

    public Long getRolloverPlanStatus() {
        return rolloverPlanStatus;
    }

    public void setRolloverPlanStatus(Long value) {
        this.rolloverPlanStatus = value;
    }

    public Long getRolloverPlanStatusDays() {
        return rolloverPlanStatusDays;
    }

    public void setRolloverPlanStatusDays(Long value) {
        this.rolloverPlanStatusDays = value;
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

    public String getClientPlan2AssignOnSusp() {
        return clientPlan2AssignOnSusp;
    }

    public void setClientPlan2AssignOnSusp(String value) {
        this.clientPlan2AssignOnSusp = value;
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

    public String getRolloverPlanDuration() {
        return rolloverPlanDuration;
    }

    public void setRolloverPlanDuration(String value) {
        this.rolloverPlanDuration = value;
    }

    public Long getRolloverPlanUomCd() {
        return rolloverPlanUomCd;
    }

    public void setRolloverPlanUomCd(Long value) {
        this.rolloverPlanUomCd = value;
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

    public Long getInitialPlanStatusCd() {
        return initialPlanStatusCd;
    }

    public void setInitialPlanStatusCd(Long value) {
        this.initialPlanStatusCd = value;
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

    public Long getRolloverPlanStatusCd() {
        return rolloverPlanStatusCd;
    }

    public void setRolloverPlanStatusCd(Long value) {
        this.rolloverPlanStatusCd = value;
    }

    public List<PlanServicesReturnElement> getPlanServices() {
        if (this.planServices == null) {
            this.planServices = new ArrayList<PlanServicesReturnElement>();
        }
        return this.planServices;
    }public List<PlanRateSchedulesDetailsReturnElement> getPlanRateSchedulesDetails() {
        if (this.planRateSchedulesDetails == null) {
            this.planRateSchedulesDetails = new ArrayList<PlanRateSchedulesDetailsReturnElement>();
        }
        return this.planRateSchedulesDetails;
    }public Long getContractRolloverPlanNo() {
        return contractRolloverPlanNo;
    }

    public void setContractRolloverPlanNo(Long value) {
        this.contractRolloverPlanNo = value;
    }

    public String getContractRolloverClientPlanId() {
        return contractRolloverClientPlanId;
    }

    public void setContractRolloverClientPlanId(String value) {
        this.contractRolloverClientPlanId = value;
    }

    public List<ContractRolloverRateSchedReturnElement> getContractRolloverRateSched() {
        if (this.contractRolloverRateSched == null) {
            this.contractRolloverRateSched = new ArrayList<ContractRolloverRateSchedReturnElement>();
        }
        return this.contractRolloverRateSched;
    }
}

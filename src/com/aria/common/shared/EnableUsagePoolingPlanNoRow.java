package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enable_usage_pooling_plan_no_row", propOrder = {
    "enableUsagePoolingPlanNo",
    "clientEnableUsagePoolPlanId",
    "usageThresholdApplicability"
    })
public class EnableUsagePoolingPlanNoRow {

    @XmlElement(name = "enable_usage_pooling_plan_no")
    protected Long enableUsagePoolingPlanNo;
    @XmlElement(name = "client_enable_usage_pool_plan_id")
    protected String clientEnableUsagePoolPlanId;
    @XmlElement(name = "usage_threshold_applicability")
    protected String usageThresholdApplicability;
    public Long getEnableUsagePoolingPlanNo() {
        return enableUsagePoolingPlanNo;
    }

    public void setEnableUsagePoolingPlanNo(Long value) {
        this.enableUsagePoolingPlanNo = value;
    }

    public String getClientEnableUsagePoolPlanId() {
        return clientEnableUsagePoolPlanId;
    }

    public void setClientEnableUsagePoolPlanId(String value) {
        this.clientEnableUsagePoolPlanId = value;
    }

    public String getUsageThresholdApplicability() {
        return usageThresholdApplicability;
    }

    public void setUsageThresholdApplicability(String value) {
        this.usageThresholdApplicability = value;
    }

    
}

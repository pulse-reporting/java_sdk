package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_plans_ReturnElement", propOrder = {"parentPlanNo", "parentPlanName", "clientParentPlanId"})
public class ParentPlansReturnElement {

    @XmlElement(name = "parent_plan_no")
    protected Long parentPlanNo;
    @XmlElement(name = "parent_plan_name")
    protected String parentPlanName;
    @XmlElement(name = "client_parent_plan_id")
    protected String clientParentPlanId;
    
    public Long getParentPlanNo() {
        return parentPlanNo;
    }

    public void setParentPlanNo(Long value) {
        this.parentPlanNo = value;
    }

    public String getParentPlanName() {
        return parentPlanName;
    }

    public void setParentPlanName(String value) {
        this.parentPlanName = value;
    }

    public String getClientParentPlanId() {
        return clientParentPlanId;
    }

    public void setClientParentPlanId(String value) {
        this.clientParentPlanId = value;
    }

    
}

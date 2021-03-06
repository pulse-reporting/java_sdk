package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_translation_details_ReturnElement", propOrder = {"planNo", "localeName", "planName", "planDesc", "localeNo", "rateSchedsT", "planServicesT"})
public class PlanTranslationDetailsReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "locale_name")
    protected String localeName;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_desc")
    protected String planDesc;
    @XmlElement(name = "locale_no")
    protected Long localeNo;
    @XmlElement(name = "rate_scheds_t")
    protected List<RateSchedsTReturnElement> rateSchedsT;
    @XmlElement(name = "plan_services_t")
    protected List<PlanServicesTReturnElement> planServicesT;
    
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String value) {
        this.localeName = value;
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

    public Long getLocaleNo() {
        return localeNo;
    }

    public void setLocaleNo(Long value) {
        this.localeNo = value;
    }

    public List<RateSchedsTReturnElement> getRateSchedsT() {
        if (this.rateSchedsT == null) {
            this.rateSchedsT = new ArrayList<RateSchedsTReturnElement>();
        }
        return this.rateSchedsT;
    }public List<PlanServicesTReturnElement> getPlanServicesT() {
        if (this.planServicesT == null) {
            this.planServicesT = new ArrayList<PlanServicesTReturnElement>();
        }
        return this.planServicesT;
    }
}

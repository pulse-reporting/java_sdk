package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_methods_array_row", propOrder = {
    "paymentMethodNo",
    "billFirstName",
    "billMiddleInitial",
    "billLastName",
    "billCompanyName",
    "billAddress1",
    "billAddress2",
    "billAddress3",
    "billCity",
    "billLocality",
    "billStateProv",
    "billCountry",
    "billPostalCd",
    "billPhone",
    "billPhoneExt",
    "billCellPhone",
    "billWorkPhone",
    "billWorkPhoneExt",
    "billFax",
    "billEmail",
    "billBirthdate",
    "payMethodName",
    "clientPayMethodId",
    "payMethodDescription",
    "payMethodType",
    "ccNum",
    "ccExpireMm",
    "ccExpireYyyy",
    "bankAcctNum",
    "bankRoutingNum",
    "cvv",
    "trackData1",
    "trackData2",
    "billAgreementId",
    "iban",
    "bankCheckDigit",
    "bankSwiftCd",
    "bankCountryCd",
    "mandateId",
    "bankIdCd",
    "bankBranchCd",
    "doCollect",
    "changeStatusAfterColl",
    "ccId"
    })
public class PaymentMethodsArrayRow {

    @XmlElement(name = "payment_method_no")
    protected Long paymentMethodNo;
    @XmlElement(name = "bill_first_name")
    protected String billFirstName;
    @XmlElement(name = "bill_middle_initial")
    protected String billMiddleInitial;
    @XmlElement(name = "bill_last_name")
    protected String billLastName;
    @XmlElement(name = "bill_company_name")
    protected String billCompanyName;
    @XmlElement(name = "bill_address1")
    protected String billAddress1;
    @XmlElement(name = "bill_address2")
    protected String billAddress2;
    @XmlElement(name = "bill_address3")
    protected String billAddress3;
    @XmlElement(name = "bill_city")
    protected String billCity;
    @XmlElement(name = "bill_locality")
    protected String billLocality;
    @XmlElement(name = "bill_state_prov")
    protected String billStateProv;
    @XmlElement(name = "bill_country")
    protected String billCountry;
    @XmlElement(name = "bill_postal_cd")
    protected String billPostalCd;
    @XmlElement(name = "bill_phone")
    protected String billPhone;
    @XmlElement(name = "bill_phone_ext")
    protected String billPhoneExt;
    @XmlElement(name = "bill_cell_phone")
    protected String billCellPhone;
    @XmlElement(name = "bill_work_phone")
    protected String billWorkPhone;
    @XmlElement(name = "bill_work_phone_ext")
    protected String billWorkPhoneExt;
    @XmlElement(name = "bill_fax")
    protected String billFax;
    @XmlElement(name = "bill_email")
    protected String billEmail;
    @XmlElement(name = "bill_birthdate")
    protected String billBirthdate;
    @XmlElement(name = "pay_method_name")
    protected String payMethodName;
    @XmlElement(name = "client_pay_method_id")
    protected String clientPayMethodId;
    @XmlElement(name = "pay_method_description")
    protected String payMethodDescription;
    @XmlElement(name = "pay_method_type")
    protected Long payMethodType;
    @XmlElement(name = "cc_num")
    protected String ccNum;
    @XmlElement(name = "cc_expire_mm")
    protected Long ccExpireMm;
    @XmlElement(name = "cc_expire_yyyy")
    protected Long ccExpireYyyy;
    @XmlElement(name = "bank_acct_num")
    protected String bankAcctNum;
    @XmlElement(name = "bank_routing_num")
    protected String bankRoutingNum;
    @XmlElement(name = "cvv")
    protected String cvv;
    @XmlElement(name = "track_data1")
    protected String trackData1;
    @XmlElement(name = "track_data2")
    protected String trackData2;
    @XmlElement(name = "bill_agreement_id")
    protected String billAgreementId;
    @XmlElement(name = "iban")
    protected String iban;
    @XmlElement(name = "bank_check_digit")
    protected Long bankCheckDigit;
    @XmlElement(name = "bank_swift_cd")
    protected String bankSwiftCd;
    @XmlElement(name = "bank_country_cd")
    protected String bankCountryCd;
    @XmlElement(name = "mandate_id")
    protected String mandateId;
    @XmlElement(name = "bank_id_cd")
    protected String bankIdCd;
    @XmlElement(name = "bank_branch_cd")
    protected String bankBranchCd;
    @XmlElement(name = "do_collect")
    protected String doCollect;
    @XmlElement(name = "change_status_after_coll")
    protected String changeStatusAfterColl;
    @XmlElement(name = "cc_id")
    protected Long ccId;
    public Long getPaymentMethodNo() {
        return paymentMethodNo;
    }

    public void setPaymentMethodNo(Long value) {
        this.paymentMethodNo = value;
    }

    public String getBillFirstName() {
        return billFirstName;
    }

    public void setBillFirstName(String value) {
        this.billFirstName = value;
    }

    public String getBillMiddleInitial() {
        return billMiddleInitial;
    }

    public void setBillMiddleInitial(String value) {
        this.billMiddleInitial = value;
    }

    public String getBillLastName() {
        return billLastName;
    }

    public void setBillLastName(String value) {
        this.billLastName = value;
    }

    public String getBillCompanyName() {
        return billCompanyName;
    }

    public void setBillCompanyName(String value) {
        this.billCompanyName = value;
    }

    public String getBillAddress1() {
        return billAddress1;
    }

    public void setBillAddress1(String value) {
        this.billAddress1 = value;
    }

    public String getBillAddress2() {
        return billAddress2;
    }

    public void setBillAddress2(String value) {
        this.billAddress2 = value;
    }

    public String getBillAddress3() {
        return billAddress3;
    }

    public void setBillAddress3(String value) {
        this.billAddress3 = value;
    }

    public String getBillCity() {
        return billCity;
    }

    public void setBillCity(String value) {
        this.billCity = value;
    }

    public String getBillLocality() {
        return billLocality;
    }

    public void setBillLocality(String value) {
        this.billLocality = value;
    }

    public String getBillStateProv() {
        return billStateProv;
    }

    public void setBillStateProv(String value) {
        this.billStateProv = value;
    }

    public String getBillCountry() {
        return billCountry;
    }

    public void setBillCountry(String value) {
        this.billCountry = value;
    }

    public String getBillPostalCd() {
        return billPostalCd;
    }

    public void setBillPostalCd(String value) {
        this.billPostalCd = value;
    }

    public String getBillPhone() {
        return billPhone;
    }

    public void setBillPhone(String value) {
        this.billPhone = value;
    }

    public String getBillPhoneExt() {
        return billPhoneExt;
    }

    public void setBillPhoneExt(String value) {
        this.billPhoneExt = value;
    }

    public String getBillCellPhone() {
        return billCellPhone;
    }

    public void setBillCellPhone(String value) {
        this.billCellPhone = value;
    }

    public String getBillWorkPhone() {
        return billWorkPhone;
    }

    public void setBillWorkPhone(String value) {
        this.billWorkPhone = value;
    }

    public String getBillWorkPhoneExt() {
        return billWorkPhoneExt;
    }

    public void setBillWorkPhoneExt(String value) {
        this.billWorkPhoneExt = value;
    }

    public String getBillFax() {
        return billFax;
    }

    public void setBillFax(String value) {
        this.billFax = value;
    }

    public String getBillEmail() {
        return billEmail;
    }

    public void setBillEmail(String value) {
        this.billEmail = value;
    }

    public String getBillBirthdate() {
        return billBirthdate;
    }

    public void setBillBirthdate(String value) {
        this.billBirthdate = value;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String value) {
        this.payMethodName = value;
    }

    public String getClientPayMethodId() {
        return clientPayMethodId;
    }

    public void setClientPayMethodId(String value) {
        this.clientPayMethodId = value;
    }

    public String getPayMethodDescription() {
        return payMethodDescription;
    }

    public void setPayMethodDescription(String value) {
        this.payMethodDescription = value;
    }

    public Long getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(Long value) {
        this.payMethodType = value;
    }

    public String getCcNum() {
        return ccNum;
    }

    public void setCcNum(String value) {
        this.ccNum = value;
    }

    public Long getCcExpireMm() {
        return ccExpireMm;
    }

    public void setCcExpireMm(Long value) {
        this.ccExpireMm = value;
    }

    public Long getCcExpireYyyy() {
        return ccExpireYyyy;
    }

    public void setCcExpireYyyy(Long value) {
        this.ccExpireYyyy = value;
    }

    public String getBankAcctNum() {
        return bankAcctNum;
    }

    public void setBankAcctNum(String value) {
        this.bankAcctNum = value;
    }

    public String getBankRoutingNum() {
        return bankRoutingNum;
    }

    public void setBankRoutingNum(String value) {
        this.bankRoutingNum = value;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String value) {
        this.cvv = value;
    }

    public String getTrackData1() {
        return trackData1;
    }

    public void setTrackData1(String value) {
        this.trackData1 = value;
    }

    public String getTrackData2() {
        return trackData2;
    }

    public void setTrackData2(String value) {
        this.trackData2 = value;
    }

    public String getBillAgreementId() {
        return billAgreementId;
    }

    public void setBillAgreementId(String value) {
        this.billAgreementId = value;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String value) {
        this.iban = value;
    }

    public Long getBankCheckDigit() {
        return bankCheckDigit;
    }

    public void setBankCheckDigit(Long value) {
        this.bankCheckDigit = value;
    }

    public String getBankSwiftCd() {
        return bankSwiftCd;
    }

    public void setBankSwiftCd(String value) {
        this.bankSwiftCd = value;
    }

    public String getBankCountryCd() {
        return bankCountryCd;
    }

    public void setBankCountryCd(String value) {
        this.bankCountryCd = value;
    }

    public String getMandateId() {
        return mandateId;
    }

    public void setMandateId(String value) {
        this.mandateId = value;
    }

    public String getBankIdCd() {
        return bankIdCd;
    }

    public void setBankIdCd(String value) {
        this.bankIdCd = value;
    }

    public String getBankBranchCd() {
        return bankBranchCd;
    }

    public void setBankBranchCd(String value) {
        this.bankBranchCd = value;
    }

    public String getDoCollect() {
        return doCollect;
    }

    public void setDoCollect(String value) {
        this.doCollect = value;
    }

    public String getChangeStatusAfterColl() {
        return changeStatusAfterColl;
    }

    public void setChangeStatusAfterColl(String value) {
        this.changeStatusAfterColl = value;
    }

    public Long getCcId() {
        return ccId;
    }

    public void setCcId(Long value) {
        this.ccId = value;
    }

    
}

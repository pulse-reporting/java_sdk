package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "invoicePaymentDetails"})
@XmlRootElement(name = "get_payments_on_invoice_mResponseElement")
public class GetPaymentsOnInvoiceMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "invoice_payment_details")
    protected List<InvoicePaymentDetailsReturnElement> invoicePaymentDetails;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public List<InvoicePaymentDetailsReturnElement> getInvoicePaymentDetails() {
        if (this.invoicePaymentDetails == null) {
            this.invoicePaymentDetails = new ArrayList<InvoicePaymentDetailsReturnElement>();
        }
        return this.invoicePaymentDetails;
    }
}

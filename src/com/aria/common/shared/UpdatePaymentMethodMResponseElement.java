package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "seqNo", "collectionInfo"})
@XmlRootElement(name = "update_payment_method_mResponseElement")
public class UpdatePaymentMethodMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "seq_no")
    protected Long seqNo;
    @XmlElement(name = "collection_info")
    protected List<CollectionInfoReturnElement> collectionInfo;
    
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

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long value) {
        this.seqNo = value;
    }

    public List<CollectionInfoReturnElement> getCollectionInfo() {
        if (this.collectionInfo == null) {
            this.collectionInfo = new ArrayList<CollectionInfoReturnElement>();
        }
        return this.collectionInfo;
    }
}

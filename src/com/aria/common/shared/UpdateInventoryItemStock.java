package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "inventoryItemStock"})
@XmlRootElement(name = "update_inventory_item_stock")
public class UpdateInventoryItemStock {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "inventory_item_stock")
    protected InventoryItemStockArray inventoryItemStock;
    
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

    public InventoryItemStockArray getInventoryItemStock() {
        return inventoryItemStock;
    }

    public void setInventoryItemStock(InventoryItemStockArray value) {
        this.inventoryItemStock = value;
    }
            
}

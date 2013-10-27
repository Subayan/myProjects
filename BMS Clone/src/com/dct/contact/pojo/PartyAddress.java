/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dct.contact.pojo;

/**
 *
 * @author Subayan
 */
public class PartyAddress {
    private long addressId;
    private long partiId;
    private int type;
    private String address;
    private String description;

    /**
     * @return the partiId
     */
    public long getPartiId() {
        return partiId;
    }

    /**
     * @param partiId the partiId to set
     */
    public void setPartiId(long partiId) {
        this.partiId = partiId;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the addressId
     */
    public long getAddressId() {
        return addressId;
    }

    /**
     * @param addressId the addressId to set
     */
    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }
           
    
}

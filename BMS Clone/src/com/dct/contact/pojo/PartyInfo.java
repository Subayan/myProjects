/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dct.contact.pojo;

/**
 *
 * @author Subayan
 */
public class PartyInfo {
     private long partyId;
     private String name;
     private String name2;
     private String tin;

    /**
     * @return the partyId
     */
    public long getPartyId() {
        return partyId;
    }

    /**
     * @param partyId the partyId to set
     */
    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name2
     */
    public String getName2() {
        return name2;
    }

    /**
     * @param name2 the name2 to set
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * @return the tin
     */
    public String getTin() {
        return tin;
    }

    /**
     * @param tin the tin to set
     */
    public void setTin(String tin) {
        this.tin = tin;
    }
    
}

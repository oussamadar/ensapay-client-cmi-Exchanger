//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.03 at 01:35:06 PM WEST 
//


package ensa.pay.cmiclientexchanger.soap.api.creancier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientPaymntInfo" type="{http://app.com/payments-service}clientPaymentInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientPaymntInfo"
})
@XmlRootElement(name = "getBillsResponse")
public class GetBillsResponse {

    @XmlElement(required = true)
    protected ClientPaymentInfo clientPaymntInfo;

    /**
     * Gets the value of the clientPaymntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClientPaymentInfo }
     *     
     */
    public ClientPaymentInfo getClientPaymntInfo() {
        return clientPaymntInfo;
    }

    /**
     * Sets the value of the clientPaymntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientPaymentInfo }
     *     
     */
    public void setClientPaymntInfo(ClientPaymentInfo value) {
        this.clientPaymntInfo = value;
    }

}

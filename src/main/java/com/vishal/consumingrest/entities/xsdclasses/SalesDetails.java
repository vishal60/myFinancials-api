//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.09 at 02:49:42 PM IST 
//


package com.vishal.consumingrest.entities.xsdclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="row">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sales_order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="internet_ref" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="quotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="purchase_order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="num" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "row"
})
@XmlRootElement(name = "sales_details")
public class SalesDetails {

    @XmlElement(required = true)
    protected SalesDetails.Row row;

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link SalesDetails.Row }
     *     
     */
    public SalesDetails.Row getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesDetails.Row }
     *     
     */
    public void setRow(SalesDetails.Row value) {
        this.row = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sales_order" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="internet_ref" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="quotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="purchase_order" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *       &lt;attribute name="num" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "salesOrder",
        "internetRef",
        "quotation",
        "purchaseOrder"
    })
    public static class Row {

        @XmlElement(name = "sales_order")
        protected int salesOrder;
        @XmlElement(name = "internet_ref")
        protected long internetRef;
        @XmlElement(required = true)
        protected String quotation;
        @XmlElement(name = "purchase_order")
        protected int purchaseOrder;
        @XmlAttribute(name = "num")
        protected Byte num;

        /**
         * Gets the value of the salesOrder property.
         * 
         */
        public int getSalesOrder() {
            return salesOrder;
        }

        /**
         * Sets the value of the salesOrder property.
         * 
         */
        public void setSalesOrder(int value) {
            this.salesOrder = value;
        }

        /**
         * Gets the value of the internetRef property.
         * 
         */
        public long getInternetRef() {
            return internetRef;
        }

        /**
         * Sets the value of the internetRef property.
         * 
         */
        public void setInternetRef(long value) {
            this.internetRef = value;
        }

        /**
         * Gets the value of the quotation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuotation() {
            return quotation;
        }

        /**
         * Sets the value of the quotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuotation(String value) {
            this.quotation = value;
        }

        /**
         * Gets the value of the purchaseOrder property.
         * 
         */
        public int getPurchaseOrder() {
            return purchaseOrder;
        }

        /**
         * Sets the value of the purchaseOrder property.
         * 
         */
        public void setPurchaseOrder(int value) {
            this.purchaseOrder = value;
        }

        /**
         * Gets the value of the num property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getNum() {
            return num;
        }

        /**
         * Sets the value of the num property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setNum(Byte value) {
            this.num = value;
        }

    }

}

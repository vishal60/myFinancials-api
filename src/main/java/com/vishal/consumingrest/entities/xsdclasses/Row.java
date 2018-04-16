package com.vishal.consumingrest.entities.xsdclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cust_account_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="account_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="account_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="outstanding_balance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="party_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="party_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="parent_party">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="parent_party_row">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="party_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             <element name="party_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           </sequence>
 *                           <attribute name="num" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="currency_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="address">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="address_row">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="address_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             <element name="fraud_bankruptcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             <element name="concatenated_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             <element name="branch_name">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <attribute name="null" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                           <attribute name="num" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute name="num" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "custAccountId", "accountNumber", "accountName", "outstandingBalance", "partyNumber",
		"partyId", "parentParty", "currencyCode", "address" })
@XmlRootElement(name = "row")
public class Row {

	@XmlElement(name = "cust_account_id")
	protected int custAccountId;
	@XmlElement(name = "account_number", required = true)
	protected String accountNumber;
	@XmlElement(name = "account_name", required = true)
	protected String accountName;
	@XmlElement(name = "outstanding_balance")
	protected int outstandingBalance;
	@XmlElement(name = "party_number")
	protected int partyNumber;
	@XmlElement(name = "party_id")
	protected int partyId;
	@XmlElement(name = "parent_party", required = true)
	protected Row.ParentParty parentParty;
	@XmlElement(name = "currency_code", required = true)
	protected String currencyCode;
	@XmlElement(required = true)
	protected Row.Address address;
	@XmlAttribute(name = "num")
	protected Integer num;

	/**
	 * Gets the value of the custAccountId property.
	 * 
	 */
	public int getCustAccountId() {
		return custAccountId;
	}

	/**
	 * Sets the value of the custAccountId property.
	 * 
	 */
	public void setCustAccountId(int value) {
		this.custAccountId = value;
	}

	/**
	 * Gets the value of the accountNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Sets the value of the accountNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountNumber(String value) {
		this.accountNumber = value;
	}

	/**
	 * Gets the value of the accountName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * Sets the value of the accountName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAccountName(String value) {
		this.accountName = value;
	}

	/**
	 * Gets the value of the outstandingBalance property.
	 * 
	 */
	public int getOutstandingBalance() {
		return outstandingBalance;
	}

	/**
	 * Sets the value of the outstandingBalance property.
	 * 
	 */
	public void setOutstandingBalance(int value) {
		this.outstandingBalance = value;
	}

	/**
	 * Gets the value of the partyNumber property.
	 * 
	 */
	public int getPartyNumber() {
		return partyNumber;
	}

	/**
	 * Sets the value of the partyNumber property.
	 * 
	 */
	public void setPartyNumber(int value) {
		this.partyNumber = value;
	}

	/**
	 * Gets the value of the partyId property.
	 * 
	 */
	public int getPartyId() {
		return partyId;
	}

	/**
	 * Sets the value of the partyId property.
	 * 
	 */
	public void setPartyId(int value) {
		this.partyId = value;
	}

	/**
	 * Gets the value of the parentParty property.
	 * 
	 * @return possible object is {@link Row.ParentParty }
	 * 
	 */
	public Row.ParentParty getParentParty() {
		return parentParty;
	}

	/**
	 * Sets the value of the parentParty property.
	 * 
	 * @param value
	 *            allowed object is {@link Row.ParentParty }
	 * 
	 */
	public void setParentParty(Row.ParentParty value) {
		this.parentParty = value;
	}

	/**
	 * Gets the value of the currencyCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * Sets the value of the currencyCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

	/**
	 * Gets the value of the address property.
	 * 
	 * @return possible object is {@link Row.Address }
	 * 
	 */
	public Row.Address getAddress() {
		return address;
	}

	/**
	 * Sets the value of the address property.
	 * 
	 * @param value
	 *            allowed object is {@link Row.Address }
	 * 
	 */
	public void setAddress(Row.Address value) {
		this.address = value;
	}

	/**
	 * Gets the value of the num property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getNum() {
		return num;
	}

	/**
	 * Sets the value of the num property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setNum(Integer value) {
		this.num = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within
	 * this class.
	 * 
	 * <pre>
	 * <complexType>
	 *   <complexContent>
	 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       <sequence>
	 *         <element name="address_row">
	 *           <complexType>
	 *             <complexContent>
	 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 <sequence>
	 *                   <element name="address_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   <element name="fraud_bankruptcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   <element name="concatenated_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   <element name="branch_name">
	 *                     <complexType>
	 *                       <complexContent>
	 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           <attribute name="null" type="{http://www.w3.org/2001/XMLSchema}boolean" />
	 *                         </restriction>
	 *                       </complexContent>
	 *                     </complexType>
	 *                   </element>
	 *                 </sequence>
	 *                 <attribute name="num" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *               </restriction>
	 *             </complexContent>
	 *           </complexType>
	 *         </element>
	 *       </sequence>
	 *     </restriction>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "addressRow" })
	public static class Address {

		@XmlElement(name = "address_row", required = true)
		protected Row.Address.AddressRow addressRow;

		/**
		 * Gets the value of the addressRow property.
		 * 
		 * @return possible object is {@link Row.Address.AddressRow }
		 * 
		 */
		public Row.Address.AddressRow getAddressRow() {
			return addressRow;
		}

		/**
		 * Sets the value of the addressRow property.
		 * 
		 * @param value
		 *            allowed object is {@link Row.Address.AddressRow }
		 * 
		 */
		public void setAddressRow(Row.Address.AddressRow value) {
			this.addressRow = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content contained within
		 * this class.
		 * 
		 * <pre>
		 * <complexType>
		 *   <complexContent>
		 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       <sequence>
		 *         <element name="address_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         <element name="fraud_bankruptcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         <element name="concatenated_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         <element name="branch_name">
		 *           <complexType>
		 *             <complexContent>
		 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 <attribute name="null" type="{http://www.w3.org/2001/XMLSchema}boolean" />
		 *               </restriction>
		 *             </complexContent>
		 *           </complexType>
		 *         </element>
		 *       </sequence>
		 *       <attribute name="num" type="{http://www.w3.org/2001/XMLSchema}int" />
		 *     </restriction>
		 *   </complexContent>
		 * </complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "addressId", "fraudBankruptcy", "concatenatedAddress", "branchName" })
		public static class AddressRow {

			@XmlElement(name = "address_id")
			protected int addressId;
			@XmlElement(name = "fraud_bankruptcy", required = true)
			protected String fraudBankruptcy;
			@XmlElement(name = "concatenated_address", required = true)
			protected String concatenatedAddress;
			@XmlElement(name = "branch_name", required = true)
			protected Row.Address.AddressRow.BranchName branchName;
			@XmlAttribute(name = "num")
			protected Integer num;

			/**
			 * Gets the value of the addressId property.
			 * 
			 */
			public int getAddressId() {
				return addressId;
			}

			/**
			 * Sets the value of the addressId property.
			 * 
			 */
			public void setAddressId(int value) {
				this.addressId = value;
			}

			/**
			 * Gets the value of the fraudBankruptcy property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFraudBankruptcy() {
				return fraudBankruptcy;
			}

			/**
			 * Sets the value of the fraudBankruptcy property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFraudBankruptcy(String value) {
				this.fraudBankruptcy = value;
			}

			/**
			 * Gets the value of the concatenatedAddress property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getConcatenatedAddress() {
				return concatenatedAddress;
			}

			/**
			 * Sets the value of the concatenatedAddress property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setConcatenatedAddress(String value) {
				this.concatenatedAddress = value;
			}

			/**
			 * Gets the value of the branchName property.
			 * 
			 * @return possible object is {@link Row.Address.AddressRow.BranchName }
			 * 
			 */
			public Row.Address.AddressRow.BranchName getBranchName() {
				return branchName;
			}

			/**
			 * Sets the value of the branchName property.
			 * 
			 * @param value
			 *            allowed object is {@link Row.Address.AddressRow.BranchName }
			 * 
			 */
			public void setBranchName(Row.Address.AddressRow.BranchName value) {
				this.branchName = value;
			}

			/**
			 * Gets the value of the num property.
			 * 
			 * @return possible object is {@link Integer }
			 * 
			 */
			public Integer getNum() {
				return num;
			}

			/**
			 * Sets the value of the num property.
			 * 
			 * @param value
			 *            allowed object is {@link Integer }
			 * 
			 */
			public void setNum(Integer value) {
				this.num = value;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content contained within
			 * this class.
			 * 
			 * <pre>
			 * <complexType>
			 *   <complexContent>
			 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       <attribute name="null" type="{http://www.w3.org/2001/XMLSchema}boolean" />
			 *     </restriction>
			 *   </complexContent>
			 * </complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "")
			public static class BranchName {

				@XmlAttribute(name = "null")
				protected Boolean _null;

				/**
				 * Gets the value of the null property.
				 * 
				 * @return possible object is {@link Boolean }
				 * 
				 */
				public Boolean isNull() {
					return _null;
				}

				/**
				 * Sets the value of the null property.
				 * 
				 * @param value
				 *            allowed object is {@link Boolean }
				 * 
				 */
				public void setNull(Boolean value) {
					this._null = value;
				}

			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within
	 * this class.
	 * 
	 * <pre>
	 * <complexType>
	 *   <complexContent>
	 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       <sequence>
	 *         <element name="parent_party_row">
	 *           <complexType>
	 *             <complexContent>
	 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 <sequence>
	 *                   <element name="party_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   <element name="party_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                 </sequence>
	 *                 <attribute name="num" type="{http://www.w3.org/2001/XMLSchema}int" />
	 *               </restriction>
	 *             </complexContent>
	 *           </complexType>
	 *         </element>
	 *       </sequence>
	 *     </restriction>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "parentPartyRow" })
	public static class ParentParty {

		@XmlElement(name = "parent_party_row", required = true)
		protected Row.ParentParty.ParentPartyRow parentPartyRow;

		/**
		 * Gets the value of the parentPartyRow property.
		 * 
		 * @return possible object is {@link Row.ParentParty.ParentPartyRow }
		 * 
		 */
		public Row.ParentParty.ParentPartyRow getParentPartyRow() {
			return parentPartyRow;
		}

		/**
		 * Sets the value of the parentPartyRow property.
		 * 
		 * @param value
		 *            allowed object is {@link Row.ParentParty.ParentPartyRow }
		 * 
		 */
		public void setParentPartyRow(Row.ParentParty.ParentPartyRow value) {
			this.parentPartyRow = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content contained within
		 * this class.
		 * 
		 * <pre>
		 * <complexType>
		 *   <complexContent>
		 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       <sequence>
		 *         <element name="party_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         <element name="party_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *       </sequence>
		 *       <attribute name="num" type="{http://www.w3.org/2001/XMLSchema}int" />
		 *     </restriction>
		 *   </complexContent>
		 * </complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "partyId", "partyNumber" })
		public static class ParentPartyRow {

			@XmlElement(name = "party_id")
			protected int partyId;
			@XmlElement(name = "party_number")
			protected int partyNumber;
			@XmlAttribute(name = "num")
			protected Integer num;

			/**
			 * Gets the value of the partyId property.
			 * 
			 */
			public int getPartyId() {
				return partyId;
			}

			/**
			 * Sets the value of the partyId property.
			 * 
			 */
			public void setPartyId(int value) {
				this.partyId = value;
			}

			/**
			 * Gets the value of the partyNumber property.
			 * 
			 */
			public int getPartyNumber() {
				return partyNumber;
			}

			/**
			 * Sets the value of the partyNumber property.
			 * 
			 */
			public void setPartyNumber(int value) {
				this.partyNumber = value;
			}

			/**
			 * Gets the value of the num property.
			 * 
			 * @return possible object is {@link Integer }
			 * 
			 */
			public Integer getNum() {
				return num;
			}

			/**
			 * Sets the value of the num property.
			 * 
			 * @param value
			 *            allowed object is {@link Integer }
			 * 
			 */
			public void setNum(Integer value) {
				this.num = value;
			}

		}

	}

}

package com.jckl.foodathon.model;

import java.util.Set;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Store {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private String name;
	
	@Persistent
	private String address_unitNumber;
	@Persistent
	private String address_buildingName;
	@Persistent
	private String aaddress_streetName;
	@Persistent
	private String address_area;
	@Persistent
	private String address_postcode;
	@Persistent
	private String address_state;
	@Persistent
	private String address_country;

	@Persistent
	private String longitude;
	@Persistent
	private String latitude;

	@Persistent
	private String contactNo;
	@Persistent
	private String contactPerson;
	@Persistent
	private String notes;
	
	@Persistent
	private Set<Key> storeTypes;

	
	/**
	 * Getter & Setter
	 */
	
	
	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress_unitNumber() {
		return address_unitNumber;
	}

	public void setAddress_unitNumber(String address_unitNumber) {
		this.address_unitNumber = address_unitNumber;
	}

	public String getAddress_buildingName() {
		return address_buildingName;
	}

	public void setAddress_buildingName(String address_buildingName) {
		this.address_buildingName = address_buildingName;
	}

	public String getAaddress_streetName() {
		return aaddress_streetName;
	}

	public void setAaddress_streetName(String aaddress_streetName) {
		this.aaddress_streetName = aaddress_streetName;
	}

	public String getAddress_area() {
		return address_area;
	}

	public void setAddress_area(String address_area) {
		this.address_area = address_area;
	}

	public String getAddress_postcode() {
		return address_postcode;
	}

	public void setAddress_postcode(String address_postcode) {
		this.address_postcode = address_postcode;
	}

	public String getAddress_state() {
		return address_state;
	}

	public void setAddress_state(String address_state) {
		this.address_state = address_state;
	}

	public String getAddress_country() {
		return address_country;
	}

	public void setAddress_country(String address_country) {
		this.address_country = address_country;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Set<Key> getStoreTypes() {
		return storeTypes;
	}

	public void setStoreTypes(Set<Key> storeTypes) {
		this.storeTypes = storeTypes;
	}

}

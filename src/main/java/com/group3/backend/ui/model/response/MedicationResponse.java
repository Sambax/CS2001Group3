package com.group3.backend.ui.model.response;

public class MedicationResponse {

	private Long id;
	private String medicationName;
	private int prescriptionCount;
	private String dosage;
	private String pharmacyName;
	private String medicationClass;
	
	   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    public String getMedicationName() {
    	return medicationName;
    }
    public void setMedicationName(String medicationName) {
    	this.medicationName = medicationName;
    }
    
    public int getPrecriptionCount() {
    	return prescriptionCount;
    }
    public void setPrescriptionCount(int prescriptionCount) {
    	this.prescriptionCount = prescriptionCount;
    }

    public String getMedicationClass() {
    	return medicationClass;
    }
    public void setMedicationClass(String medicationClass) {
    	this.medicationClass = medicationClass;
    }

    public String getDosage() {
    	return dosage;
    }
    public void setDosage(String dosage) {
    	this.dosage = dosage;
    }

    public String getPharmacyName() {
    	return pharmacyName;
    }
    public void setPharmacyName(String pharmacyName) {
    	this.pharmacyName = pharmacyName;
    }


	private long medicationId;
    private String name;
    private String description;
    
	public long getMedicationId() {
		return medicationId;
	}
	public void setMedicationId(long medicationId) {
		this.medicationId = medicationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    
}

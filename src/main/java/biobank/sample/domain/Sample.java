package biobank.sample.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="sample")
public class Sample {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column(name = "user_id")
	Integer userId;
	
	@Column(name = "box_id")
	Integer boxId;
	
	@Column(name = "donor_id")
	Integer donorId;
	
	@Column(name = "consent_id")
	Integer consentId;
	
	@Column(name = "sample_id")
	@NotNull
	String sampleId;
	
	@Column(name = "location_id")
	String locationId;
	
	@Column(name = "location_path")
	String locationPath;
	
	@Column(name = "parent_sample_id")
	String parentSampleId;
	
	@ManyToOne
	@JoinColumn(name = "type_id", referencedColumnName = "id")
	@NotNull
	SampleType typeId;
	
	@Column(name = "sprec")
	String sprec;
	
	@Column(name = "sampling_technique")
	String samplingTechnique;
	
	@ManyToOne
	@JoinColumn(name = "storage_temperature", referencedColumnName = "id")
	MiabisStorageTemperature storageTemperature;
	
	@Column(name = "sampled_time")
	String sampledTime;
	
	@Column(name = "anatomycal_site")
	String anatomycalSite;
	
	@Column(name = "residual_quantity")
	Float residualQuantity;
	
	@ManyToOne
	@JoinColumn(name = "um_id", referencedColumnName = "id")
	MiabisQuantity umID;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBoxId() {
		return boxId;
	}

	public void setBoxId(Integer boxId) {
		this.boxId = boxId;
	}

	public Integer getDonorId() {
		return donorId;
	}

	public void setDonorId(Integer donorId) {
		this.donorId = donorId;
	}

	public Integer getConsentId() {
		return consentId;
	}

	public void setConsentId(Integer consentId) {
		this.consentId = consentId;
	}

	public String getSampleId() {
		return sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationPath() {
		return locationPath;
	}

	public void setLocationPath(String locationPath) {
		this.locationPath = locationPath;
	}

	public String getParentSampleId() {
		return parentSampleId;
	}

	public void setParentSampleId(String parentSampleId) {
		this.parentSampleId = parentSampleId;
	}

	public SampleType getTypeId() {
		return typeId;
	}

	public void setTypeId(SampleType typeId) {
		this.typeId = typeId;
	}

	public String getSprec() {
		return sprec;
	}

	public void setSprec(String sprec) {
		this.sprec = sprec;
	}

	public String getSamplingTechnique() {
		return samplingTechnique;
	}

	public void setSamplingTechnique(String samplingTechnique) {
		this.samplingTechnique = samplingTechnique;
	}

	public MiabisStorageTemperature getStorageTemperature() {
		return storageTemperature;
	}

	public void setStorageTemperature(MiabisStorageTemperature storageTemperature) {
		this.storageTemperature = storageTemperature;
	}

	public String getSampledTime() {
		return sampledTime;
	}

	public void setSampledTime(String sampledTime) {
		this.sampledTime = sampledTime;
	}

	public String getAnatomycalSite() {
		return anatomycalSite;
	}

	public void setAnatomycalSite(String anatomycalSite) {
		this.anatomycalSite = anatomycalSite;
	}

	public Float getResidualQuantity() {
		return residualQuantity;
	}

	public void setResidualQuantity(Float residualQuantity) {
		this.residualQuantity = residualQuantity;
	}

	public MiabisQuantity getUmID() {
		return umID;
	}

	public void setUmID(MiabisQuantity umID) {
		this.umID = umID;
	}


}

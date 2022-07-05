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
@Table(name = "collections")
public class Collection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@NotNull
	String name;
	
	String acronym;
	String description;
	
	@ManyToOne
	@JoinColumn(name = "sex_id", referencedColumnName = "id")
	@NotNull
	MiabisSex sexId;
	
	@Column(name = "age_low")
	Integer ageLow;
	
	@Column(name = "age_high")
	Integer  ageHigh;
	
	@ManyToOne
	@JoinColumn(name = "age_unit_id", referencedColumnName = "id")
	StaticAgeUnit ageUnitId;
	
	@ManyToOne
	@JoinColumn(name = "material_type_id", referencedColumnName = "id")
	@NotNull
	MiabisMaterialType materialTypeId;
	
	String note;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MiabisSex getSexId() {
		return sexId;
	}

	public void setSexId(MiabisSex sexId) {
		this.sexId = sexId;
	}

	public Integer getAgeLow() {
		return ageLow;
	}

	public void setAgeLow(Integer ageLow) {
		this.ageLow = ageLow;
	}

	public Integer getAgeHigh() {
		return ageHigh;
	}

	public void setAgeHigh(Integer ageHigh) {
		this.ageHigh = ageHigh;
	}

	public StaticAgeUnit getAgeUnitId() {
		return ageUnitId;
	}

	public void setAgeUnitId(StaticAgeUnit ageUnitId) {
		this.ageUnitId = ageUnitId;
	}

	public MiabisMaterialType getMaterialTypeId() {
		return materialTypeId;
	}

	public void setMaterialTypeId(MiabisMaterialType materialTypeId) {
		this.materialTypeId = materialTypeId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}

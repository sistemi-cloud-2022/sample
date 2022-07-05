package biobank.sample.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "miabis_quantities")
public class MiabisQuantity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column(name = "unit_of_measure")
	@NotNull
	String unitOfMeasure;
	
	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}
	
	public String getUnitOfMeasure() {
	    return unitOfMeasure;
	}
	
	public void setName(String unitOfMeasure) {
	    this.unitOfMeasure = unitOfMeasure;
	}

}
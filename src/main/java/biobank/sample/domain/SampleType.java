package biobank.sample.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "sample_type")
public class SampleType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@NotNull
	Integer tipo;
	
	@NotNull
	String denomination;
	
	@NotNull
	String acronym;

	public Integer getId() {
	    return id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}
	
	public Integer getTipo() {
	    return tipo;
	}
	
	public void setTipo(Integer tipo) {
	    this.tipo = tipo;
	}
	
	public String getDenomination() {
	    return denomination;
	}
	
	public void setDenomination(String denomination) {
	    this.denomination = denomination;
	}
	
	public String getAcronym() {
	    return acronym;
	}
	
	public void setAcronym(String acronym) {
	    this.acronym = acronym;
	}
}

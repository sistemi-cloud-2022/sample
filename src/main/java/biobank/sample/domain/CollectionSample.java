package biobank.sample.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "collections_samples")
public class CollectionSample {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@ManyToOne
	@JoinColumn(name = "sample_id", referencedColumnName = "id")
	@NotNull
	Sample sampleId;
	
	@ManyToOne
	@JoinColumn(name = "collection_id", referencedColumnName = "id")
	@NotNull
	Collection collectionId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Sample getSampleId() {
		return sampleId;
	}

	public void setSampleId(Sample sampleId) {
		this.sampleId = sampleId;
	}

	public Collection getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(Collection collectionId) {
		this.collectionId = collectionId;
	}

}

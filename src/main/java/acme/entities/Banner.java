
package acme.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Banner extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Temporal(TemporalType.TIMESTAMP)
	@Valid
	@Past
	protected Date				moment;

	//protected Date startPeriod;

	//protected Date endPeriod;

	@URL
	@NotBlank
	protected String			picture;

	@NotBlank
	@Length(max = 75)
	protected String			slogan;

	@URL
	@NotBlank
	protected String			link;

	// Derived attributes -----------------------------------------------------

	//	@Transient
	//	public boolean displayPeriod(){
	//		
	//	}

	// Relationships ----------------------------------------------------------

}

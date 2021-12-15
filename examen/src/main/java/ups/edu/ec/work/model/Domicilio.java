package ups.edu.ec.work.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Domicilio {
	@Id
	@Column(name="dom_codigo")
	private int codigo;
	
	private String direccion;
	
	

}

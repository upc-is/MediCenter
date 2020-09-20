package pe.edu.upc.medicenter.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicamentos")
public class Medicamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer Id;

	@Column(name = "nombre", length = 30, nullable = false)
	private String nombre;
	
	private Integer stock;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
}

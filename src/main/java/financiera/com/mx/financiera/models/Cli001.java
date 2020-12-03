package financiera.com.mx.financiera.models;

import java.util.Date;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

/*Modelo usado para los clientes*/
@Entity
@Table(name="Cli001")
public class Cli001 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long Id;
	@Column
	public String Nombre;
	@Column
	public String SegundoNombre;
	@Column
	public String ApellidoPaterno;
	@Column
	public String ApellidoMaterno;
	@Column
	public Date FecNac;

	public Cli001(long Id, String Nombre, String SegundoNombre, String ApellidoPaterno, String ApellidoMaterno,
			Date FecNac) {

	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public long getId() {
		return Id;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setSegundoNombre(String SegundoNombre) {
		this.SegundoNombre = SegundoNombre;
	}

	public String getSegundoNombre() {
		return SegundoNombre;
	}

	public void setApellidoPaterno(String ApellidoPaterno) {
		this.ApellidoPaterno = ApellidoPaterno;
	}

	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}

	public void setApellidoMaterno(String ApellidoMaterno) {
		this.ApellidoMaterno = ApellidoMaterno;
	}

	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
}
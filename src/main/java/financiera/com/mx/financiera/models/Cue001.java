package financiera.com.mx.financiera.models;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
/*Modelo para el tratamiento de Cuentas"*/

@Entity
@Table(name="Cue001")
public class Cue001 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long Id;
	@Column
	public int IdTipo;
	@Column
	public double MontoApertura;
	@Column
	public Date FechaApertura;
	@Column
	public long NumeroCuenta;
	@Column
	public String IdOperacion;
	@Column
	public double SaldoFinal;

	public Cue001(long id, int idTipo, double montoApertura, Date fechaApertura, long numeroCuenta, String idOperacion,
			double saldoFinal) {
		super();
		Id = id;
		IdTipo = idTipo;
		MontoApertura = montoApertura;
		FechaApertura = fechaApertura;
		NumeroCuenta = numeroCuenta;
		IdOperacion = idOperacion;
		SaldoFinal = saldoFinal;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public int getIdTipo() {
		return IdTipo;
	}

	public void setIdTipo(int idTipo) {
		IdTipo = idTipo;
	}

	public double getMontoApertura() {
		return MontoApertura;
	}

	public void setMontoApertura(double montoApertura) {
		MontoApertura = montoApertura;
	}

	public Date getFechaApertura() {
		return FechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		FechaApertura = fechaApertura;
	}

	public long getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}

	public String getIdOperacion() {
		return IdOperacion;
	}

	public void setIdOperacion(String idOperacion) {
		IdOperacion = idOperacion;
	}

	public double getSaldoFinal() {
		return SaldoFinal;
	}

	public void setSaldoFinal(double saldoFinal) {
		SaldoFinal = saldoFinal;
	}

}

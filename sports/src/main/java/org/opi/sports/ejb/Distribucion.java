package org.opi.sports.ejb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Distribucion database table.
 * 
 */
@Entity
@NamedQuery(name="Distribucion.findAll", query="SELECT d FROM Distribucion d")
public class Distribucion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String idDistribucion;

	//bi-directional many-to-one association to CentroDistribucion
	@ManyToOne
	@JoinColumn(name="idCentro")
	private CentroDistribucion centroDistribucion;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="idEvento")
	private Evento evento;

	public Distribucion() {
	}

	public String getIdDistribucion() {
		return this.idDistribucion;
	}

	public void setIdDistribucion(String idDistribucion) {
		this.idDistribucion = idDistribucion;
	}

	public CentroDistribucion getCentroDistribucion() {
		return this.centroDistribucion;
	}

	public void setCentroDistribucion(CentroDistribucion centroDistribucion) {
		this.centroDistribucion = centroDistribucion;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}
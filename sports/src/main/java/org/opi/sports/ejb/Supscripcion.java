package org.opi.sports.ejb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Supscripcion database table.
 * 
 */
@Entity
@NamedQuery(name="Supscripcion.findAll", query="SELECT s FROM Supscripcion s")
public class Supscripcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSupscripcion;

	//bi-directional many-to-one association to TiipoEvento
	@ManyToOne
	@JoinColumn(name="idTipoEvento")
	private TiipoEvento tiipoEvento;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public Supscripcion() {
	}

	public int getIdSupscripcion() {
		return this.idSupscripcion;
	}

	public void setIdSupscripcion(int idSupscripcion) {
		this.idSupscripcion = idSupscripcion;
	}

	public TiipoEvento getTiipoEvento() {
		return this.tiipoEvento;
	}

	public void setTiipoEvento(TiipoEvento tiipoEvento) {
		this.tiipoEvento = tiipoEvento;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
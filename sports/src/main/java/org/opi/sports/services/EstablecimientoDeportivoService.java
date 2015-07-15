package org.opi.sports.services;

import java.util.List;


import org.opi.sports.ejb.EstablecimientoDeportivo;
import org.opi.sports.repositories.EstablecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Fecha: 13-07-2015 version 1.0
 * 
 * @author Mauricio Araica Hernández
 *
 *Sprint 01 Descripción: Clase que implementa la interface de servicios
 *
 */
@Service
public class EstablecimientoDeportivoService implements EstablecimientoDeportivoServiceInterface{
	
	//Variable de tipo de establecimiento repository
	@Autowired
	public EstablecimientoRepository establecimientoDeportivoRepository;

	/**
	 * Metodo que devuelve los establecimientos deportivos por medio del repository
	 * 
	 */
	@Override
	@Transactional
	public List<EstablecimientoDeportivo> getAllEstablecimientos() {
		return establecimientoDeportivoRepository.findAll();
	}
}
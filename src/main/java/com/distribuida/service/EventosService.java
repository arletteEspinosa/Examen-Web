package com.distribuida.service;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Ciudades;
import com.distribuida.entities.Eventos;
import com.distribuida.entities.EventosDetalles;


public interface EventosService {
public List<Eventos> findAll();
	
	public Eventos findOne(int id);
	
	public void add(Eventos eventos);
	
	public void up(Eventos eventos);
	
	public void del(int id);
	
	
	public void up(int id, String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar, byte[] imagen, String imagenNombre,Double promedioCalificacion,int id_ciudad);
	//public void add( String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar, String imagenNombre,Double promedioCalificacion);

	void add(String nombre, Date fechaInicio, Date fechaFin, String asunto, String lugar, byte[] imagen,
			String imagenNombre, Double promedioCalificacion,int id_ciudad);

	List<Eventos> findAll(String busqueda);

	public void add(Double calificacion, int id_evento);
	
	public double promedio(List<EventosDetalles>eventosDetalles);
	
}

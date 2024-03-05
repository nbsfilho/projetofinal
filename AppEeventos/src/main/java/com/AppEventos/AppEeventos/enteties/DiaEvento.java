package com.AppEventos.AppEeventos.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@jakarta.persistence.Table(name ="DiaEventos")
public class DiaEvento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private Long id_diaEvento;
    private String data_diaEvento;
    public DiaEvento(){
    	
 }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_diaEvento() {
		return id_diaEvento;
	}
	public void setId_diaEvento(Long id_diaEvento) {
		this.id_diaEvento = id_diaEvento;
	}
	public String getData_diaEvento() {
		return data_diaEvento;
	}
	public void setData_diaEvento(String data_diaEvento) {
		this.data_diaEvento = data_diaEvento;
	}

}
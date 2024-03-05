package com.AppEventos.AppEeventos.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="Oficina")
public class Oficina {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome_oficina;
	   
	    @ManyToOne
	    @JoinColumn(name = "id_diaEvento")
	    private DiaEvento diaEvento;
	    
	    
	    @ManyToOne
	    @JoinColumn(name = "id_oficineiro")
	    private Palestrante palestrante;

	    @ManyToOne
	    @JoinColumn(name = "id_monitor")
	    private Monitor monitor;
	    public Oficina() {
	        

	    	
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome_oficina() {
			return nome_oficina;
		}
		public void setNome_oficina(String nome_oficina) {
			this.nome_oficina = nome_oficina;
		}
		public DiaEvento getDiaEvento() {
			return diaEvento;
		}
		public void setDiaEvento(DiaEvento diaEvento) {
			this.diaEvento = diaEvento;
		}
		public Palestrante getPalestrante() {
			return palestrante;
		}
		public void setPalestrante(Palestrante palestrante) {
			this.palestrante = palestrante;
		}
		public Monitor getMonitor() {
			return monitor;
		}
		public void setMonitor(Monitor monitor) {
			this.monitor = monitor;
		}






}
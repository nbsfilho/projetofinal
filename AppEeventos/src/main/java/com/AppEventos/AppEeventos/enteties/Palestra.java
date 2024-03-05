package com.AppEventos.AppEeventos.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="Palestra")
public class Palestra {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome_palestra;
	   
	    @ManyToOne
	    @JoinColumn(name = "id_diaEvento")
	    private DiaEvento diaEvento;
	    
	    
	    @ManyToOne
	    @JoinColumn(name = "id_palestrante")
	    private Palestrante palestrante;

	    @ManyToOne
	    @JoinColumn(name = "id_monitor")
	    private Monitor monitor;
	    public Palestra() {
	        

	    	
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome_palestra() {
			return nome_palestra;
		}
		public void setNome_palestra(String nome_palestra) {
			this.nome_palestra = nome_palestra;
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

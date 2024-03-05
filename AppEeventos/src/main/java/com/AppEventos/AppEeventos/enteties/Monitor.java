package com.AppEventos.AppEeventos.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Monitore")
public class Monitor {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome_monitor;
	    private String email_monitor;
	    private String telefone_monitor;
	    private Long id_monitor;
	    public Monitor() {
   
    }
		public String getNome_monitor() {
			return nome_monitor;
		}
		public void setNome_monitor(String nome_monitor) {
			this.nome_monitor = nome_monitor;
		}
		public String getEmail_monitor() {
			return email_monitor;
		}
		public void setEmail_monitor(String email_monitor) {
			this.email_monitor = email_monitor;
		}
		public String getTelefone_monitor() {
			return telefone_monitor;
		}
		public void setTelefone_monitor(String telefone_monitor) {
			this.telefone_monitor = telefone_monitor;
		}
		public Long getId_monitor() {
			return id_monitor;
		}
		public void setId_monitor(Long id_monitor) {
			this.id_monitor = id_monitor;
		}
	
	
}
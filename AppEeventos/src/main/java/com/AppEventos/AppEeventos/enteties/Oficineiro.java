package com.AppEventos.AppEeventos.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Oficineiro")
public class Oficineiro {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome_oficineiro;
	    private String email_oficineiro;
	    private String telefone_oficineiro;
	    private Long id_oficineiro;
	    public Oficineiro() {
   
    }
		public String getNome_oficineiro() {
			return nome_oficineiro;
		}
		public void setNome_oficineiro(String nome_oficineiro) {
			this.nome_oficineiro = nome_oficineiro;
		}
		public String getEmail_oficineiro() {
			return email_oficineiro;
		}
		public void setEmail_oficineiro(String email_oficineiro) {
			this.email_oficineiro = email_oficineiro;
		}
		public String getTelefone_oficineiro() {
			return telefone_oficineiro;
		}
		public void setTelefone_oficineiro(String telefone_oficineiro) {
			this.telefone_oficineiro = telefone_oficineiro;
		}
		public Long getId_oficineiro() {
			return id_oficineiro;
		}
		public void setId_oficineiro(Long id_oficineiro) {
			this.id_oficineiro = id_oficineiro;
		}
		
		
		

		
		
	    
}

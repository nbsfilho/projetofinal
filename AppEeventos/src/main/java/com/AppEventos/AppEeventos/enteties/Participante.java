package com.AppEventos.AppEeventos.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
@TableGenerator(name ="Participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_participante;                                             
    private String email_participante;
    private String telefone_participante;
    private Long id_participante;
    public Participante() {
    	
   
}
	
		public String getNome_participante() {
		return nome_participante;
	}
	public void setNome_participante(String nome_participante) {
		this.nome_participante = nome_participante;
	}
	public String getEmail_participante() {
		return email_participante;
	}
	public void setEmail_participante(String email_participante) {
		this.email_participante = email_participante;
	}
	public String getTelefone_participante() {
		return telefone_participante;
	}
	public void setTelefone_participante(String telefone_participante) {
		this.telefone_participante = telefone_participante;
	}
	public Long getId_participante() {
		return id_participante;
	}
	public void setId_participante(Long id_participante) {
		this.id_participante = id;
	}

	
	
    
    
}


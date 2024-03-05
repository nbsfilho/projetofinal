package com.AppEventos.AppEeventos.enteties;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Palestrante")
public class Palestrante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_palestrante;
    private String email_palestrante;
    private String telefone_palestrante;
    private Long id_palestrante;
    public Palestrante() {
    	
   
	}
	
	
	public String getNome_palestrante() {
		return nome_palestrante;
	}
	public void setNome_palestrante(String nome_palestrante) {
		this.nome_palestrante = nome_palestrante;
	}
	public String getEmail_palestrante() {
		return email_palestrante;
	}
	public void setEmail_palestrante(String email_palestrante) {
		this.email_palestrante = email_palestrante;
	}
	public String getTelefone_palestrante() {
		return telefone_palestrante;
	}
	public void setTelefone_palestrante(String telefone_palestrante) {
		this.telefone_palestrante = telefone_palestrante;
	}
	public Long getId_palestrante() {
		return id_palestrante;
	}
	public void setId_palestrante(Long id_palestrante) {
		this.id_palestrante = id;
	}
	
	
	
}  
    
    
    
    

   
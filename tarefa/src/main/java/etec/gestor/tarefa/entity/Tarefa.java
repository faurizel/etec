package etec.gestor.tarefa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tarefa")
public class Tarefa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5982113195418764741L;
	private Long id;
	private String nomeTarefa;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tarefa_id")
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "tarefa_nome")
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	
	

}

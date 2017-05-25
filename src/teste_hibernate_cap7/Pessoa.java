/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_hibernate_cap7;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author tiago.lucas
 */
@Entity
@Table(name="tb_teste")
//@SequenceGenerator(name="sequencia",sequenceName="seq_id")
public class Pessoa {
    private Long id;
    private String nome;
    public Pessoa(){
        
    }
    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequencia")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}

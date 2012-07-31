/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.condominio.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author carlito
 */
@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames="nome"))
public class Autorizacao implements Serializable {
 
    @Id
    @GeneratedValue
    private int id;
    private String nome;
 
    public Autorizacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 
}
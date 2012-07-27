/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.condominio.model;

/**
 *
 * @author carlito
 */

import java.io.Serializable;
import javax.persistence.*;
 
@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames="nome"))
public class Usuario implements Serializable {
 
    @Id
    private int id;
    private String nome;
    private String senha;
    @Column(name = "ativo", columnDefinition = "BOOLEAN")
    private boolean ativo;
    //@OneToMany
    //private List<Autorizacao> autorizacoes;
 
    public Usuario() {
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
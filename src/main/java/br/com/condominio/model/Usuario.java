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
import java.util.List;
import javax.persistence.*;
 
@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames="nome"))
public class Usuario implements Serializable {
 
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String senha;    
    private boolean ativo;
    @OneToMany(cascade = {CascadeType.REMOVE})
    @JoinTable(joinColumns=@JoinColumn(name="usuario_id"),
            inverseJoinColumns=@JoinColumn(name="autorizacao_id"))
    private List<Autorizacao> autorizacoes;
 
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

    public List<Autorizacao> getAutorizacoes() {
        return autorizacoes;
    }

    public void setAutorizacoes(List<Autorizacao> autorizacoes) {
        this.autorizacoes = autorizacoes;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cep.modelo;

/**
 *
 * @author maria.sousa9
 */

// não vai ter as notações de JPA - parecido com entidade
public class EnderecoDTO  {
    
    private String logradouro;
    private String cep;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public EnderecoDTO() {
    }

    
    public EnderecoDTO(String logradouro, String cep, String complemento, String bairro, String localidade, String uf) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
    
}

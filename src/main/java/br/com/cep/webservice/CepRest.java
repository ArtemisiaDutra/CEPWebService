/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cep.webservice;

import br.com.cep.modelo.EnderecoDTO;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 *
 * @author maria.sousa9
 */
public class CepRest {
    
    private Client client;
    private WebResource webResource;

    public CepRest() {
        ClientConfig clientConfig = new DefaultClientConfig(GensonProvider.class);
        client = Client.create(clientConfig);
        webResource = client.resource("https://viacep.com.br/ws/");
        
    }
    
    public EnderecoDTO pesquisarCep(String cep){
        
        return webResource.path(cep).path("/json").get(EnderecoDTO.class);
    }
    
    public static void main(String[] args) {
        CepRest rest = new CepRest();
        EnderecoDTO endereco = rest.pesquisarCep("88135812");
        System.out.println("Log" + endereco.getLogradouro());
        System.out.println("Bairro" + endereco.getBairro());
        System.out.println("Complemento" + endereco.getComplemento());
        System.out.println("Uf" + endereco.getUf());
        System.out.println("Cidade" + endereco.getLocalidade());
    }
    
    
}

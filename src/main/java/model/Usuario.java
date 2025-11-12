package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import exceptions.EmailInvalidoException;
import exceptions.NomeInvalidoException;

@Entity
@DiscriminatorValue("usuario")


public class Usuario extends Pessoa {
    private Integer matricula;

    protected Usuario(){}
    
    public Usuario(String nome, String email, Integer matricula) throws Exception {
        super(nome, email);
        this.matricula = matricula;

        if(nome == null || nome.length() < 1){
           throw new NomeInvalidoException();
        }

        if(email == null || email.length() < 3){
            throw new EmailInvalidoException();
        }

        
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Matrícula: " + this.getMatricula());
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    
}


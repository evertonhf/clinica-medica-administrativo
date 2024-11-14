package br.edu.imepac.administrativo.entidades;

import lombok.Data;

import java.util.Date;
@Data
public class Funcionario {
    private long id;
    private String usuario;
    private int senha;
    private int idPaciente;
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String contato;
    private String email;
    private Date dataNascimento;

    private Perfil perfil;

    private Especialidade especialidade;
}

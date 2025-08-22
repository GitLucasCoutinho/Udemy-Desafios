package com.project.tdd.comercio.model;

import lombok.Data;

/**
 * Representa um cliente no sistema de comércio.
 * 
 * <p>Contém informações básicas como nome e CPF, que identificam o cliente.
 * Essa classe é usada para associar compras a pessoas físicas.</p>
 * 
 * <p>Gerada com Lombok (@Data), o que automaticamente cria os métodos
 * getters, setters, equals, hashCode e toString.</p>
 * 
 * @author LucasCoutinho
 */
@Data
public class Cliente {

    /**
     * Nome completo do cliente.
     */
    private String nome;

    /**
     * CPF do cliente (Cadastro de Pessoa Física).
     */
    private String cpf;

    /**
     * Construtor para criar uma instância de Cliente com nome e CPF.
     * 
     * @param nome Nome do cliente
     * @param cpf CPF do cliente
     */
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
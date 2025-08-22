package com.project.tdd.comercio.model;

import lombok.Data;

/**
 * Representa um produto disponível para compra no sistema de comércio.
 * 
 * <p>Contém informações como nome e preço, que são utilizados para calcular
 * o valor total de uma {@link com.project.tdd.comercio.model.Compra}.</p>
 * 
 * <p>Gerada com Lombok (@Data), o que automaticamente cria os métodos
 * getters, setters, equals, hashCode e toString.</p>
 * 
 * @author LucasCoutinho
 */
@Data
public class Produto {

    /**
     * Nome do produto.
     */
    private String nome;

    /**
     * Preço unitário do produto.
     */
    private double preco;

    /**
     * Construtor para criar uma instância de Produto com nome e preço.
     * 
     * @param nome Nome do produto
     * @param preco Preço do produto
     */
    public Produto(String nome, double preco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.nome = nome;
        this.preco = preco;

    }

    /**
     * Retorna o preço do produto.
     * 
     * @return Preço do produto
     */
    public double getPreco() {
        return preco;
    }

    // Getters e setters gerados automaticamente pelo Lombok
}
package com.project.tdd.comercio.model;

import java.util.List;
import lombok.Data;

/**
 * Representa uma compra realizada por um cliente no sistema de comércio.
 * 
 * <p>Contém a associação entre um {@link Cliente} e uma lista de {@link Produto}s
 * adquiridos. Essa classe é usada para registrar transações e calcular valores
 * totais posteriormente.</p>
 * 
 * <p>Gerada com Lombok (@Data), o que automaticamente cria os métodos
 * getters, setters, equals, hashCode e toString.</p>
 * 
 * @author LucasCoutinho
 */
@Data
public class Compra {

    /**
     * Cliente que realizou a compra.
     */
    private Cliente cliente;

    /**
     * Lista de produtos adquiridos na compra.
     */
    private List<Produto> produtos;

    /**
     * Construtor para criar uma instância de Compra com cliente e produtos.
     * 
     * @param cliente Cliente que realizou a compra
     * @param produtos Lista de produtos adquiridos
     */
    public Compra(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    /**
     * Retorna a lista de produtos adquiridos na compra.
     * 
     * @return Lista de produtos
     */
    public List<Produto> getProdutos() {
        return produtos;
    }
}
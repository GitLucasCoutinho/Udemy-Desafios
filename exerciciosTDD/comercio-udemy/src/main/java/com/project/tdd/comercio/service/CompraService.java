package com.project.tdd.comercio.service;

import com.project.tdd.comercio.model.*;
import com.project.tdd.comercio.repository.CompraRepository;

import java.util.List;

/**
 * Serviço responsável por realizar operações relacionadas a compras.
 * 
 * <p>Encapsula a lógica de negócio para registrar uma compra e calcular
 * o valor total dos produtos adquiridos. Utiliza um {@link CompraRepository}
 * para persistência dos dados.</p>
 * 
 * @author LucasCoutinho
 */
public class CompraService {

    /**
     * Repositório utilizado para salvar e recuperar compras.
     */
    private CompraRepository compraRepository;

    /**
     * Construtor que recebe uma instância de {@link CompraRepository}.
     * 
     * @param compraRepository Repositório de compras
     */
    public CompraService(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    /**
     * Realiza uma compra associando um cliente a uma lista de produtos.
     * 
     * <p>A compra é persistida no repositório e retornada para uso posterior.</p>
     * 
     * @param cliente Cliente que está realizando a compra
     * @param produtos Lista de produtos adquiridos
     * @return Objeto {@link Compra} representando a transação
     */
    public Compra realizarCompra(Cliente cliente, List<Produto> produtos) {
        Compra compra = new Compra(cliente, produtos);
        compraRepository.salvar(compra);
        return compra;
    }

    /**
     * Calcula o valor total da compra somando os preços dos produtos.
     * 
     * @param compra Compra a ser avaliada
     * @return Valor total da compra
     */
    public double calcularTotalDaCompra(Compra compra) {
        return compra.getProdutos().stream()
                .mapToDouble(Produto::getPreco)
                .sum();
    }
}
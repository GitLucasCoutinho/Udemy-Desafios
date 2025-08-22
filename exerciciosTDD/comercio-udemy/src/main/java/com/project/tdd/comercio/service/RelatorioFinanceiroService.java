package com.project.tdd.comercio.service;

import com.project.tdd.comercio.model.Produto;
import com.project.tdd.comercio.repository.CompraRepository;

/**
 * Serviço responsável por gerar relatórios financeiros com base nas compras realizadas.
 * 
 * <p>Utiliza o {@link CompraRepository} para acessar os dados de compras e calcular
 * o total faturado pelo sistema.</p>
 * 
 * @author LucasCoutinho
 */
public class RelatorioFinanceiroService {

    /**
     * Repositório de compras utilizado para obter os dados financeiros.
     */
    private final CompraRepository compraRepository;

    /**
     * Construtor que recebe uma instância de {@link CompraRepository}.
     * 
     * @param compraRepository Repositório de compras
     */
    public RelatorioFinanceiroService(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    /**
     * Calcula o total faturado somando os preços de todos os produtos vendidos.
     * 
     * <p>Percorre todas as compras registradas e acumula o valor dos produtos
     * adquiridos em cada uma delas.</p>
     * 
     * @return Valor total faturado
     */
    public double calcularTotalFaturado() {
        return compraRepository.listaDeTodasAsCompras()
            .stream()
            .flatMap(compra -> compra.getProdutos().stream())
            .mapToDouble(Produto::getPreco)
            .sum();
    }
}
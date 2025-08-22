package com.project.tdd.comercio.repository;

import java.util.ArrayList;
import java.util.List;
import com.project.tdd.comercio.model.Compra;

/**
 * Implementação em memória do repositório de compras.
 * 
 * <p>Simula um banco de dados utilizando uma lista interna para armazenar
 * objetos {@link Compra}. Ideal para testes e desenvolvimento local sem
 * necessidade de persistência real.</p>
 * 
 * <p>Implementa a interface {@link CompraRepository}.</p>
 * 
 * @author LucasCoutinho
 */
public class CompraRepositoryEmMemoria implements CompraRepository {

    /**
     * Lista interna que armazena as compras realizadas.
     */
    private List<Compra> compras = new ArrayList<>();

    /**
     * Salva uma nova compra na lista em memória.
     * 
     * @param compra Compra a ser registrada
     */
    @Override
    public void salvar(Compra compra) {
        compras.add(compra);
        System.out.println("Compra salva: " + compra.toString());
    }

    /**
     * Retorna uma nova lista contendo todas as compras registradas.
     * 
     * @return Lista de compras
     */
    @Override
    public List<Compra> listaDeTodasAsCompras() {
        return new ArrayList<>(compras);
    }

}
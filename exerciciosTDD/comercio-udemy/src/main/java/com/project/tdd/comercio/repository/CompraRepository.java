package com.project.tdd.comercio.repository;

import java.util.List;
import com.project.tdd.comercio.model.Compra;

/**
 * Interface que define o contrato para persistência de compras no sistema.
 * 
 * <p>Permite salvar novas compras e recuperar a lista de todas as compras realizadas.
 * Implementações dessa interface podem utilizar diferentes estratégias de armazenamento,
 * como banco de dados, memória ou arquivos.</p>
 * 
 * @author LucasCoutinho
 */
public interface CompraRepository {

    /**
     * Retorna a lista completa de todas as compras registradas.
     * 
     * @return Lista de objetos {@link Compra}
     */
    List<Compra> listaDeTodasAsCompras();

    /**
     * Salva uma nova compra no repositório.
     * 
     * @param compra Compra a ser registrada
     */
    void salvar(Compra compra);
}
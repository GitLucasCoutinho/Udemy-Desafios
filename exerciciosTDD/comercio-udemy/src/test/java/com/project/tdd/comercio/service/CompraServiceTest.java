package com.project.tdd.comercio.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.project.tdd.comercio.model.Cliente;
import com.project.tdd.comercio.model.Compra;
import com.project.tdd.comercio.model.Produto;
import com.project.tdd.comercio.repository.CompraRepository;

/**
 * Classe de testes para validar o comportamento da {@link CompraService}
 * e do {@link RelatorioFinanceiroService}.
 * 
 * <p>Utiliza uma implementação em memória do {@link CompraRepository}
 * para simular operações de compra e cálculo de faturamento.</p>
 * 
 * @author LucasCoutinho
 */
class CompraServiceTest {

    /**
     * Testa se o cálculo do total de uma compra individual está correto.
     * 
     * <p>Cria um cliente com dois produtos e verifica se o total calculado
     * corresponde à soma dos preços.</p>
     */
    @Test
    void deveCalcularTotalCorretamente() {
        // Arrange: Criação de clientes, produtos e serviços
        Cliente cliente = new Cliente("Lucas", "1234567890");
        Produto p1Cliente1 = new Produto("P1", 100.0);
        Produto p2Cliente1 = new Produto("P2", 300.0);
        List<Produto> produtosCliente1 = Arrays.asList(p1Cliente1, p2Cliente1);

        CompraRepository compraRepository = new com.project.tdd.comercio.repository.CompraRepositoryEmMemoria();
        CompraService compraService = new CompraService(compraRepository);

        // Act: Execução da compra e cálculo
        Compra compra = compraService.realizarCompra(cliente, produtosCliente1);
        double total = compraService.calcularTotalDaCompra(compra);

        // Assert: Verificação do resultado
        assertEquals(400.0, total);
    }

    /**
     * Testa se o cálculo do total faturado está correto ao considerar múltiplas compras.
     * 
     * <p>Cria dois clientes com dois produtos cada, realiza as compras e verifica
     * se o total faturado corresponde à soma de todos os produtos vendidos.</p>
     */
    @Test
    void deveCalcularTotalFaturadoCorretamente() {
        // Arrange: Criação de clientes, produtos e serviços
        Cliente cliente1 = new Cliente("Lucas", "1234567890");
        Cliente cliente2 = new Cliente("Ddirce", "1234567891");

        Produto p1Cliente1 = new Produto("Notebook", 1200.0);
        Produto p2Cliente1 = new Produto("Monitor", 800.0);
        List<Produto> produtosCliente1 = Arrays.asList(p1Cliente1, p2Cliente1);

        Produto p1Cliente2 = new Produto("Teclado", 400.0);
        Produto p2Cliente2 = new Produto("Mouse", 200.0);
        List<Produto> produtosCliente2 = Arrays.asList(p1Cliente2, p2Cliente2);

        CompraRepository compraRepository = new com.project.tdd.comercio.repository.CompraRepositoryEmMemoria();
        CompraService compraService = new CompraService(compraRepository);

        // Act: Execução das compras
        compraService.realizarCompra(cliente1, produtosCliente1);
        compraService.realizarCompra(cliente2, produtosCliente2);

        double esperado = Stream.of(p1Cliente1, p2Cliente1, p1Cliente2, p2Cliente2)
                .mapToDouble(Produto::getPreco)
                .sum();

        RelatorioFinanceiroService relatorioFinanceiroService = new RelatorioFinanceiroService(compraRepository);
        double total = relatorioFinanceiroService.calcularTotalFaturado();
        System.out.println("total: " + total);

        // Assert: Verificação do resultado
        assertEquals(esperado, total, 0.01);
    }
}
package solucao.strategies.fretestrategies;

import solucao.model.Pedido;

import java.math.BigDecimal;

public class FreteInternacionalStrategy implements FreteStrategy {

    @Override
    public BigDecimal calcularFrete(Pedido pedido) {
        BigDecimal pesoKiloPedido = BigDecimal.valueOf(pedido.getPesoKilo());
        return BigDecimal.valueOf(10).multiply(pesoKiloPedido);
    }
}

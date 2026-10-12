package solucao.strategies.fretestrategies;

import solucao.model.Pedido;

import java.math.BigDecimal;

public class FreteNormalStrategy implements FreteStrategy {
    @Override
    public BigDecimal calcularFrete(Pedido pedido) {
        BigDecimal pesoKiloPedido = BigDecimal.valueOf(pedido.getPesoKilo());
        return BigDecimal.valueOf(2).multiply(pesoKiloPedido);
    }
}

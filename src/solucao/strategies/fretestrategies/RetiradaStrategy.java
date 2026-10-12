package solucao.strategies.fretestrategies;

import solucao.model.Pedido;

import java.math.BigDecimal;

public class RetiradaStrategy implements FreteStrategy {
    @Override
    public BigDecimal calcularFrete(Pedido pedido) {
        return BigDecimal.ONE.multiply(BigDecimal.valueOf(pedido.getPesoKilo()));
    }
}

package solucao.strategies.fretestrategies;

import solucao.model.Pedido;

import java.math.BigDecimal;

public interface FreteStrategy {
    public BigDecimal calcularFrete(Pedido pedido);
}

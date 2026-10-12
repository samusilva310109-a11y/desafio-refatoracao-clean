package solucao.factory.fretefactory;

import solucao.model.Pedido;
import solucao.strategies.fretestrategies.FreteStrategy;

import java.math.BigDecimal;

public abstract class FreteFactory {

    public abstract FreteStrategy createFreteStrategy();

    public BigDecimal calcularFrete(Pedido pedido) {
        FreteStrategy freteStrategy = createFreteStrategy();
        return freteStrategy.calcularFrete(pedido);
    }
}

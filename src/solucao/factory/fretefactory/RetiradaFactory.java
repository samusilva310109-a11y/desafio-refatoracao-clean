package solucao.factory.fretefactory;

import solucao.strategies.fretestrategies.FreteStrategy;
import solucao.strategies.fretestrategies.RetiradaStrategy;

public class RetiradaFactory extends FreteFactory {
    @Override
    public FreteStrategy createFreteStrategy() {
        return new RetiradaStrategy();
    }
}

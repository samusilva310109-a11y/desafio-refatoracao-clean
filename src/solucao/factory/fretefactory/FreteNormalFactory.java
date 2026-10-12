package solucao.factory.fretefactory;

import solucao.strategies.fretestrategies.FreteNormalStrategy;
import solucao.strategies.fretestrategies.FreteStrategy;

public class FreteNormalFactory extends FreteFactory {

    @Override
    public FreteStrategy createFreteStrategy() {
        return new FreteNormalStrategy();
    }
}

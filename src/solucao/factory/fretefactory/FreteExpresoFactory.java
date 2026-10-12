package solucao.factory.fretefactory;

import solucao.strategies.fretestrategies.FreteExpressoStratagy;
import solucao.strategies.fretestrategies.FreteStrategy;

public class FreteExpresoFactory extends FreteFactory {

    @Override
    public FreteStrategy createFreteStrategy() {
        return new FreteExpressoStratagy();
    }
}

package solucao.factory.fretefactory;

import solucao.strategies.fretestrategies.FreteInternacionalStrategy;
import solucao.strategies.fretestrategies.FreteStrategy;

public class FreteInternacionalFactory extends FreteFactory {
    @Override
    public FreteStrategy createFreteStrategy() {
        return new FreteInternacionalStrategy();
    }
}

package solucao.factory.discountfactory;

import solucao.strategies.discountstrategies.VIPDesconto;
import solucao.strategies.discountstrategies.DiscountStrategy;

public class VIPDiscountFactory extends DiscountFactory {

    @Override
    public DiscountStrategy createDiscount() {
        return new VIPDesconto();
    }


}

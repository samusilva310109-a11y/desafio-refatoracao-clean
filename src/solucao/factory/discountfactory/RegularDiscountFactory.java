package solucao.factory.discountfactory;

import solucao.strategies.discountstrategies.RegularDesconto;
import solucao.strategies.discountstrategies.DiscountStrategy;

public class RegularDiscountFactory extends DiscountFactory {

    @Override
    public DiscountStrategy createDiscount() {
        return new RegularDesconto();
    }
}

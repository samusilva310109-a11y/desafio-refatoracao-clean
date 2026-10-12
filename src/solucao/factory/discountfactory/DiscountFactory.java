package solucao.factory.discountfactory;

import solucao.strategies.discountstrategies.DiscountStrategy;

import java.math.BigDecimal;

public abstract class DiscountFactory {

    public abstract DiscountStrategy createDiscount();

    public BigDecimal aplicarDesconto(BigDecimal valor) {
        DiscountStrategy disconto = createDiscount();
        return disconto.aplicarDesconto(valor);
    }
}

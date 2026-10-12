package solucao.model;

import solucao.strategies.discountstrategies.DiscountStrategy;

import java.math.BigDecimal;

public class OrderProcessor {
    private final DiscountStrategy  discountStrategy;

    public OrderProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal aplicaDesconto(BigDecimal valor) {
        return discountStrategy.aplicarDesconto(valor);
    }
}

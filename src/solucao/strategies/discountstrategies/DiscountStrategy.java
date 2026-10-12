package solucao.strategies.discountstrategies;

import java.math.BigDecimal;

public interface DiscountStrategy {
    BigDecimal aplicarDesconto(BigDecimal valor);
}

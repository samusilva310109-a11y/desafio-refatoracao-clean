package solucao.strategies.discountstrategies;

import java.math.BigDecimal;

public class RegularDesconto implements DiscountStrategy {
    @Override
    public BigDecimal aplicarDesconto(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.valueOf(200)) > 0){
            BigDecimal desconto = BigDecimal.valueOf(1).subtract(BigDecimal.valueOf(0.10));
            return valor.multiply(desconto);
        }

        return valor;
    }
}

package solucao.strategies.discountstrategies;

import java.math.BigDecimal;

public class VIPDesconto implements DiscountStrategy {
    @Override
    public BigDecimal aplicarDesconto(BigDecimal valor) {
        BigDecimal desconto =  BigDecimal.valueOf(1).subtract(BigDecimal.valueOf(0.05));

        if(valor.compareTo(BigDecimal.valueOf(100)) > 0){
            desconto = BigDecimal.valueOf(1).subtract(BigDecimal.valueOf(0.15));
            return valor.multiply(desconto);
        }

        return valor.multiply(desconto);
    }
}

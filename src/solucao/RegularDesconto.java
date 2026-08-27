package solucao;

import solucao.interfaces.DiscountStrategy;

public class RegularDesconto implements DiscountStrategy {
    @Override
    public double aplicarDesconto(double valor) {
        if(valor > 200){
            return valor - (valor * 0.10);
        }

        return valor;
    }
}

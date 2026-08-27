package solucao;

import solucao.interfaces.DiscountStrategy;

public class VIPDesconto implements DiscountStrategy {
    @Override
    public double aplicarDesconto(double valor) {
        if(valor > 100){
            return valor - (valor * 0.15);
        }

        return valor - (valor * 0.05);
    }
}

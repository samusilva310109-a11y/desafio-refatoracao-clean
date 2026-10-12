package solucao.model;

import java.math.BigDecimal;

public class Pedido {
    BigDecimal valorTotalPedido;
    BigDecimal valorFinalPedido;
    double pesoKilo;

    public BigDecimal getValorFinalPedido() {
        return valorFinalPedido;
    }

    public void setValorFinalPedido(BigDecimal valorFinalPedido) {
         this.valorFinalPedido = valorFinalPedido;
    }

    public double getPesoKilo() {
        return pesoKilo;
    }

    public void setPesoKilo(double pesoKilo) {
        this.pesoKilo = pesoKilo;
    }

    public BigDecimal getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(BigDecimal valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public void adicionarAoValorFinal(BigDecimal valor) {
        setValorFinalPedido(getValorFinalPedido().add(valor));
    }
}

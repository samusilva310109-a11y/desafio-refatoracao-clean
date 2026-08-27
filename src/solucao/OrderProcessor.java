package solucao;

import solucao.enums.ClientType;

public class OrderProcessor {

    static void main(String[] args) {
        double valor = 10;
        ClientType tipoCliente = ClientType.VIP;

        double desconto = aplicarDesconto(tipoCliente, valor);

        System.out.println("Desconto: " + desconto);
    }

    public static double aplicarDesconto(ClientType tipoCliente, double valor){
        if (tipoCliente == ClientType.VIP){
            return new VIPDesconto().aplicarDesconto(valor);
        }else if (tipoCliente == ClientType.REGULAR){
            return  new RegularDesconto().aplicarDesconto(valor);
        }

        return valor;
    }
}

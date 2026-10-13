package solucao.view;

import solucao.enums.ClientType;
import solucao.factory.discountfactory.RegularDiscountFactory;
import solucao.factory.discountfactory.VIPDiscountFactory;
import solucao.model.OrderProcessor;
import solucao.model.Pedido;
import solucao.strategies.discountstrategies.DiscountStrategy;

import java.math.BigDecimal;
import java.util.Scanner;

public class EscolhaTipoClienteScreen {
    public static  void escolhaTipoCliente(Pedido pedido, Scanner input) {
        try {
            System.out.println("Insira o tipo de cliente (VIP/REGULAR): ");
            ClientType tipoCliente = ClientType
                    .valueOf(
                            input.nextLine().toUpperCase()
                    );

            DiscountStrategy discountStrategy = getDiscountStrategy(tipoCliente);
            BigDecimal valorFinal = new OrderProcessor(discountStrategy)
                    .aplicaDesconto(pedido.getValorTotalPedido());

            pedido.setValorFinalPedido(valorFinal);

        }catch (IllegalArgumentException exception){
            throw new IllegalArgumentException("TIPO DE CLIENTE INVALIDO!!");
        }
    }

    public static DiscountStrategy getDiscountStrategy(ClientType tipoCliente) throws IllegalArgumentException{
        return switch (tipoCliente) {
            case VIP -> new VIPDiscountFactory().createDiscount();
            case REGULAR -> new RegularDiscountFactory().createDiscount();
            default -> throw new IllegalArgumentException("Tipo de cliente INVALIDO!!");
        };
    }
}

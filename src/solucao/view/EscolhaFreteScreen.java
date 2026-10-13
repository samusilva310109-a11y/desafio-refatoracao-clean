package solucao.view;

import solucao.factory.fretefactory.*;
import solucao.model.Pedido;
import solucao.strategies.fretestrategies.FreteStrategy;

import java.util.Scanner;

public class EscolhaFreteScreen {
    public static void escolherFrete(Pedido pedido, Scanner input) {
        try {
            System.out.print(
                    """
                       Escolha o frete:
                         [1] NORMAL
                         [2] EXPRESSO
                         [3] INTERNACIONAL
                         [4] RETIRADA   \s
                           \s"""
            );

            FreteStrategy frete = getFreteStrategy(input.nextInt());
            pedido.adicionarAoValorFinal(frete.calcularFrete(pedido));

        }catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException("TIPO DE FRETE INVALIDO!!");
        }
    }

    public static FreteStrategy getFreteStrategy(int freteType){
        return switch (freteType){
            case 1 -> new FreteNormalFactory().createFreteStrategy();
            case 2 -> new FreteExpresoFactory().createFreteStrategy();
            case 3 -> new FreteInternacionalFactory().createFreteStrategy();
            case 4 ->  new RetiradaFactory().createFreteStrategy();
            default -> throw new IllegalArgumentException("TIPO DE FRETE INVALIDO!!");
        };
    }
}

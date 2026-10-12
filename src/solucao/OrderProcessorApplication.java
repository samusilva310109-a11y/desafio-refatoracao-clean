package solucao;

import solucao.model.Pedido;
import solucao.view.EscolhaFreteScreen;
import solucao.view.EscolhaTipoClienteScreen;
import java.util.Scanner;

public class OrderProcessorApplication {
    private static final Pedido pedido = new Pedido();

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Insira o valor do pedido: ");
            pedido.setValorTotalPedido(input.nextBigDecimal());

            System.out.println("Insira o peso total do pedido: ");
            pedido.setPesoKilo(input.nextDouble());

            EscolhaTipoClienteScreen.escolhaTipoCliente(pedido);
            EscolhaFreteScreen.escolherFrete(pedido);

            System.out.println("Valor Final do Pedido: " +  pedido.getValorFinalPedido());

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());;
        } finally {
            System.out.println("Programa finalizado!");
        }
    }
}

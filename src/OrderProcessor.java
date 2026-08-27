public class OrderProcessor {

    // Processa o pedido, calcula desconto, frete e manda mensagem pro banco e email
    public double p(int t, double v, String c, boolean f, int u) {
        double d = 0;

        // Verifica tipo de cliente (1 = VIP, 2 = REGULAR)
        if (t == 1) {
            if (v > 100) {
                d = v * 0.15;
            } else {
                d = v * 0.05;
            }
        } else if (t == 2) {
            if (v > 200) {
                d = v * 0.10;
            } else {
                d = 0;
            }
        } else {
            System.out.println("Erro: tipo invalido");
            return -1;
        }

        double vf = v - d;

        // Calcula frete baseado no estado
        if (c.equals("SP")) {
            vf += 10.0;
        } else if (c.equals("RJ")) {
            vf += 20.0;
        } else if (c.equals("MG")) {
            vf += 25.0;
        } else {
            vf += 50.0;
        }

        if (f == true) {
            // Cupom de primeira compra
            vf = vf - 15.0;
        }

        // Salva no banco e notifica usuario
        if (vf > 0) {
            System.out.println("Enviando email para usuario " + u + " com valor final de: " + vf);
            System.out.println("Salvando pedido no banco de dados...");
        } else {
            System.out.println("Valor invalido!");
            return -1;
        }

        return vf;
    }
}
public class Main {
    public static void main(String[] args) {

        Pedido pedidoCartao = new Pedido(200.0, new CartaoCreditoStrategy());
        System.out.println("Pagamento com Cartão: R$ " + pedidoCartao.calcularTotal());

        Pedido pedidoPix = new Pedido(200.0, new PixStrategy());
        System.out.println("Pagamento com Pix: R$ " + pedidoPix.calcularTotal());

        Pedido pedidoBoleto = new Pedido(200.0, new BoletoStrategy());
        System.out.println("Pagamento com Boleto: R$ " + pedidoBoleto.calcularTotal());

        Pedido pedidoTroca = new Pedido(200.0, new CartaoCreditoStrategy());
        System.out.println("\nAlterando forma de pagamento...");
        pedidoTroca.alterarEstrategia(new PixStrategy());
        System.out.println("Novo total com Pix: R$ " + pedidoTroca.calcularTotal());
    }
}
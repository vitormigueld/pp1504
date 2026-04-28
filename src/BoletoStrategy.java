public class BoletoStrategy implements PagamentoStrategy {

    private static final double DESCONTO_BOLETO = 0.05;
    private static final double TAXA_EMISSAO    = 2.00;

    @Override
    public double calcular(double valorOriginal) {
        double valorComDesconto = valorOriginal - (valorOriginal * DESCONTO_BOLETO);
        return valorComDesconto + TAXA_EMISSAO;
    }

    @Override
    public String getNome() {
        return "Boleto";
    }
}

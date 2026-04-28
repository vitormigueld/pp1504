public class CartaoCreditoStrategy implements PagamentoStrategy {
    private static final double TAXA_CARTAO = 0.05;

    @Override
    public double calcular(double valorOriginal) {
        return valorOriginal + (valorOriginal * TAXA_CARTAO);
    }

    @Override
    public String getNome() {
        return "Cartão de Crédito";
    }
}

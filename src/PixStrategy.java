public class PixStrategy implements PagamentoStrategy {

    private static final double DESCONTO_PIX = 0.10;

    @Override
    public double calcular(double valorOriginal) {
        return valorOriginal - (valorOriginal * DESCONTO_PIX);
    }

    @Override
    public String getNome() {
        return "Pix";
    }
}
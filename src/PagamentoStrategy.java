public interface PagamentoStrategy {
    double calcular(double valorOriginal);
    String getNome();
}

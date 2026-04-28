public class Pedido {
    private final double valorOriginal;
    private PagamentoStrategy estrategia;

    public Pedido(double valorOriginal, PagamentoStrategy estrategia) {
        this.valorOriginal = valorOriginal;
        this.estrategia = estrategia;
    }
    public double calcularTotal() {
        return estrategia.calcular(valorOriginal);
    }
    public void alterarEstrategia(PagamentoStrategy novaEstrategia) {
        this.estrategia = novaEstrategia;
    }
    public String getNomeEstrategia() {
        return estrategia.getNome();
    }
    public double getValorOriginal() {
        return valorOriginal;
    }
}

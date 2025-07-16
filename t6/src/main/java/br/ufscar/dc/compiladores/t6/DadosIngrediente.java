package br.ufscar.dc.compiladores.t6;
public class DadosIngrediente {
    private int quantidade;
    private String unidadeMedida;

    public DadosIngrediente(double quantidade, String unidadeMedida) {
        this.quantidade = quantidade;
        this.unidadeMedida = unidadeMedida;
    }

    // Métodos "getters" para acessar os valores
    public double getQuantidade() {
        return quantidade;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    // Opcional: Ajuda muito na hora de depurar o código
    @Override
    public String toString() {
        return "Quantidade: " + quantidade + " " + unidadeMedida;
    }
}
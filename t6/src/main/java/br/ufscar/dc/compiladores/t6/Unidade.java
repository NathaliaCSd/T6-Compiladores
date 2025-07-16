package br.ufscar.dc.compiladores.t6;

import br.ufscar.dc.compiladores.t6.ReceitasSemantico.DimensaoUnidade;

public enum Unidade {
    UN   (DimensaoUnidade.UNIDADE, 1.0),
    G    (DimensaoUnidade.MASSA,    1.0),
    KG   (DimensaoUnidade.MASSA, 1000.0),
    ML   (DimensaoUnidade.VOLUME,   1.0),
    L    (DimensaoUnidade.VOLUME,1000.0);

    public final DimensaoUnidade dim;
    public final double fatorParaBase;

    Unidade(DimensaoUnidade d, double f) {
        this.dim = d;
        this.fatorParaBase = f;
    }

    public static Unidade of(String texto) {
        switch (texto) {
            case "un": return UN;
            case "g":  return G;
            case "kg": return KG;
            case "ml": return ML;
            case "l":  return L;
            default:   throw new IllegalArgumentException("Unidade inválida: " + texto);
        }
    }
}

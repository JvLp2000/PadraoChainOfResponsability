package org.example;

public class TipoServicoFreios implements TipoServico {

    private static TipoServicoFreios tipoServicoFreios = new TipoServicoFreios();

    private TipoServicoFreios() {}

    public static TipoServicoFreios getTipoServicoFreios() {
        return tipoServicoFreios;
    }
}

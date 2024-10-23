package org.example;

public class TipoServicoPneus implements TipoServico {

    private static TipoServicoPneus tipoServicoPneus = new TipoServicoPneus();

    private TipoServicoPneus() {}

    public static TipoServicoPneus getTipoServicoPneus() {
        return tipoServicoPneus;
    }
}

package org.example;

public class TipoServicoSuspensao implements TipoServico {

    private static TipoServicoSuspensao tipoServicoSuspensao = new TipoServicoSuspensao();

    private TipoServicoSuspensao() {}

    public static TipoServicoSuspensao getTipoServicoSuspensao() {
        return tipoServicoSuspensao;
    }
}

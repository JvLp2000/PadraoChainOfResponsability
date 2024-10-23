package org.example;

public class Servico {

    private TipoServico tipoServico;

    public Servico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }
}

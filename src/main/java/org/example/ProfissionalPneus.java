package org.example;

public class ProfissionalPneus extends Profissional {

    public ProfissionalPneus(Profissional superior) {
        listaServicos.add(TipoServicoPneus.getTipoServicoPneus());
        setProfissionalSuperior(superior);
    }

    @Override
    public String getDescricaoServico() {
        return "Manutenção nos Pneus";
    }
}

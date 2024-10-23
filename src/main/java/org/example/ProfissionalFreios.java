package org.example;

public class ProfissionalFreios extends Profissional {

    public ProfissionalFreios(Profissional superior) {
        listaServicos.add(TipoServicoFreios.getTipoServicoFreios());
        setProfissionalSuperior(superior);
    }

    @Override
    public String getDescricaoServico() {
        return "Manutenção nos Freios";
    }
}

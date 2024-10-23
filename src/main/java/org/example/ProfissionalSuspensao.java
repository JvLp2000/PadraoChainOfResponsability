package org.example;

public class ProfissionalSuspensao extends Profissional {

    public ProfissionalSuspensao(Profissional superior) {
        listaServicos.add(TipoServicoSuspensao.getTipoServicoSuspensao());
        setProfissionalSuperior(superior);
    }

    @Override
    public String getDescricaoServico() {
        return "Manutenção em Suspensão";
    }
}

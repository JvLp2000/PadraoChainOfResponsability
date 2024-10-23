package org.example;

import java.util.ArrayList;

public abstract class Profissional {

    protected ArrayList<TipoServico> listaServicos = new ArrayList<>();
    private Profissional profissionalSuperior;

    public Profissional getProfissionalSuperior() {
        return profissionalSuperior;
    }

    public void setProfissionalSuperior(Profissional profissionalSuperior) {
        this.profissionalSuperior = profissionalSuperior;
    }

    public abstract String getDescricaoServico();

    public String realizarManutencao(Servico servico) {
        if (listaServicos.contains(servico.getTipoServico())) {
            return getDescricaoServico();
        } else {
            if (profissionalSuperior != null) {
                return profissionalSuperior.realizarManutencao(servico);
            } else {
                return "Serviço não realizado";
            }
        }
    }
}

package org.example;

public class ProfissionalMotor extends Profissional {

    public ProfissionalMotor(Profissional superior) {
        listaServicos.add(TipoServicoMotor.getTipoServicoMotor());
        setProfissionalSuperior(superior);
    }

    @Override
    public String getDescricaoServico() {
        return "Manutenção no Motor";
    }
}

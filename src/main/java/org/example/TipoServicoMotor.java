package org.example;

public class TipoServicoMotor implements TipoServico {

    private static TipoServicoMotor tipoServicoMotor = new TipoServicoMotor();

    private TipoServicoMotor() {}

    public static TipoServicoMotor getTipoServicoMotor() {
        return tipoServicoMotor;
    }
}

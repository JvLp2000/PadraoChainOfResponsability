package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTest {

    ProfissionalSuspensao profissionalSuspensao;
    ProfissionalMotor profissionalMotor;
    ProfissionalPneus profissionalPneus;
    ProfissionalFreios profissionalFreios;

    @BeforeEach
    void setUp() {
        // Criando a cadeia de responsabilidade
        profissionalFreios = new ProfissionalFreios(null);
        profissionalPneus = new ProfissionalPneus(profissionalFreios);
        profissionalMotor = new ProfissionalMotor(profissionalPneus);
        profissionalSuspensao = new ProfissionalSuspensao(profissionalMotor);
    }

    @Test
    void deveRetornarSuspensaoParaServicoSuspensao() {
        assertEquals("Manutenção em Suspensão", profissionalSuspensao.realizarManutencao(new Servico(TipoServicoSuspensao.getTipoServicoSuspensao())));
    }

    @Test
    void deveRetornarMotorParaServicoMotor() {
        assertEquals("Manutenção no Motor", profissionalSuspensao.realizarManutencao(new Servico(TipoServicoMotor.getTipoServicoMotor())));
    }

    @Test
    void deveRetornarPneusParaServicoPneus() {
        assertEquals("Manutenção nos Pneus", profissionalSuspensao.realizarManutencao(new Servico(TipoServicoPneus.getTipoServicoPneus())));
    }

    @Test
    void deveRetornarFreiosParaServicoFreios() {
        assertEquals("Manutenção nos Freios", profissionalSuspensao.realizarManutencao(new Servico(TipoServicoFreios.getTipoServicoFreios())));
    }

    @Test
    void deveRetornarSemManutencaoParaServicoNaoConhecido() {
        TipoServico tipoServicoDesconhecido = new TipoServico() {};
        assertEquals("Serviço não realizado", profissionalSuspensao.realizarManutencao(new Servico(tipoServicoDesconhecido)));
    }
}

package PatterFactory;

import modelo.Orcamento;

import java.math.BigDecimal;

public class IcmsMG implements CauculoPorRegiao{
    @Override
    public BigDecimal CaucloPorRegiao(Orcamento orcamento) {
        return orcamento.valorOrcamento.multiply(new BigDecimal("0.18"));
    }
}

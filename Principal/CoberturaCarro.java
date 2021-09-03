package Principal;

//TODO:algo como uma chave dupla ajudaria a indentificar o tipo e posteriormente a apolice
public class CoberturaCarro implements Cobertura {
    int ID_COBERTURA, ID_SEGURO, TipoCobertura = 1;
    double RCDanosMoraisEsteticos, RCDanosMaterias, RCDanosCorpo, APPMortePassageiro,
            APPInvalidezPassageiro,
            CoberturaPrincipal;
    boolean Atinfurto, TipoFranquia;
    int BonusAuto, BonusRCF, DiasDeCarroReserva;
    String Garagem, TipoFranquiaNome, Nota, AntifurtoNome, NomeCobertura;

    @Override
    public void setNota(String nota) {
        this.Nota = nota;
    }

    @Override
    public void setTipoCobertura(int tipoCobertura) {
        this.TipoCobertura = tipoCobertura;
    }

    @Override
    public int getTipoCobertura() {
        return TipoCobertura;
    }

    @Override
    public void setNomeCobertura(String nome) {
        this.NomeCobertura = nome;
    }

    @Override
    public String getNomeCobertura() {
        return NomeCobertura;
    }
}

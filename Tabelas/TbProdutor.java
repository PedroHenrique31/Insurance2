package Tabelas;

public class TbProdutor extends TabelaTipoEstruturado{
    @Override
    TipoEstruturado constroiTipo(String nome, int id) {
        Produtor temporario;
        temporario=new Produtor(nome,id);
        return temporario;
    }
}

package sistema_iptu;

public class Apartamento extends Imovel{
    private Boolean possuiEleavador;

    public Apartamento(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiEleavador) {
        super(municipio, areaM2, vagas);
        this.possuiEleavador = possuiEleavador;
    }
}

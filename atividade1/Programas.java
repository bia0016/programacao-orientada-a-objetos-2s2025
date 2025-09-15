public class Programas {
    private Integer memoriaRAMalocada;
    private Integer SSDocupado; 
    private Integer nucleos;
    private Integer quantidadeOperacoes;

    public Programas(Integer memoriaRAMalocada, Integer SSDocupado, Integer nucleos, Integer quantidadeOperacoes){
        this.memoriaRAMalocada = memoriaRAMalocada;
        this.SSDocupado = SSDocupado;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public Integer getMemoriaRAMalocada(){
        return this.memoriaRAMalocada;
    }
    public void setMemoriaRAMalocada(Integer memoriaRAMalocada){
        this.memoriaRAMalocada = memoriaRAMalocada;
    }

    public Integer getSSDocupado(){
        return this.SSDocupado;
    }
    public void setSSDocupado(Integer SSDocupado){
        this.SSDocupado = SSDocupado;
    }

    public Integer getNucleos(){
        return this.nucleos;
    }
    public void setNucleos(Integer nucleos){
        this.nucleos = nucleos;
    }

    public Integer getQuantidadeOperacoes(){
        return this.quantidadeOperacoes;
    }
    public void setQuantidadeOperacoes(Integer quantidadeOperacoes){
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}
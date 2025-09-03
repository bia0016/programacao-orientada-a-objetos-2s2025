package atividade1;

public class Programas {
    private Integer memoriaRAMalocada;
    private Integer SSDocupado; 
    private Integer quantidadeOperacoes;

public Programas(Integer memoriaRAMalocada, Integer SSDocupado, Integer quantidadeOperacoes){
    this.memoriaRAMalocada = memoriaRAMalocada;
    this.SSDocupado = SSDocupado;
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

public Integer getQuantidadeOperacoes(){
    return this.quantidadeOperacoes;
}
public void setQuantidadeOperacoes(Integer quantidadeOperacoes){
    this.quantidadeOperacoes = quantidadeOperacoes;
}
}
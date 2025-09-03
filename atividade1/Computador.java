package atividade1;

public class Computador {
    private Integer memoriaRAM; 
    private Integer ssd;
    private Integer nucleos;
    private Double operacoesSegundo;

    public Computador(Integer memoriaRAM, Integer SSD, Integer nucleos, Double operacoesSegundo){
        this.memoriaRAM = memoriaRAM;
        this.ssd = SSD;
        this.nucleos = nucleos;
        this.operacoesSegundo = operacoesSegundo;
    }

    public Integer getMemoriaRAM(){
        return this.memoriaRAM;
    }
    public void setMemoriaRAM(Integer memoriaRAM){
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getSSD(){
        return this.ssd;
    }
    public void setSSD(Integer SSD){
        this.ssd = SSD;
    }

    public Integer getNucleos(){
        return this.nucleos;
    }
    public void setNucleos(Integer nucleos){
        this.nucleos = nucleos;
    }

    public Double getOperacoesSegundo(){
        return this.operacoesSegundo;
    }
    public void setOperacoesSegundo(Double operacoesSegundos){
        this.operacoesSegundo = operacoesSegundo;
    }
}
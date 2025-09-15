public class Computador {
    private Integer memoriaRAM; 
    private Integer ssd;
    private Integer nucleos;
    private Double operacoesSegundos;

    public Computador(Integer memoriaRAM, Integer SSD, Integer nucleos, Double operacoesSegundos){
        this.memoriaRAM = memoriaRAM;
        this.ssd = SSD;
        this.nucleos = nucleos;
        this.operacoesSegundos = operacoesSegundos;
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

    public Double getOperacoesSegundos(){
        return this.operacoesSegundos;
    }
    public void setOperacoesSegundos(Double operacoesSegundos){
        this.operacoesSegundos = operacoesSegundos;
    }
}
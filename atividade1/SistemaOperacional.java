public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador){
        this.computador = computador;
    }
    public Computador getComputador(){
        return computador;
    }
    public void setComputador(Computador computador){
        this.computador = computador;
    }
    
    public Boolean executarPrograma(Programas p){
        if(p.getSSDocupado() > computador.getSSD()){
            System.out.println("Erro: SSD insuficiente para instalar o programa.");
            return false;
        }
        if(p.getMemoriaRAMalocada() > computador.getMemoriaRAM()){
            System.out.println("Erro: memoria RAM insuficiente para executar o programa.");
            return false;
        }
        Double tempoExecucao = (double) p.getQuantidadeOperacoes() / (computador.getOperacoesSegundos() * computador.getNucleos());
        
        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo de execução estimado: " + tempoExecucao + " segundos.");
        return true;
    }
}

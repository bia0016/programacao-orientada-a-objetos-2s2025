public class Radar {
    public Integer limiteVelocidade;
    public String modeloRadar;
    public String localizacao;

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de velocidade: " + this.limiteVelocidade);
        System.out.println("Velocidade avaliada: " + velocidadeAvaliada);
        System.out.println("Placa: " + placa);
    }
    public void avaliarVelocidade(Carro c){
        if(c.velocidade > this.limiteVelocidade){
            emitirNotificacao(c.placa, c.velocidade);
        }
    }
}

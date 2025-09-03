public class Radar {
    public Integer limiteVelocidade;
    public String modeloRadar;
    public String localizacao;

    public Radar(Integer limiteVelocidade, String modeloRadar, String localizacao){
        this.limiteVelocidade = limiteVelocidade;
        this.modeloRadar = modeloRadar;
        this.localizacao = localizacao;
    }

    public void emitirNotificacao(String placa, Integer velocidadeAvaliada){
        System.out.println("Limite de velocidade: " + this.limiteVelocidade);
        System.out.println("Velocidade avaliada: " + velocidadeAvaliada);
        System.out.println("Placa: " + placa);
    }
    public void avaliarVelocidade(Carro c){
        if(c.getVelocidade() > this.limiteVelocidade){
            emitirNotificacao(c.getPlaca(), c.getVelocidade());
        }
    }
}

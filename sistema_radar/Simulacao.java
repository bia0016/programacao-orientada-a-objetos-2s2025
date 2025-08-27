public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.velocidade = 0;
        opala.placa = "ACLR300";
        opala.modelo = "Comodoro";
        opala.ano = 76;

        Radar radar = new Radar();
        radar.modeloRadar = "pardal";
        radar.limiteVelocidade = 60;
        radar.localizacao = "Pistão Sul";

        opala.acelerar();
        opala.acelerar(); 
        opala.acelerar(); 
        opala.acelerar(); 
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();

        radar.avaliarVelocidade(opala);
        opala.acelerar();
        radar.avaliarVelocidade(opala);
        opala.frear();
        radar.avaliarVelocidade(opala);
    }   
}

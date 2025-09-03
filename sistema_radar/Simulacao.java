public class Simulacao {
    public static void main(String[] args) {
        Carro opala = new Carro("ACLR300", 0, 76, "Comodoro"); 
        //new carro - cria um tipo especifico que tenha os objetos inicializados

        Radar radar = new Radar(60, "pardal", "Pistão Sul");
        //new radar - cria um tipo especifico de radar que tenha os objetos dele inicializados
        //metodo construtor - obriga o usuario a passar os dados 

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
        opala.setVelocidade(-900);
        opala.setVelocidade(900);

        radar.avaliarVelocidade(opala);
        opala.acelerar();
        radar.avaliarVelocidade(opala);
        opala.frear();
        radar.avaliarVelocidade(opala);
    }   
}

public class Carro {
    private Integer ano;
    private String modelo;
    private String placa;
    private Integer velocidade;

    public Carro(String placa, Integer velocidade, Integer ano, String modelo){
        this.placa = placa;
        this.velocidade = velocidade;
        this.ano = ano;
        this.modelo = modelo;
    }
    public Integer getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(Integer velocidade){
        if(velocidade != null && velocidade > 0){
            this.velocidade = velocidade;
        }
    }

    public Integer getAno(){
        return this.ano;
    }
    public void setAno(Integer ano){
        if(ano != null && ano > 0){
            this.ano = ano;
        }
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setVelocidade(String modelo){
        this.modelo = modelo;
    }

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void acelerar(){
        this.velocidade += 10;
    }
    public void frear(){
        if(this.velocidade > 0){
            this.velocidade -= 10;
        }
    }
}
package sistema_iptu;

public class Municipio {
    private String nome;
    private String estado;
    private Double precoM2;

    public Municipio(String nome, String estado, Double precoM2) {
        this.nome = nome;
        this.estado = estado;
        this.precoM2 = precoM2;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public String getEstado(){
        return this.estado;
    }
    public void setEstado(){
        this.estado = estado;
    }

    public Double getPrecoM2(){
        return this.precoM2;
    }
    public void setPrecoM2(){
        this.precoM2 = precoM2;
    }
}

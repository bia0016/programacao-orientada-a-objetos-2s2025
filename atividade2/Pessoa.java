public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(){}
    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEmail() {return this.email;}
    public void setEmail(String email) {this.email = email;}

    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }
}

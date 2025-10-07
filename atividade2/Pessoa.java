public class Pessoa {
    protected String nome;
    protected String email;

    public Pessoa(){}
    public Pessoa(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }
}

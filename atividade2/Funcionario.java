public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String cargo){
        this.cargo = cargo;
    }
    public Funcionario(String nome, String email, String cargo){
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }
    
    public String getCargo(){return this.cargo;}
    public void setCargo(String cargo){this.cargo = cargo;}

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Cargo: " + this.cargo);
    }
}

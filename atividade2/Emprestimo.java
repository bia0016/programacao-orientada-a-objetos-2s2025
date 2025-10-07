public class Emprestimo {
    private Pessoa pessoa;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;
    
    public Emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao) {
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Pessoa getPessoa() {return this.pessoa;}
    public void setPessoa(Pessoa pessoa) {this.pessoa = pessoa;}
    public Material getMaterial() {return this.material;}
    public void setMaterial(Material material) {this.material = material;}
    public String getDataEmprestimo() {return this.dataEmprestimo;}
    public void setDataEmprestimo(String dataEmprestimo) {this.dataEmprestimo = dataEmprestimo;}
    public String getDataDevolucao() {return this.dataDevolucao;}
    public void setDataDevolucao(String dataDevolucao) {this.dataDevolucao = dataDevolucao;}
    
    public void exibirDetalhes(){
        System.out.println("--== Empréstimo ==--");
        System.out.println("Data de empréstimo: " + this.dataEmprestimo + " | " + "Data de devolução: " + this.dataDevolucao);
        System.out.println("- Dados do Locatário -");
        this.pessoa.exibirInfo();
        if(material instanceof Livro){
            System.out.println("- Livro -");
            this.material.descricao();
        }
        else if(material instanceof Revista){
            System.out.println("- Revista -");
            this.material.descricao();
        }
        //System.out.println("- Dados do funcionário -");
        //this.pessoa.exibirInfo();
    }

}

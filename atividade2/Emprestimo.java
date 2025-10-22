public class Emprestimo {
    private TomadorEmprestimo tomadorEmprestimo;
    private ItemEmprestavel itemEmprestavel;
    private String dataEmprestimo;
    private String dataDevolucao;
    
    public Emprestimo(TomadorEmprestimo tomadorEmprestimo, ItemEmprestavel itemEmprestavel, String dataEmprestimo, String dataDevolucao) {
        this.tomadorEmprestimo = tomadorEmprestimo;
        this.itemEmprestavel = itemEmprestavel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public TomadorEmprestimo getTomadorEmprestimo() {return this.tomadorEmprestimo;}
    public void setTomadorEmprestimo(TomadorEmprestimo tomadorEmprestimo) {this.tomadorEmprestimo = tomadorEmprestimo;}
    public ItemEmprestavel getItemEmprestavel() {return this.itemEmprestavel;}
    public void setItemEmprestavel(ItemEmprestavel itemEmprestavel) {this.itemEmprestavel = itemEmprestavel;}
    public String getDataEmprestimo() {return this.dataEmprestimo;}
    public void setDataEmprestimo(String dataEmprestimo) {this.dataEmprestimo = dataEmprestimo;}
    public String getDataDevolucao() {return this.dataDevolucao;}
    public void setDataDevolucao(String dataDevolucao) {this.dataDevolucao = dataDevolucao;}
    
    public void exibirDetalhes(){
        System.out.println("--== Empréstimo ==--");
        System.out.println("Data de empréstimo: " + this.dataEmprestimo + " | " + "Data de devolução: " + this.dataDevolucao);
        System.out.println("- Dados do Locatário -");
        this.tomadorEmprestimo.exibirInfo();
        this.itemEmprestavel.descricao();
    }
}

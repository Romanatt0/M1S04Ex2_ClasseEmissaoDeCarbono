package classes;

public class EmissaoCabono {

    private String atividade;
    private int quantidadeEmissao;

    public EmissaoCabono(int quantidadeEmissao) {
        this.quantidadeEmissao = quantidadeEmissao;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public int getQuantidadeEmissao() {
        return quantidadeEmissao;
    }

    public void setQuantidadeEmissao(int quantidadeEmissao) {
        this.quantidadeEmissao = quantidadeEmissao;
    }

    public double calcularEmissao(double minutos) {

        double hora = minutos/60;

        double emissao = quantidadeEmissao*hora;

        return emissao;
    }
}

package exerciciofuncionario;

public class Gerente extends Funcionario{

    private Double valor;

    public double getValor(){
        return valor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }
    public double calcImport(){
        return this.getValor() * 0.10;
    }
}

package exerciciofuncionario;

public class Atendente extends Funcionario{

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcImpost(){
        return this.getValor() * 0.01;
    }
}

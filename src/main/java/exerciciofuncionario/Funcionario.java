/*Vamos pensar em um cenário onde temos funcionários, Esse funcionários podem ser: Gerente, Supervisor, e Atendente.
  cada tipo de funcionário desses tem politicas diferentes de impostos:

        gerente paga 0,1% do salário;
        supervisor paga 0,05% do salário
        atendente paga 0,01% do salário */

package exerciciofuncionario;

public class Funcionario {

    public static void main (String[] args){
        Gerente gerente = new Gerente();
        gerente.setValor(1800.0);
        System.out.println(gerente.calcImport());

        Atendente atendente = new Atendente();
        atendente.setValor(900.0);
        System.out.println(atendente.calcImpost());

        Supervisor supervisor = new Supervisor();
        supervisor.setValor(2500.0);
        System.out.println(supervisor.calcImpost());
    }




}

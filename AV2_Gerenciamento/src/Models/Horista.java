/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
// criando a classe horista sendo uma herança de Funcionario
public class Horista extends Funcionario {
// declaração dos atributos priavaods conforme solicitado na atividade 
    private double salarioHora;
    private int horaTrabalhada;

    /**
     * @return the horaTrabalhada
     */
    //Utilização dos metódos get e set para encapsulamento dos campos utilizados e permitir seu uso eem outras classes, sendo justificado o uso em função dos atributos serem privados
    public int getHoraTrabalhada() {
        return horaTrabalhada;
    }

    /**
     * @param horaTrabalhada the horaTrabalhada to set
     */
    public void setHoraTrabalhada(int horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    /**
     * @return the salarioHora
     */
    public double getSalarioHora() {
        return salarioHora;
    }

    /**
     * @param salarioHora the salarioHora to set
     */
    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
//Utilização da técnica de override (Polimorfismo) para sobrescrever a função de RealizarTarefa, sendo ela originada na classe Funcionario 
    @Override
    //essa função tem o intuito de calcular o salário do Horista , chamando o metodo para tal, e ainda apresentar a sua função e seus respectivos dados
    public void RealizarTarefa() {
        double salarioTotal = CalcularSalarioTotal();
        JOptionPane.showMessageDialog(null, "Função: Horista \n"
                +"Nome: "+ getNome()+"\n"
                +"Idade "+ getIdade()+"\n"
                + "Salário  R$" + salarioTotal);
    }
    
    //Nesse metódo está sendo calculado o salário final do horista com base na formula de salario total = valor da hora x horas trabalhadas

    private double CalcularSalarioTotal() {
        double salarioTotal = getSalarioHora() * getHoraTrabalhada();
        return salarioTotal;
    }
}

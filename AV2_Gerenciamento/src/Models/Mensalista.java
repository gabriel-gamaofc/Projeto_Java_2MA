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
//criação da classe mensalista sendo ela uma herança da classe-mãe Funcionario
public class Mensalista extends Funcionario {

    //Declaração dos atributos conforme solicitado na ativiade
    private double salarioMensal;

    /**
     * @return the salarioMensal
     */
    //Utilização dos metódos get e set para encapsulamento dos campos utilizados e permitir seu uso eem outras classes, sendo justificado o uso em função dos atributos serem privados
    public double getSalarioMensal() {
        return salarioMensal;
    }

    /**
     * @param salarioMensal the salarioMensal to set
     */
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    //Utilização da técnica de override (Polimorfismo) para sobrescrever a função de RealizarTarefa, sendo ela originada na classe Funcionario 
    @Override
    public void RealizarTarefa() {
        //essa função tem o intuito de apresentar a função do mensalista e seus respectivos dados , não utilziadno do metodo para calculo de salario como visto na classe Horista, em função do salário do mensalista ser baseado apenas na declaração do funcionario, logo não nescessita de metódo para calculo de tal.

        JOptionPane.showMessageDialog(null, "Função: Mensalista \n"
                + "Nome: " + getNome() + "\n"
                + "Idade " + getIdade() + "\n"
                + "Salário  R$" + getSalarioMensal());
    }
}

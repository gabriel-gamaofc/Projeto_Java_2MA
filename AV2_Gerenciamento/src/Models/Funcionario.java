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
//criação da classe mãe Funcionario
public class Funcionario {

    //Declaração dos atributos conformes indicados na ativiade
    private String Nome;
    private int Idade;

    /**
     * @return the Nome
     */
    //Utilização dos metódos get e set para encapsulamento dos campos utilizados e permitir seu uso eem outras classes, sendo justificado o uso em função dos atributos serem privados
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Idade
     */
    public int getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    //Essa função tem o intuito de reazliar umaa apresentação geneerica das funções para situar o usuário do que faz cada função antes de quaqleur decisão no programa, sendo essa função sobrescritas nas classes de Horista e Mensalista para uma apresenntaçãoe especifica referente a classe
    public void RealizarTarefa() {
        JOptionPane.showMessageDialog(null, "Função Mensalista: Configura-se  por aquele que recebe mensalmente um salário fixo. \nFunção Horista: Configura-se por aquele que recebe a depender do preço de sua hora e a quantiade de horas trabalhadas.");
    }

}

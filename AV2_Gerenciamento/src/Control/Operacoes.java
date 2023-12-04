/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Models.Horista;
import Models.Mensalista;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
//Foi criado a classe de operações para tornar o codigo maiss limpo e legivel na classe principal , apenas realmente para redução de tamanho de codigo
public class Operacoes {

    //Referente as operações do horista para preencher dados respectivos a sua classe
    public void Operacao_horista() {
        Horista trabalhador_horista = new Horista();

        String nome = JOptionPane.showInputDialog(null, "Diga o seu nome");
        trabalhador_horista.setNome(nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Diga a sua idade"));
        trabalhador_horista.setIdade(idade);

        int horaValor = Integer.parseInt(JOptionPane.showInputDialog(null, "Diga qual o valor de sua hora?"));
        trabalhador_horista.setSalarioHora(horaValor);

        int horas_trabalhadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas horas você já trabalhou?"));
        trabalhador_horista.setHoraTrabalhada(horas_trabalhadas);

        trabalhador_horista.RealizarTarefa();
    }

    //Referente as operações do Mensalista para preencher dados respectivos a sua classe
    public void Operacao_Mensalista() {
        Mensalista trabalhador_mensalista = new Mensalista();

        String nome_mensalista = JOptionPane.showInputDialog(null, "Diga o seu nome");
        trabalhador_mensalista.setNome(nome_mensalista);

        int idade_mensalista = Integer.parseInt(JOptionPane.showInputDialog(null, "Diga a sua idade"));
        trabalhador_mensalista.setIdade(idade_mensalista);

        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Diga qual o valor de seu salário?"));
        trabalhador_mensalista.setSalarioMensal(salario);

        trabalhador_mensalista.RealizarTarefa();
    }
}

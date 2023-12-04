/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package av2_gerenciamento;

import Control.Operacoes;
import Models.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class AV2_Gerenciamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // instância a classe de opereaçoes
        Operacoes ope = new Operacoes();
        //Cria um atributo booleano para controle decisorio no menu inteiro , permitindo o bom funcionamento do laço de repetição do-while
        boolean continuarSimulacao ;
//laço de repetição do-while para controle do menu dinâmico , sendo possivel repetir quantas vezes for desejavel a simulção e em caso de erro a possibilidade de correção sem nescessariamente fechar o programa
        do {
            Funcionario func = new Funcionario();
            //O programa ao inves de imprimir e digitar no console foi optado por utilizar a biblioteca JOptionPane , porém para uso no consolo seria apena substituir os JOptionPane por system.out.println(""); e a biblioteca do scanner
            JOptionPane.showMessageDialog(null, "Bem vindo");
            func.RealizarTarefa();
            //Declarou-se um vetor abaixo para tornar mais facil o mapeamentos dos cliques nos botões propostos no JOptionPane , tanto que o podeer decisorio switch case se refere a essa vetoriação
            String[] opcoes = {"Horista", "Mensalista"};

            int escolha = JOptionPane.showOptionDialog(null, "Você é funcionário:", "Escolha o tipo de funcionário", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
           //Aqui foi optado por usar o nó decisorio switch case ao inves dos if-elses para boas práticas de limpeza e clareza de codigo
            switch (escolha) {
                case 0:
                    // O usuário escolheu Horista
                    ope.Operacao_horista();
                    break;
                case 1:
                    // O usuário escolheu Mensalista
                    ope.Operacao_Mensalista();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida ou caixa de diálogo fechada");

                    break;
            }

            // Pergunta ao usuário se deseja continuar a simulação
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja simular novamente?", "Continuar?", JOptionPane.YES_NO_OPTION);

            continuarSimulacao = (resposta == JOptionPane.YES_OPTION);
        } while (continuarSimulacao);
    }

    

   
}

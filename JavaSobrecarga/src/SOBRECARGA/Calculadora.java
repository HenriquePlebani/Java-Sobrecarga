package SOBRECARGA;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        boolean continuar = false;
        Operacao operacao = new Operacao();

        do {
            String input = JOptionPane.showInputDialog(null,
                    "Digite a operação:\n"
                            + "1- Adição de dois valores inteiros\n"
                            + "2- Subtração\n"
                            + "3- Multiplicação\n"
                            + "4- Divisão\n"
                            + "5- Exponenciação\n"
                            + "6- Fatorial\n"
                            + "7- Adição de três valores\n"
                            + "8- Adição de dois valores textos",
                    "Calculadora", JOptionPane.PLAIN_MESSAGE);

            int tipo = Integer.parseInt(input);

            input = JOptionPane.showInputDialog("Digite o valor 1:");
            int valor1 = Integer.parseInt(input);
            int valor2 = 0;

            if (tipo != 6) {
                input = JOptionPane.showInputDialog("Digite o valor 2:");
                valor2 = Integer.parseInt(input);
            }

            switch (tipo) {

                case 1:
                    JOptionPane.showMessageDialog(null, "Adição de 2 valores inteiros: " + operacao.soma(valor1, valor2));
                    break;

                case 2:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    JOptionPane.showMessageDialog(null, "Subtração = " + operacao.subtracao());
                    break;

                case 3:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    JOptionPane.showMessageDialog(null, "Multiplicação = " + operacao.multiplicacao());
                    break;

                case 4:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    JOptionPane.showMessageDialog(null, "Divisão = " + operacao.divisao());
                    break;

                case 5:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    JOptionPane.showMessageDialog(null, "Exponenciação :" + operacao.exponenciacao()); 
                    
                    break;

                case 6:
                    operacao.setNumeroGenerico1(valor1);
                    JOptionPane.showMessageDialog(null, "Fatorial = " + operacao.getFatorial());
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Adição de 3 valores = " + operacao.soma(valor1, valor2, 78));
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, "Adição de 2 valores textos = " + operacao.soma(Integer.toString(valor1), Integer.toString(valor2)));
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }

            input = JOptionPane.showInputDialog(null, "Quer fazer outro cálculo? (Digite 1 para sim, 0 para não)", "Calculadora", JOptionPane.QUESTION_MESSAGE);
            int escolha = Integer.parseInt(input);
            continuar = (escolha == 1);

        } while (continuar);
        
        
        // ESTRUTURA DE REPETIÇÃO PARA INICIAR UM NOVO CÁLCULO USANDO """ DO / WHILE """ ; 
        
       
        JOptionPane.showMessageDialog(null, "Fechando a calculadora.");

    }
}
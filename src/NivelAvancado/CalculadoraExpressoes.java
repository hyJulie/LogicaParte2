package NivelAvancado;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class CalculadoraExpressoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma expressão (ex: 3 + 5 * 2): ");
        String expressao = scan.nextLine();

        List<String> tokens = separarTokens(expressao);
        double resultado = calcular(tokens);

        System.out.println("Resultado: "+resultado);
        scan.close();
    }

    public static List<String> separarTokens(String exp){
        List<String> tokens = new ArrayList<>(); //guardar tudo separado
        String numero = " "; //juntar os dígitos de um número

        for (char c : exp.toCharArray()){
            if (Character.isDigit(c) || c == '.'){
                numero += c; //vai montando o numero, como 3.5
            } else if (c == ' ') {
                continue; //ignora espaços
            }else {
                if (!numero.isEmpty()){
                    tokens.add(numero); //adicionar numero montado
                    numero = "";
                }
                tokens.add(String.valueOf(c)); //adciona o operador
            }
        }

        if (!numero.isEmpty()){
            tokens.add(numero); //adciona o ultimo numero, se tiver
        }
        return tokens; //retorna a lista => ex: ["3", "+", "5", "*", "2"]
    }

    public static double calcular(List<String> tokens){ //calcular a ordem correta
        for (int i = 0; i < tokens.size(); i++){
            String op = tokens.get(i);
            if (op.equals("*") || op.equals("/")){
                double a = Double.parseDouble(tokens.get(i - 1)); //nummero antes
                double b = Double.parseDouble(tokens.get(i + 1)); //numero depois
                double resultado = op.equals("*") ? a * b : a / b;

                //substitui 3 elementos por um valor
                tokens.set(i - 1, String.valueOf(resultado)); //coloca o resultado antes do numeros antes
                tokens.remove(i); //reoveo o operador
                tokens.remove(i); //remove o numero depois
                i--; //volta uma posição
            }
        }

        //agora resolver + e -
        double resultado = Double.parseDouble(tokens.get(0)); //pega o primeiro numero
        for (int i = 1; i < tokens.size(); i+= 2){
            String op = tokens.get(i); //operador
            double b = Double.parseDouble(tokens.get(i + 1)); //numero depois

            if (op.equals("+")){
                resultado += b;
            } else if (op.equals("-")){
                resultado -= b;
            }
        }

        return resultado;
    }
}
/*
Exemplo e explicação:

    Você digita: 3 + 5 * 2

    O programa separa isso em: ["3", "+", "5", "*", "2"]

    Ele resolve primeiro o 5 * 2 = 10, e vira: ["3", "+", "10"]

    Depois ele faz 3 + 10 = 13

    Mostra na tela: Resultado: 13.0
 */
package br.com.unipar.trabalhobimestral;

import java.util.Scanner;

public class CalculatorClean {
        Double num1, num2, num, result;
        String options;   
    void calculate(){
        System.out.println("Informe o primeiro numero para realizar o calculo");
        Scanner numA = new Scanner(System.in);
        num1 = numA.nextDouble();
        System.out.println("Informe o segundo numero para realizar o calculo");
        Scanner numB = new Scanner(System.in);
        num2 = numB.nextDouble();  
        //Verifica a operação matematica selecionada e chama a função
        if("+".equals(options)){sum(); System.out.println("A soma entre " + num1 + " e " + num2 + " tem como resultado " +  result + "\n"); }
        if("-".equals(options)){sub(); System.out.println("A subtracao entre " + num1 + " e " + num2 + " tem como resultado " +  result + "\n"); }
        if("*".equals(options)){mult();System.out.println("A multiplicacao entre " + num1 + " e " + num2 + " tem como resultado " +  result + "\n");}
        if("/".equals(options)){division();System.out.println("A divisao de " + num1 + " em " + num2 + " tem como resultado " +  result + "\n");}
        if("%".equals(options)){percent();System.out.println(num1 + "% de " + num2 + " e " +  result + "\n");} 
        recalc();
    }
    void option(){
        Integer ok = 0;
        System.out.println("Informe a opcao de calculo desejada usando os simbolos +,  -,  /,  *, raiz, %");
        Scanner read = new Scanner(System.in);
        options = read.next();
        //Verifica se a operação digitada é igual a raiz quadrada e chama a função diretamente
        if("raiz".equals(options)){
        System.out.println("Informe o numero para realizar o operacao de raiz quadrada");
        Scanner numsqrt = new Scanner(System.in);
        num = numsqrt.nextDouble();
        calculatesqrt();
        System.out.println("A raiz quadrada de " + num + " e " + result);
        recalc();
        }
        if("+".equals(options)){ calculate(); /** Este ok valida a saida sem erro **/ok = 1; } 
        if("-".equals(options)){ calculate(); ok = 1;} 
        if("/".equals(options)){ calculate(); ok = 1;} 
        if("%".equals(options)){ calculate(); ok = 1;} 
        if("*".equals(options)){ calculate(); ok = 1;} 
        if(ok == 0 ){error();}
    }
    void error(){
        String Scan;
        System.out.println("Opcao selecionada nao e valida, por gentileza digite repetir para tentar novamente ou digite sair");
        Scanner suboption = new Scanner(System.in);
        Scan = suboption.next();
        if("sair".equals(Scan)){System.out.println("Obrigado por utilizar o nosso programa! Até mais!");
        System.exit(0);
        }
        if("repetir".equals(Scan)){option();
        }else{System.out.println("Opcao invalida tente novamente");
        error();
        }
    }
    void recalc(){
        String Scan;
    System.out.println("Caculo concluido, Deseja realizar outra operacao? digite sim ou nao");
        Scanner recalc = new Scanner(System.in);
        Scan = recalc.next();
        if("nao".equals(Scan)){ System.out.println("Obrigado por utilizar o nosso programa! Ate mais!");
        System.exit(0);}
        if("sim".equals(Scan)){option();
        }else{ System.out.println("Opcao invalida tente novamente");
        error();}
}
    Double sum(){  
        return result = num1 + num2;} 
    Double sub(){
        return result = num1 - num2;}
    Double mult(){
        return result = num1 * num2;}
    Double division(){
        return result = num1 / num2;}
    Double calculatesqrt(){
        return result = Math.sqrt(num);}
    Double percent(){
        return result = (num1 / 100) * num2;}
    public static void main(String[] args) {      
        CalculatorClean calculator = new CalculatorClean();
        calculator.option();             
}  }
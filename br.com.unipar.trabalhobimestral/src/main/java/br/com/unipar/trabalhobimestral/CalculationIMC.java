
package br.com.unipar.trabalhobimestral;

import java.util.Scanner;


public class CalculationIMC {
    Double weight, height, result;
    String sex, decision;
    
    void start(){
        System.out.println("Calcular o Indice de Massa Corporal\n");
        System.out.printf("Informe seu Peso em Kg: ");
        Scanner wgt = new Scanner(System.in);
        weight = wgt.nextDouble();
        System.out.printf("Informe sua Altura em Metros: ");
        Scanner hgt = new Scanner(System.in);
        height = hgt.nextDouble();
        calculate();       
    }
    
    void calculate(){ 
        System.out.printf("informe seu sexo para comparacao f = feminino e m = masculino: ");
        Scanner sx = new Scanner(System.in);
        sex = sx.nextLine();
        result = (weight / (height*height));
        if("f".equals(sex)){tablefem();}
        if("m".equals(sex)){tableman();}
        else{ System.err.println("Opcao invalida"); start();}       
    }
    
    void tablefem(){
        if(result >39.0){System.out.println("Obesidade Morbida");}
        if((result > 29.0) && (result <=38.9)){ System.out.println("Obesidade Moderada");}
        if((result > 24.0)&&(result <=28.9)) { System.out.println("Obesidade Leve");}
        if((result > 19.0) &&(result <= 23.9)){System.out.println("Normal");}
        if(result < 19.0){ System.out.println("Abaixo do Normal");} 
        showtable();
    }
    
    void tableman(){
        if(result >43.0){System.out.println("Obesidade Morbida");}
        if((result > 30.0) && (result <=39.9)){ System.out.println("Obesidade Moderada");}
        if((result > 25.0)&&(result <=29.9)) { System.out.println("Obesidade Leve");}
        if((result > 20.0) &&(result <= 24.9)){System.out.println("Normal");}
        if(result < 20.0){ System.out.println("Abaixo do Normal");} 
        showtable();
    }
    void showtable(){
        System.out.println("Voce deseja ver a tabela utilizada para referencia do resultado? sim ou nao");
        Scanner dec = new Scanner(System.in);
        decision = dec.next();
        if("sim".equals(decision)){System.out.println("IMC - Indice de Massa Corporal    Homem       mulher\n\n"
                                                    + "       Obesidade Morbida         + de 43      + de 39\n"
                                                    + "       Obesidade Moderada       30 a 39,9    29 a 38,9\n"
                                                    + "       Obesidade Leve           25 de 29,9   24 a 28,9\n"
                                                    + "       Normal                   20 de 24,9   19 a 23,9\n"
                                                    + "       Abaixo do Normal          - de 20      - de 19\n\n"
                                                    + "Formula de Calculo IMC - Indice de Massa Corporal\n"
                                                    + "      Peso(em Kgr.)+Altura*Altura(em metros)=IMC\n\n");
        System.out.println("Obrigado por utilizar nosso sistema! Ate mais!");
        System.exit(0);
        }                                           
        if("nao".equals(decision)){ System.out.println("Obrigado por utilizar nosso sistema! Ate mais!"); System.exit(0);} 
        else{System.out.println("Opcao invalida tente novamente");
            showtable(); 
        }   
    }
    public static void main(String[] args){
        CalculationIMC calculate = new CalculationIMC();
        calculate.start();}
}

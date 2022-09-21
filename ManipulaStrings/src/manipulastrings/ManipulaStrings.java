package manipulastrings;

import java.util.Scanner;


public class ManipulaStrings {

    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("___  MENU  ___");
            System.out.println("1 - Tamanho String");
            
            System.out.println("0 - Sair");
            System.out.println("Insira a opção pretendida");
            op = ler.nextInt();
            switch(op){
                case 0: 
                    break;
                case 1:
                    System.out.println("A string inserida tem: "+ExerciciosStrings.contaCaracteres()+" caracteres");
                    break;
                default:
                    System.out.println("Insira uma opção válida");
            }
        }while (op != 0);
    }
    
}

package manipulastrings;


class ExerciciosStrings {
    static String s, s1, s2;
    
    static void leStrings(String texto){
        System.out.println(texto);
        s = ManipulaStrings.ler.next();
        s1 = ManipulaStrings.ler.nextLine();
        s = s+s1;
    }
    
    static int contaCaracteres() {
        System.out.println("Insira um texto");
        s = ManipulaStrings.ler.next();
        s1 = ManipulaStrings.ler.nextLine();
        s = s+s1;
        return s.length();
    }

    static void arvoreCharAt() {
        int x,y;
        String s,s1;
        System.out.println("Insira um texto");
        s = ManipulaStrings.ler.next();
        s1 = ManipulaStrings.ler.nextLine();
        s = s+s1;
        for (x=0;x<s.length();x++){
            for (y=0;y<=x;y++){
                System.out.print(s.charAt(y));
            }
        System.out.println();
        }
        for (x=s.length()-1;x>=0;x--){
            for (y=0;y<x;y++){
                System.out.print(s.charAt(y));
                    }
            System.out.println();
            }
        }    

    static void capitalizaLetras() {
        String texto;
        leStrings("Digite uma frase em MAIÚSCULAS");
        System.out.println(s.toLowerCase());
        leStrings("Digite uma frase em minúsculas");
        System.out.println(s.toUpperCase());
    }

    static void subString() {
        int x,y;
        contaCaracteres();
        for (x=0;x<s.length();x++){
            for (y=0;y<=x;y++){
                System.out.print(s.substring(y,y+1));
            }
            System.out.println();
        }
        for (x=s.length()-1;x>=0;x--){
            for (y=0;y<x;y++){
                System.out.print(s.substring(y,y+1));
                    }
            System.out.println();
            }
    }

    static void substituirPalavra() {
        String texto, alterar, novaPalavra;
        leStrings("Introduza um texto");
        texto = s;
        leStrings("Palavra a alterar");
        alterar = s;
        leStrings("Alterar para");
        novaPalavra = s;
        texto = texto.replace(alterar,novaPalavra);
        System.out.println(texto);
        
        }
}

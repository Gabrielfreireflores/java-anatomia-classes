package edu.gabrielfreire.primeirasemana;

public class MinhaClasse {
        public static void main(String[] args) {
            String primeiroNome = "Gabriel";
            String segundoNome = "Flores";
    
            String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
            
            System.out.println(nomeCompleto);
        }
        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
            //return, para retornar a função(metodo), na main.
            //Usar o operador de soma "+", quando desejo adicionar uma saida a mais no return
        }    
}

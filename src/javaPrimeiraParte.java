public class javaPrimeiraParte {
    public static void main(String[] args) {
       int idade = 25;
       String nome = "Gabriel";
       char caracter = 'G';
       char valor = 66;
       valor = (char)(valor+1);
        System.out.println(valor);
        System.out.println("============================");
        System.out.println(nome+" tem "+idade+" anos de idade.");
        System.out.println("O nome do "+nome+" começa com "+caracter);
        System.out.println("============================");
        if(idade >=18){
            System.out.println("Você é maior de 18 anos");
        }else{
            System.out.println("Você é menor de 18");
        }
        System.out.println("============================");
        for(int i=0; i<5; i++){
            System.out.println("Agora vai "+i);
        }
        System.out.println("============================");
    }
}


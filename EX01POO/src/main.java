import selecao.br.Jogador;

public class main {

    public static void main(String[] args){
        Jogador neymar = new Jogador("Neymar",
                10,31, 1000, "Destro");

        Jogador barnabe = new Jogador();

        Jogador viniJr = new Jogador("Vini JR", 400);

        System.out.println(neymar.qualNome());
        System.out.println(barnabe.qualCamisa());
        System.out.println(viniJr.quantosGols());

    }
}

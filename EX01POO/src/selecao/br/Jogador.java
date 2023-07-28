package selecao.br;

public class Jogador {
    private String nomeDaFera;
    private int numeroDaCamisa;
    private int idadeDaFera;
    private int qntDeGols;
    private String melhorPe;

    public Jogador (){
        this.nomeDaFera = "Desconhecido";
        this.numeroDaCamisa = 0;
        this.idadeDaFera = 0;
        this.qntDeGols = 0;
        this.melhorPe = "Desconhecido";
    }
    public Jogador (String nomeBonito, int numeroDaCamisinha,
                         int idadeBonito, int gols, String pezinho){
        this.nomeDaFera = nomeBonito;
        this.numeroDaCamisa = numeroDaCamisinha;
        this.idadeDaFera = idadeBonito;
        this.qntDeGols = gols;
        this.melhorPe = pezinho;
    }

    public Jogador (String nomeCheiroso, int totalGols){
        this.nomeDaFera = nomeCheiroso;
        this.qntDeGols = totalGols;
    }

    public String qualNome(){
        return this.nomeDaFera;
    }

    public int quantosGols(){
        return this.qntDeGols;
    }

    public int qualCamisa(){
        return this.numeroDaCamisa;
    }


}

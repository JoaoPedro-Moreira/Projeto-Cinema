import java.util.ArrayList;

public class Filme {
    private final String titulo;
    private final int duracao, faixaetaria;
    private String categoria;
    private String sinopse;


    public Filme(String titulo, int duracao, int faixaetaria, String categoria){
        if (duracao < 0){
            duracao=90;
        }

        if (faixaetaria<0){
            faixaetaria=0;
        }

        this.titulo = titulo;
        this.categoria = categoria;
        sinopse = "Não Informada";
        this.duracao = duracao;
        this.faixaetaria = faixaetaria;
    }

    public Filme(String titulo, int duracao){
        if (duracao < 0){
            duracao = 90;
        }

        this.titulo = titulo;
        categoria = "ação";
        sinopse = "Não Informada";
        this.duracao = duracao;
        faixaetaria = 0;
    }
    public String getCategoria(){return categoria;}

    public String getTitulo(){
        return titulo;
    }

    public int getDuracao(){
        return duracao;
    }

    public int getFaixaetaria(){
        return faixaetaria;
    }

    public String getSinopse() {
        return sinopse;
    }

    public boolean setSinopse(String novasinopse){
        sinopse=novasinopse;
        return true;
    }

    public boolean setCategoria(String novacategoria){
        novacategoria=novacategoria.toLowerCase().trim();
        ArrayList<String> ListaCategoria = new ArrayList<>();
        ListaCategoria.add("ação");
        ListaCategoria.add("aventura");
        ListaCategoria.add("comédia");
        ListaCategoria.add("drama");
        ListaCategoria.add("terror");

        if (ListaCategoria.contains(novacategoria)){
            categoria=novacategoria;
            return true;
        }

        return false;
    }

    public boolean ConsultarIdade(int idade){
        if (idade>=faixaetaria){
            return true;
        }

        return false;
    }


}

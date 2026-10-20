import java.time.LocalTime;

public class Sessao {
    private final int capacidademax;
    private int quantingressosvendidos;
    private double valorarrecadado;
    private final String codigoideneficador;
    private final Filme filmesessao;
    private final LocalTime horario;
    private int hora, minuto;
    private static double valoringresso = 20;

    public Sessao(String codigoideneficador,Filme filmesessao, int capacidademax,int hora, int minuto){
        if (capacidademax<0){
            capacidademax=50;
        }
        this.codigoideneficador=codigoideneficador;
        this.filmesessao=filmesessao;
        this.horario=LocalTime.of(hora,minuto);
        this.capacidademax=capacidademax;
        this.valorarrecadado=0;
        this.quantingressosvendidos=0;
    }

    public Sessao(String codigoideneficador,Filme filmesessao,int hora, int minuto){
        this.codigoideneficador=codigoideneficador;
        this.filmesessao=filmesessao;
        this.horario=LocalTime.of(hora,minuto);
        this.capacidademax=50;
        this.valorarrecadado=0;
        this.quantingressosvendidos=0;
    }

    public LocalTime getHorario(){
        return horario;
    }

    public String getCodigoideneficador(){
        return codigoideneficador;
    }

    public Filme getFilmesessao(){
        return filmesessao;
    }

    public int getCapacidademax(){
        return capacidademax;
    }

    public double getValorarrecadado(){
        return valorarrecadado;
    }

    public int getQuantingressosvendidos(){
        return quantingressosvendidos;
    }

    public int getLugaresdisponiveis(){
        return (capacidademax-quantingressosvendidos);
    }


    public static double getValoringresso(){
        return valoringresso;
    }

    public static boolean setValoringresso(double novovaloringresso){
        if (novovaloringresso<0){
            return false;
        }

        valoringresso=novovaloringresso;
        return true;
    }

    public int Compraringresso(int idade,  String documentomeia){
        documentomeia=documentomeia.toLowerCase().trim();
        if ((capacidademax-quantingressosvendidos)<=0){
            return -3;
        }

        if (idade < 0 || documentomeia.isEmpty()){
            return -1;
        }


        if (idade < filmesessao.getFaixaetaria()){
            return -2;
        }



        quantingressosvendidos++;
        valorarrecadado+=(valoringresso/2);
        return 1;
    }

    public int Compraringresso(int idade){
        if ((capacidademax-quantingressosvendidos)<=0){
            return -3;
        }

        if (idade < 0){
            return -1;
        }

        if (idade < filmesessao.getFaixaetaria()){
            return -2;
        }

        quantingressosvendidos++;
        valorarrecadado+=(valoringresso);
        return 1;
    }

    public LocalTime getHorariotermino(){
        return horario.plusMinutes(filmesessao.getDuracao());
    }

}

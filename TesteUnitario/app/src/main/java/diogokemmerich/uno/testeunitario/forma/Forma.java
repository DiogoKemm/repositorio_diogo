package diogokemmerich.uno.testeunitario.forma;

public abstract class Forma {
    private double[] numeroDeMedidas;
    private int TAMANHO_MAXIMO = 3;
   // private int RuntimeException;

    public Forma(int numMedidas) {
        numeroDeMedidas = new double[numMedidas];
    }

    public double getMedida(int posicao){
        if(posicao >= 0 && posicao <= TAMANHO_MAXIMO){
            return numeroDeMedidas[posicao];
        }else
            throw new RuntimeException("Número inválido para caulculo da área.");

    }

    public void setMedida(int posicao, double medida){
        numeroDeMedidas[posicao] = medida;
    }

    public abstract double area();
}



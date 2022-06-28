package diogokemmerich.uno.tddtesteunitrio.formas;

public abstract class Forma {
    private double[] numero;
    private int TAMANHO_MAXIMO = 3;

    public Forma(int numMedidas) {
        numero = new double[numMedidas];
    }

    public Forma() {
    }

    public double getMedida(int i) {
        if (i > 0 && i <= TAMANHO_MAXIMO) {
            return numero[i];
        } else {
            throw new RuntimeException("Número inválido p/ calculo da área");
        }
    }

    public void setMedida(int posicao, double medida){
        numero[posicao] = medida;
    }


    public abstract double area(int i);

}

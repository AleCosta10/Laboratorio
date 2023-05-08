package ar.org.centro8.entities;

public class Radio {
    private String marcaRadio;
    private int potencia;

    public Radio(String marcaRadio, int potencia) {
        this.marcaRadio = marcaRadio;
        this.potencia = potencia;

    }

    @Override
    public String toString() {
        return "[marca=" + marcaRadio + ", potencia= " + potencia + "]";

    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getMarcaRadio() {
        return marcaRadio;
    }

    public void setMarcaRadio(String marcaRadio) {
        this.marcaRadio = marcaRadio;
    }

}
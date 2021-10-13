package Tema2;

public class AnimalJava {
    private byte edad;
    private short peso;
    private char sexo;
    private String pais;

    public AnimalJava (byte edad, short peso, char sexo, String pais) {
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.pais = pais;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

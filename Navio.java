import java.util.*;
import java.text.*;
public class Navio {
    String matricula, nome;
    float comprimento;

    public Navio(String mat,String nm,float comp){
        matricula = mat;
        nome = nm;
        comprimento = comp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
}
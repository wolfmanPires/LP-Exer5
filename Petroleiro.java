import java.util.*;
import java.text.*;

public class Petroleiro extends Navio{
    float capCarga;
    public Petroleiro (String mat, String nm, float comp, float cc){
        super(mat,nm,comp);
        capCarga = cc;
    }

    public float getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }
}
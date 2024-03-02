import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        Porto porto = new Porto();
        Navio nav;
        PortaContentores pc;
        Petroleiro pt;
        nav = new Navio("1234","Prim",10);
        pc = new PortaContentores("2345","PortaPrim",21,40);
        pt = new Petroleiro("6789","PetrolPrim",40,30.1);
        porto.addNavio(nav);
        porto.addPortaCont(pc);
        porto.addPetrols(pt);
        nav = new Navio("abd","Segun",6);
        pt = new Petroleiro("2345","PetrolErr",21,40);
        pc = new PortaContentores("abd","PortContErr",21,40);
        porto.addNavio(nav);
        porto.addPortaCont(pc);
        porto.addPetrols(pt);
        porto.listaPorto();
    }
}
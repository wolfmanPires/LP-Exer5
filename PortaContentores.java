import java.util.*;
import java.text.*;
public class PortaContentores extends Navio{
    int maxCont;
    public PortaContentores(String mat, String nm, float comp, int mc) {
        super(mat, nm, comp);
        maxCont = mc;
    }

    public int getMaxCont() {
        return maxCont;
    }

    public void setMaxCont(int maxCont) {
        this.maxCont = maxCont;
    }
}

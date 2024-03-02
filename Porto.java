import java.util.*;
import java.text.*;
public class Porto {
    ArrayList<Navio> navios;
    ArrayList<PortaContentores> portaConts;
    ArrayList<Petroleiro> petrols ;

    public Porto(){
        navios = new ArrayList<Navio>();
        portaConts = new ArrayList<PortaContentores>();
        petrols = new ArrayList<Petroleiro>();
    }

    public void addNavio(Navio nav){
        if (verificarExiste(nav.getMatricula())==true){
            System.out.println(Aviso! Uma embarcação com essa matrícula já existe no porto!);
        }else{
            navios.add(nav);
        }
    }
    public void addPortaCont(PortaContentores nav){
        if (verificarExiste(nav.getMatricula())==true){
            System.out.println(Aviso! Uma embarcação com essa matrícula já existe no porto!);
        }else{
            portaConts.add(nav);
        }
    }
    public void addPetrols(Petroleiro nav){
        if (verificarExiste(nav.getMatricula())==true){
            System.out.println(Aviso! Uma embarcação com essa matrícula já existe no porto!);
        }else{
            petrols.add(nav);
        }
    }

    public boolean verificarExiste(String matric){
        for (int i=0;i<navios.size();i++){
            if (navios.get(i).getMatricula().equals(matric)==true){
                return true;
            }
        }
        for (int i=0;i<portaConts.size();i++){
            if (portaConts.get(i).getMatricula().equals(matric)==true){
                return true;
            }
        }
        for (int i=0;i<petrols.size();i++){
            if (petrols.get(i).getMatricula().equals(matric)==true){
                return true;
            }
        }
        return false;
    }

    
}

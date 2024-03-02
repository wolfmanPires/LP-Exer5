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
            System.out.println("Aviso! Uma embarcação com essa matrícula já existe no porto!");
        }else{
            System.out.println("Nova embarcação adicionada ao porto.");
            navios.add(nav);
        }
    }
    public void addPortaCont(PortaContentores nav){
        if (verificarExiste(nav.getMatricula())==true){
            System.out.println("Aviso! Uma embarcação com essa matrícula já existe no porto!");
        }else{
            System.out.println("Nova embarcação adicionada ao porto.");
            portaConts.add(nav);
        }
    }
    public void addPetrols(Petroleiro nav){
        if (verificarExiste(nav.getMatricula())==true){
            System.out.println("Aviso! Uma embarcação com essa matrícula já existe no porto!");
        }else{
            System.out.println("Nova embarcação adicionada ao porto.");
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

    public int totalCont(){
        int total=0;
        for(int i=0;i<portaConts.size();i++){
            total+=portaConts.get(i).getMaxCont();
        }
        return total;
    }

    public float totalCapacidade(){
        float total=0;
        for(int i=0;i<portaConts.size();i++){
            total+=(portaConts.get(i).getMaxCont())*10;
        }for(int i=0;i<petrols.size();i++){
            total+=petrols.get(i).getCapCarga();
        }
        return total;
    }

    public void listaPorto(){
        System.out.println("Navios normais:");
        for (int i=0;i<navios.size();i++){
            System.out.println("Matrícula: "+navios.get(i).getMatricula()+
                    "; Nome: "+navios.get(i).getNome()+"; Comprimento: "+navios.get(i).getComprimento()+" metros.");
        }
        System.out.println("Navios porta contentores:");
        for (int i=0;i<portaConts.size();i++){
            System.out.println("Matrícula: "+portaConts.get(i).getMatricula()+
                    "; Nome: "+portaConts.get(i).getNome()+"; Comprimento: "+portaConts.get(i).getComprimento()+" metros; Contentores: "+
                    portaConts.get(i).getMaxCont());
        }
        System.out.println("Navios petroleiros:");
        for (int i=0;i<petrols.size();i++){
            System.out.println("Matrícula: "+petrols.get(i).getMatricula()+
                    "; Nome: "+petrols.get(i).getNome()+"; Comprimento: "+petrols.get(i).getComprimento()+" metros; Capacidade de Carga: "+
                    petrols.get(i).getCapCarga());
        }
    }
}

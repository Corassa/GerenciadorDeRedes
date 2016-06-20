package gerenciadorderedes.dao;

import gerenciadorderedes.util.Perfis;
import java.util.ArrayList;

/**
 *
 * @author PABLO
 */
public class PerfisDAO {
    ArrayList<Perfis> perfil = new ArrayList<>();

    public PerfisDAO() {
    }
    
    
    public void criarPerfil(Perfis perf){
        perfil.add(perf);
    }
}

package gerenciadorderedes.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class Perfis {
    
    private String nome;
    private boolean WEB;
    private boolean WPA;
    private boolean WPA2;
    private boolean WPA_PSK;
    private boolean WPA2_PSK;
    private String intensidadeSinal;
    private int[] portas = new int[10];
    

    public Perfis() {
    }

    public Perfis(String nome, boolean WEB, boolean WPA, boolean WPA2, boolean WPA_PSK, boolean WPA2_PSK, String intensidadeSinal, int[] portas) {
        this.nome = nome;
        this.WEB = WEB;
        this.WPA = WPA;
        this.WPA2 = WPA2;
        this.WPA_PSK = WPA_PSK;
        this.WPA2_PSK = WPA2_PSK;
        this.intensidadeSinal = intensidadeSinal;
        this.portas = portas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the WEB
     */
    public boolean isWEB() {
        return WEB;
    }

    /**
     * @param WEB the WEB to set
     */
    public void setWEB(boolean WEB) {
        this.WEB = WEB;
    }

    /**
     * @return the WPA
     */
    public boolean isWPA() {
        return WPA;
    }

    /**
     * @param WPA the WPA to set
     */
    public void setWPA(boolean WPA) {
        this.WPA = WPA;
    }

    /**
     * @return the WPA2
     */
    public boolean isWPA2() {
        return WPA2;
    }

    /**
     * @param WPA2 the WPA2 to set
     */
    public void setWPA2(boolean WPA2) {
        this.WPA2 = WPA2;
    }

    /**
     * @return the WPA_PSK
     */
    public boolean isWPA_PSK() {
        return WPA_PSK;
    }

    /**
     * @param WPA_PSK the WPA_PSK to set
     */
    public void setWPA_PSK(boolean WPA_PSK) {
        this.WPA_PSK = WPA_PSK;
    }

    /**
     * @return the WPA2_PSK
     */
    public boolean isWPA2_PSK() {
        return WPA2_PSK;
    }

    /**
     * @param WPA2_PSK the WPA2_PSK to set
     */
    public void setWPA2_PSK(boolean WPA2_PSK) {
        this.WPA2_PSK = WPA2_PSK;
    }

    /**
     * @return the intensidadeSinal
     */
    public String getIntensidadeSinal() {
        return intensidadeSinal;
    }

    /**
     * @param intensidadeSinal the intensidadeSinal to set
     */
    public void setIntensidadeSinal(String intensidadeSinal) {
        this.intensidadeSinal = intensidadeSinal;
    }

    /**
     * @return the portas
     */
    public int[] getPortas() {
        return portas;
    }

    /**
     * @param portas the portas to set
     */
    public void setPortas(int[] portas) {
        this.portas = portas;

    }
    
}

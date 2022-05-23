/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cneto
 */
public class ServidorSmtp {
    private String servidor;
    private int porta;
    private String usuario;
    private String senha;
    private boolean utilizaSsl;
    private boolean utilizaTls;
    private boolean utilizaStartTls;
    private boolean utilizaStartTlsRequired;

    /**
     * @return the servidor
     */
    public String getServidor() {
        return servidor;
    }

    /**
     * @param servidor the servidor to set
     */
    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    /**
     * @return the porta
     */
    public int getPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(int porta) {
        this.porta = porta;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the utilizaSsl
     */
    public boolean isUtilizaSsl() {
        return utilizaSsl;
    }

    /**
     * @param utilizaSsl the utilizaSsl to set
     */
    public void setUtilizaSsl(boolean utilizaSsl) {
        this.utilizaSsl = utilizaSsl;
    }

    /**
     * @return the utilizaTls
     */
    public boolean isUtilizaTls() {
        return utilizaTls;
    }

    /**
     * @param utilizaTls the utilizaTls to set
     */
    public void setUtilizaTls(boolean utilizaTls) {
        this.utilizaTls = utilizaTls;
    }

    /**
     * @return the utilizaStartTls
     */
    public boolean isUtilizaStartTls() {
        return utilizaStartTls;
    }

    /**
     * @param utilizaStartTls the utilizaStartTls to set
     */
    public void setUtilizaStartTls(boolean utilizaStartTls) {
        this.utilizaStartTls = utilizaStartTls;
    }

    /**
     * @return the utilizaStartTlsRequired
     */
    public boolean isUtilizaStartTlsRequired() {
        return utilizaStartTlsRequired;
    }

    /**
     * @param utilizaStartTlsRequired the utilizaStartTlsRequired to set
     */
    public void setUtilizaStartTlsRequired(boolean utilizaStartTlsRequired) {
        this.utilizaStartTlsRequired = utilizaStartTlsRequired;
    }
    
}

package modelo;
// Generated 17/10/2015 22:43:46 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MaquinasExecutarScript generated by hbm2java
 */
@Entity
@Table(name = "maquinas_executar_script", schema = "public"
)
public class MaquinasExecutarScript implements java.io.Serializable {

    private int id;
    private ExecucaoScript execucaoScript;
    private Maquina maquina;
    private Boolean sucesso;
    private String retorno;
    private Date dtRetorno;

    public MaquinasExecutarScript() {
    }

    public MaquinasExecutarScript(int id, ExecucaoScript execucaoScript, Maquina maquina) {
        this.id = id;
        this.execucaoScript = execucaoScript;
        this.maquina = maquina;
    }

    public MaquinasExecutarScript(int id, ExecucaoScript execucaoScript, Maquina maquina, Boolean sucesso, String retorno, Date dtRetorno) {
        this.id = id;
        this.execucaoScript = execucaoScript;
        this.maquina = maquina;
        this.sucesso = sucesso;
        this.retorno = retorno;
        this.dtRetorno = dtRetorno;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_executar_script", nullable = false)
    public ExecucaoScript getExecucaoScript() {
        return this.execucaoScript;
    }

    public void setExecucaoScript(ExecucaoScript execucaoScript) {
        this.execucaoScript = execucaoScript;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_maquina", nullable = false)
    public Maquina getMaquina() {
        return this.maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Column(name = "sucesso")
    public Boolean getSucesso() {
        return this.sucesso;
    }

    public void setSucesso(Boolean sucesso) {
        this.sucesso = sucesso;
    }

    @Column(name = "retorno")
    public String getRetorno() {
        return this.retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dt_retorno", length = 29)
    public Date getDtRetorno() {
        return this.dtRetorno;
    }

    public void setDtRetorno(Date dtRetorno) {
        this.dtRetorno = dtRetorno;
    }

}

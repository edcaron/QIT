package modelo;
// Generated 17/10/2015 22:43:46 by Hibernate Tools 4.3.1

import controle.IModelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PlacaRede generated by hbm2java
 */
@Entity
@Table(name = "placa_rede", schema = "public"
)
public class PlacaRede implements java.io.Serializable, IModelo {

    private int id;
    private Maquina maquina;
    private Usuario usuario;
    private String nome;
    private String ipv4;
    private String ipv6;
    private String mac;
    private Boolean principal;

    public PlacaRede() {
    }

    public PlacaRede(int id, Maquina maquina) {
        this.id = id;
        this.maquina = maquina;
    }

    public PlacaRede(int id, Maquina maquina, Usuario usuario, String nome, String ipv4, String ipv6, String mac, Boolean principal) {
        this.id = id;
        this.maquina = maquina;
        this.usuario = usuario;
        this.nome = nome;
        this.ipv4 = ipv4;
        this.ipv6 = ipv6;
        this.mac = mac;
        this.principal = principal;
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
    @JoinColumn(name = "id_maquina", nullable = false)
    public Maquina getMaquina() {
        return this.maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario_modificador")
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Column(name = "nome", length = 100)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "ipv4", length = 15)
    public String getIpv4() {
        return this.ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    @Column(name = "ipv6", length = 39)
    public String getIpv6() {
        return this.ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    @Column(name = "mac", length = 17)
    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Column(name = "principal")
    public Boolean getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }

}

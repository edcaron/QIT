package modelo;
// Generated 14/09/2015 13:16:36 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", schema = "public"
)
public class Usuario implements java.io.Serializable {

    private int id;
    private Grupo grupo;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private boolean ativo;
    private Date dtCriacao;
    private char tipoPermissao;
    private Set<Permissao> permissaos = new HashSet<Permissao>(0);

    public Usuario() {
    }

    public Usuario(int id, Grupo grupo, String nome, String login, String senha, String email, boolean ativo, Date dtCriacao, char tipoPermissao) {
        this.id = id;
        this.grupo = grupo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.ativo = ativo;
        this.dtCriacao = dtCriacao;
        this.tipoPermissao = tipoPermissao;
    }

    public Usuario(int id, Grupo grupo, String nome, String login, String senha, String email, boolean ativo, Date dtCriacao, char tipoPermissao, Set<Permissao> permissaos) {
        this.id = id;
        this.grupo = grupo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.ativo = ativo;
        this.dtCriacao = dtCriacao;
        this.tipoPermissao = tipoPermissao;
        this.permissaos = permissaos;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false)
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_grupo", nullable = false)
    public Grupo getGrupo() {
        return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Column(name = "nome", nullable = false, length = 150)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "login", nullable = false, length = 20)
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "senha", nullable = false, length = 32)
    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Column(name = "email", nullable = false, length = 100)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "ativo", nullable = false)
    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_criacao", nullable = false, length = 13)
    public Date getDtCriacao() {
        return this.dtCriacao;
    }

    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    @Column(name = "tipo_permissao", nullable = false, length = 1)
    public char getTipoPermissao() {
        return this.tipoPermissao;
    }

    public void setTipoPermissao(char tipoPermissao) {
        this.tipoPermissao = tipoPermissao;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Permissao> getPermissaos() {
        return this.permissaos;
    }

    public void setPermissaos(Set<Permissao> permissaos) {
        this.permissaos = permissaos;
    }

}
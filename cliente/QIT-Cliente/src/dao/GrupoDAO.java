/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controle.HibernateUtil;
import controle.IModelo;
import java.util.ArrayList;
import java.util.List;
import modelo.Grupo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Tiago
 */
public class GrupoDAO {

    private Session sessao = null;

    public GrupoDAO() {
        sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public boolean salvar(Grupo grupo) {
        boolean retorno = false;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();

            sessao.saveOrUpdate(grupo);
            t.commit();
            retorno = true;
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public ArrayList<Grupo> listar(IModelo grupo) {
        List resultado = null;

        ArrayList<Grupo> lista = new ArrayList<>();
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            String sql = "from Grupo g where lower(g.nome) like lower('%" + grupo.getNome() + "%') order by g.id desc";

            if (grupo.getNome().equals("")) {
                sql = "from Grupo g order by g.id desc";
            }

            org.hibernate.Query q = sessao.createQuery(sql);
            resultado = q.list();

            for (Object o : resultado) {
                Grupo s = ((Grupo) ((Object) o));
                lista.add(s);
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return lista;
    }

    /**
     *
     * @param predio
     * @return Usuario
     */
    public Grupo consultar(Grupo grupo) {
        List resultado = null;
        Grupo predioLocal = new Grupo();
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from Predio p where p.id = " + grupo.getId());
            resultado = q.list();

            predioLocal = ((Grupo) ((Object[]) resultado.get(0))[0]);

        } catch (HibernateException he) {
            System.err.println("Erro em consultar predio \n" + he);
        } finally {
            sessao.close();
        }
        return predioLocal;
    }
}
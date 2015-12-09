/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controle.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import modelo.MaquinasExecutarScript;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author eduar_000
 */
public class MaquinasExecutarScriptDAO {

    Session sessao = null;

    public MaquinasExecutarScriptDAO() {
        sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public boolean salvar(MaquinasExecutarScript obj) {
        boolean retorno = false;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();
            sessao.saveOrUpdate(obj);            
            t.commit();
            retorno = true;
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }
    
    public boolean merge(MaquinasExecutarScript obj) {
        boolean retorno = false;
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            Transaction t = sessao.beginTransaction();
            sessao.merge(obj);            
            t.commit();
            retorno = true;
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }
        return retorno;
    }

    public ArrayList<MaquinasExecutarScript> listar(MaquinasExecutarScript obj) {
        List resultado = null;

        ArrayList<MaquinasExecutarScript> lista = new ArrayList<>();
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            String sql = "";

            if (obj.getMaquina().getHost().equals("")) {
                sql = "from MaquinasExecutarScript mes "
                    + "inner join mes.maquina as m "
                    + "inner join mes.execucaoScript as es "
//                    + "inner join es.script as s "                                        
                    + "order by mes.id desc ";
            }else{
                sql = "from MaquinasExecutarScript mes "
                    + "inner join mes.maquina as m "
                    + "inner join mes.execucaoScript as es "
//                    + "inner join es.script as s"                    
                    + "where lower(m.nome) like lower('%" + obj.getMaquina().getHost() + "%') "
                    + "order by mes.id desc ";
            }

            org.hibernate.Query q = sessao.createQuery(sql);
            resultado = q.list();

            for (Object o : resultado) {
                MaquinasExecutarScript s = ((MaquinasExecutarScript) ((Object[]) o)[0]);
                lista.add(s);
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            sessao.close();
        }

        return lista;
    }
//
//    /**
//     *
//     * @param sala
//     * @return Usuario
//     */
    public MaquinasExecutarScript consultar(MaquinasExecutarScript obj) {
        List resultado = null;
        MaquinasExecutarScript objLocal = new MaquinasExecutarScript();
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            //  System.out.println("id:" + sala.getId());
            org.hibernate.Query q = sessao.createQuery("from MaquinasExecutarScript m inner join m.execucaoScript where m.id = " + obj.getId());
            resultado = q.list();

            objLocal = ((MaquinasExecutarScript) ((Object[]) resultado.get(0))[0]);

        } catch (HibernateException he) {
            System.err.println("Erro em consultar  \n" + he);
        } finally {
            sessao.close();
        }
        return objLocal;
    }
}

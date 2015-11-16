/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import modelo.Inventario;
import modelo.Tarefa;

/**
 *
 * @author eduar_000
 */
public class Tarefas {

    public static void armazenaInventario(Tarefa tarefa) throws IOException {

        for (byte[] bFile : tarefa.getListaArquivos()) {
//            byte[] bFile = pacote.getListaArquivos();

            String nomeDoArquivo = "C:\\QIT\\QIT-Servidor\\inventarios\\inventario" + Util.getCurrentTimestampCMD() + ".xml";
            FileOutputStream fos = new FileOutputStream(nomeDoArquivo);
            fos.write(bFile);
            fos.close();
            System.out.println("Arquivo do invenrtário armazenado");

            XStream x = new XStream();
            Inventario inventario = null;
            File file = new File(nomeDoArquivo);
            inventario = (Inventario) x.fromXML(file);
            ControleInventario ci = new ControleInventario();
            ci.gravarInventario(inventario);
            System.out.println("Inventario gravado no banco de dados");
        }

    }
}

package p2proyecto_pamelaramirez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Archivos {
    private File archivoUsuarios = null;
    private File archivoBitacora = null;
    private ArrayList<String> bitacora = new ArrayList();
    private ArrayList<Usuario> usuarios = new ArrayList();
    
    public Archivos(String pathU, String pathB) {
        archivoUsuarios = new File(pathU);
        archivoBitacora = new File(pathB);
    }

    public File getArchivoUsuarios() {
        return archivoUsuarios;
    }

    public void setArchivoUsuarios(File archivoUsuarios) {
        this.archivoUsuarios = archivoUsuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<String> getBitacora() {
        return bitacora;
    }

    public void setBitacora(ArrayList<String> bitacora) {
        this.bitacora = bitacora;
    }
    
    public void escribirArchivoUsuarios() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivoUsuarios, true);
            bw = new BufferedWriter(fw);
            for (Usuario usuario : usuarios) {
                bw.write(usuario.getNombreUsuario() + "|");
                bw.write(usuario.getPass());
                bw.newLine();
            }
            bw.flush();
        }
        catch (Exception e) {
            
        }
        bw.close();
        fw.close();
    }
    
    public void escribirArchivoBitacora() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivoBitacora, true);
            bw = new BufferedWriter(fw);
            for (String sesion : bitacora) {
                bw.write(sesion);
                bw.newLine();
            }
            bw.flush();
        }
        catch (Exception e) {
            
        }
        bw.close();
        fw.close();
    }
   
    // Actualizar ArrayList
    public void cargarArchivoUsuarios(){
        Scanner sc = null;
        usuarios = new ArrayList();
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        if (archivoUsuarios.exists()) {
            try {
                sc = new Scanner(archivoUsuarios);
                sc.useDelimiter("|");
                while (sc.hasNextLine()) {
                    usuarios.add(new Usuario(sc.next(), sc.next()));
                    sc.nextLine();
                }
            } catch (Exception e) {
                
            }
            sc.close();
        }
    }
}

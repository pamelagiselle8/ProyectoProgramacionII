
package p2proyecto_pamelaramirez;

import java.io.*;
import java.util.*;

public class Archivos {
    private ArrayList <Local> locales = new ArrayList();
    private File registroLocales = null;
    private ArrayList <Cliente> clientes = new ArrayList();
    private File registroClientes = null;
    private ArrayList <Usuario> usuarios = new ArrayList();
    private File registroUsuarios = null;

    public Archivos(String pathLocales, String pathUsuarios) {
        registroLocales = new File(pathLocales);
        registroUsuarios = new File(pathUsuarios);
    }
    
    public Archivos(String pathClientes) {
        registroClientes = new File(pathClientes);
    }
    
    // Metodos de administracion
    
    public boolean validarID(String id) {
        boolean valido = true;
        for (Cliente cliente : clientes) {
            if (cliente.getId().equalsIgnoreCase(id)) {
                valido = false;
            }
        }
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equalsIgnoreCase(id)) {
                valido = false;
            }
        }
        return valido;
    }
    
    // Archivo locales

    public ArrayList<Local> getLocales() {
        return locales;
    }

    public void setLocales(ArrayList<Local> locales) {
        this.locales = locales;
    }

    public File getRegistroLocales() {
        return registroLocales;
    }

    public void setRegistroLocales(File registroLocales) {
        this.registroLocales = registroLocales;
    }
    
    public void cargarLocales() {
        try {            
            locales = new ArrayList();
            Local local;
            if (registroLocales.exists()) {
                FileInputStream entrada = new FileInputStream(registroLocales);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((local = (Local)objeto.readObject()) != null) {
                        locales.add(local);
                    }
                }
                catch (EOFException e) {
                    
                }
                objeto.close();
                entrada.close();
            }            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void guardarLocales() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(registroLocales);
            bw = new ObjectOutputStream(fw);
            for (Local local : locales) {
                bw.writeObject(local);
            }
            bw.flush();
        }
        catch (Exception ex) {
            
        }
        finally {
            try {
                bw.close();
                fw.close();
            }
            catch (Exception ex) {
                
            }
        }
    }
    
    // Archivo clientes

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public File getRegistroClientes() {
        return registroClientes;
    }

    public void setRegistroClientes(File registroClientes) {
        this.registroClientes = registroClientes;
    }
    
    public void cargarClientes() {
        try {            
            clientes = new ArrayList();
            Cliente cliente;
            if (registroClientes.exists()) {
                FileInputStream entrada = new FileInputStream(registroClientes);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((cliente = (Cliente) objeto.readObject()) != null) {
                        clientes.add(cliente);
                    }
                } catch (EOFException e) {
                    
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void guardarClientes() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(registroClientes);
            bw = new ObjectOutputStream(fw);
            for (Cliente cliente : clientes) {
                bw.writeObject(cliente);
            }
            bw.flush();
        }
        catch (Exception ex) {
            
        }
        finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                
            }
        }
    }
    
    // Archivo usuarios

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getRegistroUsuarios() {
        return registroUsuarios;
    }

    public void setRegistroUsuarios(File registroUsuarios) {
        this.registroUsuarios = registroUsuarios;
    }
    
    public void cargarUsuarios() {
        try {            
            usuarios = new ArrayList();
            Usuario usuario;
            if (registroUsuarios.exists()) {
                FileInputStream entrada = new FileInputStream(registroUsuarios);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((usuario = (Usuario)objeto.readObject()) != null) {
                        usuarios.add(usuario);
                    }
                }
                catch (EOFException e) {
                    
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void guardarUsuarios() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(registroUsuarios);
            bw = new ObjectOutputStream(fw);
            for (Usuario usuario : usuarios) {
                bw.writeObject(usuario);
            }
            bw.flush();
        }
        catch (Exception ex) {
            
        }
        finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                
            }
        }
    }
}

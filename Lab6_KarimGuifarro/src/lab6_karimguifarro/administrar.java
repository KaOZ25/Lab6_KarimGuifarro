/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_karimguifarro;

import java.io.*;
import java.util.*;

public class administrar {

    private ArrayList<Cliente> cliente = new ArrayList();
    private File arch = null;

    public administrar(String path) {
        arch = new File(path);
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }

    @Override
    public String toString() {
        return "administrar{" + "cliente=" + cliente + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arch, false);
            bw = new BufferedWriter(fw);
            for (Cliente t : cliente) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getTrabajo() + ";");
                bw.write(t.getPuesto() + ";");
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContraseña() + ";");
                bw.write(t.getDinero() + ";");
                bw.write(t.getVIN() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        cliente = new ArrayList();
        if (arch.exists()) {
            try {
                sc = new Scanner(arch);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    cliente.add(new Cliente(sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}

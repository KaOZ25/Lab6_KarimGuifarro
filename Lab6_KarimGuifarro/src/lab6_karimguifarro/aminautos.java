/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_karimguifarro;

import java.io.*;
import java.util.*;
public class aminautos {
     private ArrayList<Autos> auto = new ArrayList();
    private File arch = null;

    public aminautos(String path) {
        arch= new File(path);
    }

    public ArrayList<Autos> getAuto() {
        return auto;
    }

    public void setAuto(ArrayList<Autos> auto) {
        this.auto = auto;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arch, false);
            bw = new BufferedWriter(fw);
            for (Autos t : auto) {
                bw.write(t.getVIN() + ";");
                bw.write(t.getModelo() + ";");
                bw.write(t.getCarroceria() + ";");
                bw.write(t.getColor() + ";");
                bw.write(t.getCant_pasajeros() + ";");
                bw.write(t.getCapacidad_maletero() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(t.getPotencia() + ";"); 
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
     public void cargarArchivo() {
        Scanner sc = null;
        auto = new ArrayList();
        if (arch.exists()) {
            try {
                sc = new Scanner(arch);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    auto.add(new Autos(sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.nextInt(),
                            sc.nextInt(),
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

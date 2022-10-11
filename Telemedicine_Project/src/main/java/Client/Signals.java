/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import java.io.*;

/**
 *
 * @author andre
 */
public class Signals {
    Float[] eeg;
    Float[] lux;

    public Signals(Float[] eeg, Float[] lux) {
        this.eeg = eeg;
        this.lux = lux;
    }

    public void readSignal() throws FileNotFoundException, IOException{
        File archivo = new File("C:\\Users\\andre\\OneDrive\\Documentos\\5S1\\Telemedicina\\OpenSignals\\1_1.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        System.out.print(linea);
    }
}

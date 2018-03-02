/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcipher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Vidarshana Mendis
 */
public class Filewriter {
    public void fileWriter(String entext) throws FileNotFoundException, UnsupportedEncodingException {
        
        PrintWriter writer = new PrintWriter("../newtxtfile.txt", "UTF-8");
        System.out.println("wrote.............");
        writer.println(entext);
        //writer.println("The second line");
        writer.close();
        
//        try {
//          
//            File newTextFile = new File("C:/CS project/PC/encripted1.txt");
//
//            FileWriter fw = new FileWriter(newTextFile);
//            fw.write(entext);
//            System.out.println("wrote");
//            fw.close();
//
//        } catch (IOException iox) {
//            //do stuff with exception
//            //iox.printStackTrace();
//
//        }
    
    
}
}

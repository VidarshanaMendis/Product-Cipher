/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcipher;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Vidarshana Mendis
 */
public class Encrypt {
     String encripttxt;
     int shiftlength =2;
    
    char[] substring = new char[4];
    
    public String getPurmutation(String text){
        int key[] = {3, 2, 1, 4};

        int txtlength = text.length();
        for (int i = 0; i < txtlength; i++) {
            char x = text.charAt(i);
            
            if(!((i+1)%4==0)){
                int k=key[i%4];
                substring[k] = x;
            }
            int k=key[i%4];
            substring[k] = x;
            String testString = Arrays.toString(substring);
        }
        return null;
    }
    
    public String getEncriptedTxt(String plaintext){
        encripttxt="";
        int newascii;
        int txtlength = plaintext.length();
        for(int i=0; i<txtlength;i++){
            char x =plaintext.charAt(i);
            int asciival =(int)x;
            

            if (asciival + shiftlength < 127) {
                newascii = asciival + shiftlength;
                String newchar = Character.toString((char) newascii);
                encripttxt = encripttxt + newchar;
            } else {
                newascii = asciival + shiftlength - 127+32;
                String newchar = Character.toString((char) newascii);
                encripttxt = encripttxt + newchar;
            }
            
        }
        return encripttxt ;
    }
    
}

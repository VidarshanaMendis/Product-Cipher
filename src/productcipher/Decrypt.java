/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcipher;

/**
 *
 * @author Vidarshana Mendis
 */
public class Decrypt {
    
    String decripttxt;
    int shiftlength = 2;

    public String getDecryptedTxt(String decrypedtxt) {
        decripttxt = "";
        int newascii;
        int txtlength = decrypedtxt.length();
        for (int i = 0; i < txtlength; i++) {
            char x = decrypedtxt.charAt(i);
            int asciival = (int) x;

            if (asciival > 33 + shiftlength) {
                newascii = asciival - shiftlength;
                String newchar = Character.toString((char) newascii);
                decripttxt = decripttxt + newchar;

            } else {
                newascii = asciival - shiftlength + 127 - 32;
                String newchar = Character.toString((char) newascii);
                decripttxt = decripttxt + newchar;
                //System.out.println(newascii);
            }
        }
        return decripttxt;
    }
}

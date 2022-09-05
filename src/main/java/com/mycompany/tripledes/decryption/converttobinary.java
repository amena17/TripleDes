/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.decryption;

/**
 *
 * @author Mints Belete
 */
public class converttobinary {
    String tobinary(String  keyorptxt)
          {
        String keyorptxtt="";
        for(int i=0;i<keyorptxt.length();i++)
              {
             keyorptxtt+=0+Integer.toBinaryString(keyorptxt.charAt(i));
              }
        return keyorptxtt;
          }
    
}

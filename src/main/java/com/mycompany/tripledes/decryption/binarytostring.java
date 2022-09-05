/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.decryption;

/**
 *
 * @author Mintz Belete
 */
public class binarytostring {
    String binarytostr(String  cipher)
                             {
                    String s=cipher;
                    String plaintxt = "";   
char nextChar;

               for(int i = 0;i<=s.length()-8;i+=8)
                   {
       nextChar = (char)Integer.parseInt(s.substring(i, i+8), 2);
       plaintxt+= nextChar;
                    }
  
                             return plaintxt;
                    } 
    
}

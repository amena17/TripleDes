/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

/**
 *
 * @author Mints Belete
 */
public class cipherprinter {
    cipherprinter(String  finalcipher[][],int blocklength)
                               {
                                   String message="";
                                   System.out.println(":::::::::::::THIS IS THE FINAL CIPHER:::::::::::::");
                                   System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
                                   for(int i=0;i<blocklength;i++)
                                   {
                                   System.out.print("LINE : "+(i+1)+" ");

                                        System.out.println(finalcipher[i][0]);
                                        binarytostring xx=new binarytostring();
                                        message+=xx.binarytostr(finalcipher[i][0]);

                                    }
                               }
    
}

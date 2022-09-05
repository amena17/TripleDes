/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.decryption;

/**
 *
 * @author Mints Belete
 */
public class xorleftright {
    String  xorleftrigh(String left,String right)
                                   {
                        String xored="";
                                    for(int i=0;i<32;i++)
                                         {
                                     if(left.charAt(i)==right.charAt(i))
                                        {
                                     xored+='0';
                                        }
                                     else
                                          {
                                       xored+='1';
                                           }
                                      }
                                     return xored;
                                   }
    
}

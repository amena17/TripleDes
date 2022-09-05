/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

/**
 *
 * @author Mints Belete
 */
public class xorplaintxtkey {
    String  xorplainkey(String plain,String key)
                                   {
                        String []xored={""};
                                    for(int i=0;i<48;i++)
                                         {
                                     if(plain.charAt(i)==key.charAt(i))
                                        {
                                     xored[0]+='0';
                                        }
                                     else
                                          {
                                       xored[0]+='1';
                                           }
                                      }



                                return xored[0];
                                   }
    
}

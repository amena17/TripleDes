/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

/**
 *
 * @author Mints Belete
 */
public class lengthfixer {
    String lengthfix(String results1)
                            {
                                if(results1.length()<4)
                          { int i=0;
                             int len=results1.length();
                                 int add=4-len;
                                      while(i<add)
                                      {
                                        String temp=results1;
                                        results1="";
                                      results1='0'+temp;
                                      i++;
                                      }
                          }
                         return  results1;

                             }
    
}

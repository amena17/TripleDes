/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

/**
 *
 * @author Mints Belete
 */
public class keyleftshift {
    String keyleftshift(String ignoredkey,int round)
                      {
                        int schedule;
                   	String  rotated="";

                         if(round==1 || round==9 || round==2 || round==16)
                               schedule=1;
                         else
                               schedule=2;
		                  for(int i=schedule;i<28;i++)
                                    {
                             rotated+=ignoredkey.charAt(i);
                                     }
                                 for(int j=0;j<schedule;j++)
                                      {
                                 rotated+=ignoredkey.charAt(j);
                                       }

                         return rotated;
                         }
    
}

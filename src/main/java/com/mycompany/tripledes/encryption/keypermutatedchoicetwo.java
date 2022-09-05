/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

/**
 *
 * @author Mints Belete
 */
public class keypermutatedchoicetwo {
    int []permutedchoicetwo=

               {14,17,11,24,1,5,3,28,
                15,6,21,10,23,19,12,4,
                26,8,16,7,27,20,13,2,
                41,52,31,37,47,55,30,40,
                51,45,33,48,44,49,39,56,
                34,53,46,42,50,36,29,32};

         String  permutedchoicetwo(String dividedkey)
                      {
                          String  permuted="";
                           for(int i=0;i<48;i++)
                              {

                          permuted+=dividedkey.charAt(permutedchoicetwo[i]-1);
                             }
                   return permuted;
                     }
    
}

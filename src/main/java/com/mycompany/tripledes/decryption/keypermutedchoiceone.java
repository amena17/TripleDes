/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.decryption;

/**
 *
 * @author Mints Belete
 */
public class keypermutedchoiceone {
    int []permutedchoiceone=
                     {57,49,41,33,25,17,9,
                      1,58,50,42,34,26,18,
                      10,2,59,51,43,35,27,
                      19,11,3,60,52,44,36,
                      63,55,47,39,31,23,15,
                      7,62,54,46,38,30,22,
                      14,6,61,53,45,37,29,
                      21,13,5,28,20,12,4
                     };
         String  permutedchoiceone(String key)
                     {
                          String  permuted="";
                           for(int i=0;i<56;i++)
                              {

                          permuted+=key.charAt(permutedchoiceone[i]-1);


                               }

                    return permuted;
                     }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.decryption;

/**
 *
 * @author Mints Belete
 */
public class r32permitation {
    int []permutationfunction=

                 {16,7,20,21,29,12,28,17,
                  1,15,23,26,5,18,31,10,
                 2,8,24,14,32,27,3,9,
                 19,13,30,6,22,11,4,25

               };
                String  permutation32(String dividedkey)
                     {
                          String  permuted="";
                           for(int i=0;i<32;i++)
                              {
 permuted+=dividedkey.charAt(permutationfunction[i]-1);
                             }
                   return permuted;
                     }
    
}

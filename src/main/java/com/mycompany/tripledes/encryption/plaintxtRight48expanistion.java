/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

/**
 *
 * @author Mints Belete
 */
public class plaintxtRight48expanistion {
    int []expanitionto48=

                   {32 ,1 ,2 ,3 ,4,5,
                   4 ,5 ,6 ,7 ,8 ,9 ,
                   8,9,10,11,12,13  ,
                   12,13,14,15,16,17,
                   16,17,18,19,20,21,
                   20,21,22,23,24,25,
                   24,25,26,27,28,29,
                   28,29,30,31,32,1};




         String  expanistionpermutation(String dividedkey)
                     {
                          String  permuted="";
                           for(int i=0;i<48;i++)
                              {

                          permuted+=dividedkey.charAt(expanitionto48[i]-1);
                             }
                   return permuted;
                     }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

/**
 *
 * @author Mints Belete
 */
public class key28division {
    String [][]keydvistion(String afterpc1)
                         {
                  String [][]dividedkey={{""},{""}};
                             for(int i=0;i<28;i++)
                             {
                           dividedkey[0][0]+=afterpc1.charAt(i);
                             }
                             for(int j=28;j<56;j++)
                             {
                           dividedkey[1][0]+=afterpc1.charAt(j);
                             }
                      return  dividedkey;
                          }
    
}

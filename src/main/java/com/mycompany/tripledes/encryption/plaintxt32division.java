/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

/**
 *
 * @author Mints Belete
 */
public class plaintxt32division {
    String [][]plain32divistion(String plaintxt)
                         {
                  String [][]dividedplainnn={{""},{""}};
                             for(int i=0;i<32;i++)
                             {
                           dividedplainnn[0][0]+=plaintxt.charAt(i);
                             }
                             for(int j=32;j<64;j++)
                             {
                           dividedplainnn[1][0]+=plaintxt.charAt(j);
                             }
                      return  dividedplainnn;
                          }
    
}

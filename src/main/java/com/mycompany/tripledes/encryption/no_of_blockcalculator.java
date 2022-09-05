/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

/**
 *
 * @author Mints Belete
 */
public class no_of_blockcalculator {
    
    int  blockedmessage;
                        String [][]no_ofblockcalculator(String  message)
                               {
                                   String  message2[]={""};
                                   message2[0]+=message;
                                   int lenn=message2[0].length();
                                   
                                   //fix the length of the message:
                                   if(lenn<64)
                                       {
                                          while(lenn<64)
                                             {

                                             message2[0]+='0';
                                             lenn++;

                                              }

                                       }

                                  //calculatethe remainder of 64
                                  int  messageremainder;
                                          messageremainder=(message2[0].length())%64;
                                          
                                      //concatnating  some value to make the the message full 64bit
                                    if(messageremainder!=0 )
                                          {
                                              while(messageremainder<64)
                                                   {
                                                   message2[0]+=0;
                                                   messageremainder++;
                                                   }
                                          }
                                    //calculating the message blocks
                                    blockedmessage=(message2[0].length())/64;
                                    
                                      int index;
                                          index=0;
                                 String [][]block=new String [blockedmessage][1];
                                 //RESTARTING INTO NULL
                                              for(int h=0;h<blockedmessage;h++)
                                                  {
                                                  block[h][0]="";
                                                  }

                                    //FILL THE BLOCK MATRIX WITH THE BINARY MESSAGE
                                         for(int j=0;j<blockedmessage;j++)
                                             {
                                             for(int k=0;k<64;k++)
                                                {
                                                block[j][0]+=message2[0].charAt(index);
                                                 index++;
                                                }

                                            }
                                 return block;
                                }
    
}

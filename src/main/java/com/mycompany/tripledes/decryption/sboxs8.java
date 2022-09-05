/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.decryption;

/**
 *
 * @author Mints Belete
 */
public class sboxs8 {
    String sboxs(String x)
            {
                      String r1,r2,r3,r4,r5,r6,r7,r8;
                      int r11,r22,r33,r44,r55,r66,r77,r88;
                      int c11,c22,c33,c44,c55,c66,c77,c88;
                      r1=""; r2=""; r3="";  r4=""; r5=""; r6=""; r7=""; r8="";
                          //ROWS OF THE SBOXES
                      r1+=x.charAt(0)+""+x.charAt(5);
                              r4+=x.charAt(18)+""+x.charAt(23); r7+=x.charAt(36)+""+x.charAt(41);
                      r2+=x.charAt(6)+""+x.charAt(11);  r5+=x.charAt(24)+""+x.charAt(29); r8+=x.charAt(42)+""+x.charAt(47);
                      r3+=x.charAt(12)+""+x.charAt(17);  r6+=x.charAt(30)+""+x.charAt(35);
                      String c1,c2,c3,c4,c5,c6,c7,c8;
                      c1=""; c2=""; c3="";  c4=""; c5=""; c6=""; c7=""; c8="";
                        //  COLUMNS OF THE S - BOXES
                        c1=x.substring(1,5); c4=x.substring(19,23);  c7=x.substring(37,41);
                        c2=x.substring(7,11); c5=x.substring(25,29);  c8=x.substring(43,47);
                        c3=x.substring(13,17); c6=x.substring(31,35);

                      //CONVERTING ROWS INTO INTEGERS
                      r11=Integer.parseInt(r1,2); r44=Integer.parseInt(r4,2);  r77=Integer.parseInt(r7,2);
                      r22=Integer.parseInt(r2,2); r55=Integer.parseInt(r5,2);  r88=Integer.parseInt(r8,2);
                      r33=Integer.parseInt(r3,2); r66=Integer.parseInt(r6,2);
                      //CONVERTING COLUMN INTO INTEGERS
                      c11=Integer.parseInt(c1,2); c44=Integer.parseInt(c4,2);  c77=Integer.parseInt(c7,2);
                      c22=Integer.parseInt(c2,2); c55=Integer.parseInt(c5,2);  c88=Integer.parseInt(c8,2);
                      c33=Integer.parseInt(c3,2); c66=Integer.parseInt(c6,2);


  int [][] sbox1=
                 {
                   {14,4,13,1,2,15,11,8,3,10,6,12,5,9,0,7},
                   {0,15,7,4,14,2,13,1,10,6,12,11,9,5,3,8},
                   {4,1,14,8,13,6,2,11,15,12,9,7,3,10,5,0},
                   {15,12,8,2,4,9,1,7,5,11,3,14,10,0,6,13}


                  };
   int [][] sbox2=
                  {
                   {15,1,8,14,6,11,3,4,9,7,2,13,12,0,5,10},
                   {3,13,4,7,15,2,8,14,12,0,1,10,6,9,11,5},
                   {0,14,7,11,10,4,13,1,5,8,12,6,9,3,2,15},
                   {13,8,10,1,3,15,4,2,11,6,7,12,0,5,14,9}

                   };
   int [][] sbox3=
                  {
                   {10,0,9,14,6,3,15,5,1,13,12,7,11,4,2,8},
                   {13,7,0,9,3,4,6,10,2,8,5,14,12,11,15,1},
                   {13,6,4,9,8,15,3,0,11,1,2,12,5,10,14,7},
                   {1,10,13,0,6,9,8,7,4,15,14,3,11,5,2,12}

                   };
   int [][] sbox4=
                  {
                   {7,13,14,3,0,6,9,10,1,2,8,5,11,12,4,15},
                   {13,8,11,5,6,15,0,3,4,7,2,12,1,10,14,9},
                   {10,0,9,0,12,11,7,15,15,1,5,14,5,2,8,4},
                   {3,15,0,6,10,1,13,8,9,4,5,11,12,7,2,14}

                   };
   int [][] sbox5=
                  {
                   {2,12,4,1,7,10,11,6,8,5,3,15,13,0,14,9},
                   {14,11,2,12,4,7,13,1,5,0,15,10,3,9,8,6},
                   {4,2,1,11,10,13,7,8,15,9,12,5,6,3,0,14},
                   {11,8,12,7,1,14,2,13,6,15,0,9,10,4,5,3}

                   };
   int [][] sbox6=
                  {
                   {12,1,10,15,9,2,6,8,0,13,3,4,14,7,5,11},
                   {10,15,4,3,2,7,12,9,5,6,1,13,14,0,11,3,8},
                   {9,14,15,5,2,8,12,3,7,0,4,10,1,13,11,6},
                   {4,3,2,12,9,5,15,10,11,14,1,7,6,0,8,13}

                   };
   int [][] sbox7=
                  {
                   {4,11,2,14,15,0,8,13,3,12,9,7,5,10,6,1},
                   {13,0,11,7,4,9,1,10,14,3,5,12,2,15,8,6},
                   {1,4,11,13,12,3,7,14,10,15,6,8,0,5,9,2},
                   {6,11,13,8,1,4,10,7,9,5,0,15,14,2,3,12}

                   };
   int [][] sbox8=
                  {
                   {13,2,8,4,6,15,11,1,10,9,3,14,5,0,12,7},
                   {1,15,13,8,10,3,7,4,12,5,6,11,0,14,9,2},
                   {7,11,4,1,9,12,14,2,0,6,10,13,15,3,5,8},
                   {2,1,14,7,4,10,8,13,15,12,9,0,3,5,6,11}

                   };
   //TAKING THE OUTPUT  FORM ALL  S BOXES:
                      String results1,results2,results3,results4,results5,results6,result7,result8;
                      //CONVERTING THE OUTPUT TO STRINGBINARY AND SAVETHEM:
                      results1=Integer.toBinaryString(sbox1[r11][c11]);
                      lengthfixer  xx=new lengthfixer();
                      results1=xx.lengthfix(results1);
                      System.out.println("results1======="+results1);
                      results2=Integer.toBinaryString(sbox2[r22][c22]);
                      results2=xx.lengthfix(results2);
                      System.out.println("results2======="+results2);
                      results3=Integer.toBinaryString(sbox3[r33][c33]);
                      results3=xx.lengthfix(results3);
                      System.out.println("results3======="+results3);
                      results4=Integer.toBinaryString(sbox4[r44][c44]);
                      results4=xx.lengthfix(results4);
                      System.out.println("results4======="+results4);
                      results5=Integer.toBinaryString(sbox5[r55][c55]);
                      results5=xx.lengthfix(results5);
                      System.out.println("results5======="+results5);
                      results6=Integer.toBinaryString(sbox6[r66][c66]);
                      results6=xx.lengthfix(results6);
                      System.out.println("results6======="+results6);
                      result7=Integer.toBinaryString(sbox7[r77][c77]);
                      result7=xx.lengthfix(result7);
                      System.out.println("results7======="+result7);
                      result8=Integer.toBinaryString(sbox8[r88][c88]);
                      result8=xx.lengthfix(result8);
                      System.out.println("results8======="+result8);
                         String  finalsbox=results1+results2+results3+results4+results5+results6+result7+result8;
                System.out.println("LENGTH OF SBOX RESULT="+finalsbox.length());
                System.out.println("RESULT OF 8SBOX="+finalsbox);
                         return   finalsbox;
  }
    
}

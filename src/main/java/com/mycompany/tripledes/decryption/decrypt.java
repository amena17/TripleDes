/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tripledes.decryption;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mints Belete
 */
public class decrypt extends javax.swing.JFrame {
    
   
    /**
     * Creates new form decrypt
     */
    public decrypt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    public class roundkeygeneration
        {
            String permutedkey[]=new String[16];
            void keys(int mode)
            {
 
                String  key;
               
                if(mode==1)
                {
                    key=key1.getText();
                }
                else if(mode==2)
                {
                    key=key2.getText();
                }
                else if(mode==3)
                {
                    key=key3.getText();
                }
                else
                {
                    key=key1.getText();
                }

                converttobinary tobin=new converttobinary();

                String convertedkey=tobin.tobinary(key);

                String keyafterpc1="";

           //divide the key into 28 28
                keypermutedchoiceone  permutone=new keypermutedchoiceone();
                keyafterpc1+=permutone.permutedchoiceone(convertedkey);

                key28division  divide=new key28division();
                String [][]dividedkey=new String[2][1];
                dividedkey=divide.keydvistion(keyafterpc1);


           //left shift by 1 the keyafterignor
                keyleftshift   shift=new keyleftshift();


                  //STRING TO SAVE THE SHIFTED 56 BIT KEY
                String  []shiftedkey=new String [16];
               // THIS ARE THE SHIFTED KEYS:

                for(int round=1;round<=16;round++)
                {
                    dividedkey[0][0]=shift.keyleftshift(dividedkey[0][0],round);
                    dividedkey[1][0]=shift.keyleftshift(dividedkey[1][0],round);

                    //CONCATNATE THE ROUND KEYS
                    shiftedkey[round-1]=dividedkey[0][0]+dividedkey[1][0];
                }

                       //SEND THE ROUND KEY TO PERMUTATION CHOICE TWO
                keypermutatedchoicetwo  pc2=new keypermutatedchoicetwo();
                    //SAVE THE PERMUTEDTWO IN NEW STRING


                for(int l=0;l<16;l++)
                {
                      //SEND THE SHIFTED KEY'S TO GENERATE THE ROUND KEY
                    permutedkey[l]=pc2.permutedchoicetwo(shiftedkey[l]);


                }
            }
        }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        finall_cipher = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        key1 = new javax.swing.JTextField();
        key2 = new javax.swing.JTextField();
        key3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        decrypt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        final_msg = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        accept = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        hashedd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        finall_cipher.setColumns(20);
        finall_cipher.setRows(5);
        jScrollPane1.setViewportView(finall_cipher);

        jLabel1.setText("Cipher Text");

        jLabel2.setText("Key 1");

        jLabel3.setText("Key 2");

        jLabel4.setText("Key 3");

        decrypt.setText("Decrypt");
        decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptActionPerformed(evt);
            }
        });

        final_msg.setColumns(20);
        final_msg.setRows(5);
        jScrollPane2.setViewportView(final_msg);

        jLabel5.setText("Final Message");

        accept.setText("Accept");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        jButton2.setText("SOURCE AUTHENTICATION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Hashed");

        clear.setForeground(java.awt.Color.red);
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setText("         Decryption");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hashedd, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clear))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clear)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hashedd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(key1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(key2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(key3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(decrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    public class decryptt 
    {
        
        decryptt(String cipherencfromenc)
        {

            String  message;
      
            message=cipherencfromenc;
      
     // converttobinary tobin=new converttobinary();
            String convertedmessage=message;//tobin.tobinary(message);
          

      // CALLING THE BLOCK CREATER CLASS
            no_of_blockcalculator  noblock=new no_of_blockcalculator();
            String [][]allblock=noblock.no_ofblockcalculator(convertedmessage);
                       
            int blocklength=noblock.blockedmessage;

            int indexx=0;//block accessing variable:
            String ciphertext="";//holde only one cipher block
            String cipherblock[][]=new String[blocklength][1];
              //INTIALIZE CIPHER TO NULL
            for(int h=0;h<blocklength;h++)
            {
                cipherblock[h][0]="";
            }
                        
                  //KEY GENERATION
            roundkeygeneration keygen=new roundkeygeneration();
            int mode=1;
            keygen.keys(mode);
                  
            for(int blk=0;blk<blocklength;blk++)
            {
                int reverse=15;
                ciphertext="";
                plaintxtintialpermutation  inperm=new plaintxtintialpermutation();
                plaintxt32division  divide=new plaintxt32division();
                


                String afterintial=inperm.intialpermutation(allblock[blk][0]);

   //PROCESSING PLAIN TEXT:
                String [][]dividedplain=new String[2][1];
                dividedplain=divide.plain32divistion(afterintial);
            

                for(int enc=0;enc<16;enc++)
                {
            

                //SEND  RIGHT R TO PERMUTATION EXPANISTION
                    String []tempright=new String[1];
                    tempright[0]=dividedplain[1][0];
                    String []templeft=new String[1];
                    templeft[0]=dividedplain[0][0];
                    plaintxtRight48expanistion expand=new plaintxtRight48expanistion();
                    String []expandedRight=new  String[1];
                    expandedRight[0]=expand.expanistionpermutation(dividedplain[1][0]);
                  

                    xorplaintxtkey  xor=new xorplaintxtkey();
                       //keypermutatedchoicetwo  pc2=new keypermutatedchoicetwo();


                    String  xoredplainn[]=new String[1];
                    xoredplainn[0]=xor.xorplainkey(expandedRight[0],keygen.permutedkey[reverse]);
                   
                    sboxs8 sboxs=new sboxs8();
                          //SENDING TO 8 SBOXES:
                    String []sboxresult=new String[1];
                    sboxresult[0]=sboxs.sboxs(xoredplainn[0]);
                                     ////////////////////

                          //CODE FOR SUBSTITUTION BOX LEFT HERE

                    r32permitation permutationP=new  r32permitation();
                           //SEND TO  PERMUTATION 32
                    String  []permutation32=new String[1];
                    permutation32[0]="";
                    permutation32[0]+=permutationP.permutation32(sboxresult[0]);
                  
                    xorleftright  xorr=new xorleftright();
                       //XOR LEFT AND PASSED RIGHT THROUGH FUNCTION:
                  
                    String tempFunction[]=new String[1];
                    tempFunction[0]=xorr.xorleftrigh(dividedplain[0][0],permutation32[0]);
                  
                    dividedplain[0][0]=tempright[0];
                    dividedplain[1][0]=tempFunction[0];
                  
                        ///THIS IS THE ERROR IF ANY IS THERE
                    if(reverse==0)
                    {
                        String  []lastroundoutput=new String[1];
                        lastroundoutput[0]="";
                        lastroundoutput[0]+=dividedplain[1][0]+dividedplain[0][0];

                        plaintxtintialpermutation  finalpermut= new plaintxtintialpermutation();
                        ciphertext+=finalpermut.finalpermutation(lastroundoutput[0]);
                        
                        break;    
                    }
                    reverse=reverse-1;
                }//for loop end
                cipherblock[indexx][0]+=ciphertext;
                indexx++;//the indexx that counts the block:
           }

            String  finalcipher=""; 
            for(int yy=0;yy<blocklength;yy++)
            {
               


                binarytostring xx=new binarytostring();
                finalcipher+=xx.binarytostr(cipherblock[yy][0]);
                
            }
               finalcipher=finalcipher.replaceAll("_"," ");
               finalcipher=finalcipher.replaceAll("\\^","\\.");

                final_msg.append(finalcipher);
                                        
                        
         }

              
    }
    
    
    
    
    
    
    public class encrypt
    {
        encrypt(String  cipherfromenc)
        {        
        
            String  message;
    
            message=cipherfromenc;
      
 //converttobinary tobin=new converttobinary();
           String convertedmessage=message;
           
      //ACCESING THE KEY GENERATING CLASS
      //System.out.println();
      //INTIAL  LEFT
      // CALLING THE BLOCK CREATER CLASS
            no_of_blockcalculator  noblock=new no_of_blockcalculator();             
            String [][]allblock=noblock.no_ofblockcalculator(convertedmessage);
                        //System.out.println("WORKING");
            int blocklength=noblock.blockedmessage;
               
            int indexx=0;//block accessing variable:
            String ciphertext="";//holde only one cipher block
            String cipherblock[][]=new String[blocklength][1];
              //INTIALIZE CIPHER TO NULL
            for(int h=0;h<blocklength;h++)
            {
                cipherblock[h][0]="";
            }
                        
                  //KEY GENERATION     
            roundkeygeneration keygen=new roundkeygeneration();
            int mode=2;
            keygen.keys(mode);
            for(int blk=0;blk<blocklength;blk++)
            {
                ciphertext="";  
                plaintxtintialpermutation  inperm=new plaintxtintialpermutation();
                plaintxt32division  divide=new plaintxt32division();
                     
                String afterintial=inperm.intialpermutation(allblock[blk][0]);

    
   //PROCESSING PLAIN TEXT:
                String [][]dividedplain=new String[2][1];
                dividedplain=divide.plain32divistion(afterintial);
            
                for(int enc=0;enc<16;enc++)
                    {
            
                      
                //SEND  RIGHT R TO PERMUTATION EXPANISTION
                        String []tempright=new String[1];
                        tempright[0]=dividedplain[1][0];
                        String []templeft=new String[1];
                        templeft[0]=dividedplain[0][0];
                        plaintxtRight48expanistion expand=new plaintxtRight48expanistion();
                        String []expandedRight=new  String[1];
                        expandedRight[0]=expand.expanistionpermutation(dividedplain[1][0]);
                  

                        xorplaintxtkey  xor=new xorplaintxtkey();
                       //keypermutatedchoicetwo  pc2=new keypermutatedchoicetwo();


                        String  xoredplainn[]=new String[1];
                        xoredplainn[0]=xor.xorplainkey(expandedRight[0],keygen.permutedkey[enc]);
                   
                        sboxs8 sboxs=new sboxs8();
                        //SENDING TO 8 SBOXES:
                        String []sboxresult=new String[1];
                        sboxresult[0]=sboxs.sboxs(xoredplainn[0]);
                                   ////////////////////

                        //CODE FOR SUBSTITUTION BOX LEFT HERE

                        r32permitation permutationP=new  r32permitation();
                           //SEND TO  PERMUTATION 32
                        String  []permutation32=new String[1];
                        permutation32[0]="";
                        permutation32[0]+=permutationP.permutation32(sboxresult[0]);
                   


                   
                        xorleftright  xorr=new xorleftright();
                       //XOR LEFT AND PASSED RIGHT THROUGH FUNCTION:
                  
                        String tempFunction[]=new String[1];
                        tempFunction[0]=xorr.xorleftrigh(dividedplain[0][0],permutation32[0]);
                 
                  
                        dividedplain[0][0]=tempright[0];
                        dividedplain[1][0]=tempFunction[0];
                  
                        ///THIS IS THE ERROR IF ANY IS THERE
                        if(enc==15)
                        {
                            String  []lastroundoutput=new String[1];
                            lastroundoutput[0]="";
                      
                            lastroundoutput[0]+=dividedplain[1][0]+dividedplain[0][0];
                            
                            plaintxtintialpermutation  finalpermut= new plaintxtintialpermutation();
                            ciphertext+=finalpermut.finalpermutation(lastroundoutput[0]);
                        
                        }
                    }//for loop end
                    cipherblock[indexx][0]+=ciphertext;
                    indexx++;//the indexx that counts the block:
           }
//////////////////////////////////////////////////////////////////////////////////////
            String cipherenc1="";  
            for(int yy=0;yy<blocklength;yy++)
            {

                binarytostring xx=new binarytostring();
                cipherenc1+=cipherblock[yy][0];


            }
            //CALLING THE DECRYPTION CLASS
            decryptt     decr=new decryptt(cipherenc1);
            cipherprinter  ciprinter=new cipherprinter(cipherblock,blocklength);
                   
        }
        
    }
    
    
    
    
    
    
    
    
    
    private void decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptActionPerformed
        // TODO add your handling code here:
         //DECRYPTION USING KEY 3 BEGINES HERE.
        String  message=finall_cipher.getText();
      
     // converttobinary tobin=new converttobinary();
        String convertedmessage=message;//tobin.tobinary(message);
          
      // CALLING THE BLOCK CREATER CLASS
        no_of_blockcalculator  noblock=new no_of_blockcalculator();

        String [][]allblock=noblock.no_ofblockcalculator(convertedmessage);
                       
        int blocklength=noblock.blockedmessage;
             
        int indexx=0;//block accessing variable:
        String ciphertext="";//holde only one cipher block
        String cipherblock[][]=new String[blocklength][1];
              //INTIALIZE CIPHER TO NULL
        for(int h=0;h<blocklength;h++)
        {
            cipherblock[h][0]="";
        }
                       
                  //KEY GENERATION
        roundkeygeneration keygen=new roundkeygeneration();
        int mode=3;
        keygen.keys(mode);
        for(int blk=0;blk<blocklength;blk++)
        {
            int reverse=15;
            ciphertext="";
            plaintxtintialpermutation  inperm=new plaintxtintialpermutation();
            plaintxt32division  divide=new plaintxt32division();
            
            String afterintial=inperm.intialpermutation(allblock[blk][0]);

       

    
   //PROCESSING PLAIN TEXT:
            String [][]dividedplain=new String[2][1];
            dividedplain=divide.plain32divistion(afterintial);
            
            for(int enc=0;enc<16;enc++)
            {
            

                //SEND  RIGHT R TO PERMUTATION EXPANISTION
                String []tempright=new String[1];
                tempright[0]=dividedplain[1][0];
                String []templeft=new String[1];
                templeft[0]=dividedplain[0][0];
                plaintxtRight48expanistion expand=new plaintxtRight48expanistion();
                String []expandedRight=new  String[1];
                expandedRight[0]=expand.expanistionpermutation(dividedplain[1][0]);
                  

                xorplaintxtkey  xor=new xorplaintxtkey();
                       //keypermutatedchoicetwo  pc2=new keypermutatedchoicetwo();


                String  xoredplainn[]=new String[1];
                xoredplainn[0]=xor.xorplainkey(expandedRight[0],keygen.permutedkey[reverse]);
                   
                sboxs8 sboxs=new sboxs8();
                          //SENDING TO 8 SBOXES:
                String []sboxresult=new String[1];
                sboxresult[0]=sboxs.sboxs(xoredplainn[0]);
                                     ////////////////////

                          //CODE FOR SUBSTITUTION BOX LEFT HERE

                r32permitation permutationP=new  r32permitation();
                           //SEND TO  PERMUTATION 32
                String  []permutation32=new String[1];
                permutation32[0]="";
                permutation32[0]+=permutationP.permutation32(sboxresult[0]);
                   


                         //CODE  FOR  PERMUTATION LEFT HERE
                                    //////////////////////

                 //SWAPING THE RIGHT AND LEFT


                xorleftright  xorr=new xorleftright();
                       //XOR LEFT AND PASSED RIGHT THROUGH FUNCTION:
                  
                String tempFunction[]=new String[1];
                tempFunction[0]=xorr.xorleftrigh(dividedplain[0][0],permutation32[0]);
                  
                dividedplain[0][0]=tempright[0];
                dividedplain[1][0]=tempFunction[0];
                  
                        ///THIS IS THE ERROR IF ANY IS THERE
                if(reverse==0)
                {
                    String  []lastroundoutput=new String[1];
                    lastroundoutput[0]="";
                      
                    lastroundoutput[0]+=dividedplain[1][0]+dividedplain[0][0];

                    plaintxtintialpermutation  finalpermut= new plaintxtintialpermutation();
                    ciphertext+=finalpermut.finalpermutation(lastroundoutput[0]);
                        
                    break;    
                }
                reverse=reverse-1;
            }//for loop end
            cipherblock[indexx][0]+=ciphertext;
            indexx++;//the indexx that counts the block:
        }

        String  finalcipher1=""; 
        for(int yy=0;yy<blocklength;yy++)
        {

            binarytostring xx=new binarytostring();
            finalcipher1+=cipherblock[yy][0];//xx.binarytostr(cipherblock[yy][0]);
        }
                                      
                        
        encrypt  xxcc=new  encrypt(finalcipher1);
        
    }//GEN-LAST:event_decryptActionPerformed

    String msg="";
    String  msg2="";
    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
        
        try
                         {
               int port=1234;
            ServerSocket sock=new ServerSocket(port);
            Socket soc=sock.accept();
            DataInputStream dis=new DataInputStream(soc.getInputStream());
            //JOptionPane.showMessageDialog(null, null, "connected", 100);
            System.out.print("connection established");
            msg +=dis.readLine();
            System.out.println("MESSAGE : "+msg);
            //////to  apart the hash and cipher
            
          
              int i=0;
             
            while(msg.charAt(i)!='*')
                    {
                     msg2+=msg.charAt(i);
                    i++;
                    }
              i=i+1;
              String hash="";
            while(i<(msg.length()))
                {
                 hash+=msg.charAt(i);
                 i++;
                }
            
             hashedd.setText(hash);
            finall_cipher.setText(msg2);
               soc.close();
               ////////////////////AUTHONTICATION CHECK
               
               
               ////////////////////////////////////////
               
            
                 }
        catch(IOException e)
                {
            System.out.println(e);
                }
    }//GEN-LAST:event_acceptActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try {
            String password =finall_cipher.getText();
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            
            byte byteData[] = md.digest();
            
            //convert the byte to hex format method 1
            StringBuffer sb = new StringBuffer();
            for (int j= 0; j< byteData.length; j++) {
                sb.append(Integer.toString((byteData[j] & 0xff) + 0x100, 16).substring(1));
            }
            
            System.out.println("Digest(in hex format):: " + sb.toString());
            
            //convert the byte to hex format method 2
            StringBuffer hexString = new StringBuffer();
            for (int j=0;j<byteData.length;j++) {
                String hex=Integer.toHexString(0xff & byteData[j]);
                if(hex.length()==1) hexString.append('0');
                hexString.append(hex);
            }
              String finalhash=hexString.toString();
            System.out.println("Digest(in hex format):: " + finalhash);
            if(finalhash.equalsIgnoreCase(hashedd.getText()))
            {
                hashedd.setText("AUTHENTICATION PASSED");
            }
            else
            {
               hashedd.setText("AUTHENTICATION FAILED");
            }
            
     
            
            // TODO add your handling code here:
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(decrypt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        hashedd.setText(null);
        key1.setText(null);
        key2.setText(null);
        key3.setText(null);
        finall_cipher.setText(null);
        final_msg.setText(null);
        
    }//GEN-LAST:event_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(decrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(decrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(decrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(decrypt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new decrypt().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JButton clear;
    private javax.swing.JButton decrypt;
    private javax.swing.JTextArea final_msg;
    private static javax.swing.JTextArea finall_cipher;
    private javax.swing.JTextField hashedd;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField key1;
    private javax.swing.JTextField key2;
    private javax.swing.JTextField key3;
    // End of variables declaration//GEN-END:variables
}

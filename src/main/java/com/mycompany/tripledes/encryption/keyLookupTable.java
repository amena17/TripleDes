/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tripledes.encryption;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Mints Belete
 */
public class keyLookupTable {
    
    ArrayList<String> keys = new ArrayList();
    Date date=new Date();
    static final DateFormat dateFormat = new SimpleDateFormat("dd MMM, yy @ HH:mm:ss"); 
    static final DateFormat dateFormat2 = new SimpleDateFormat("ddMMyyHHmmss"); 
    public keyLookupTable(){
     
      keys.add("81E08E84DAA56C54");
      keys.add("89F7311395CB40AA");
      keys.add("E23817951DC439C8");
      keys.add("8F751C3A246C192C");
      keys.add("95EF67F69BBBF645");
      keys.add("17A11C3F15D2179A");
      keys.add("9EE383B30B5C401C");
      keys.add("284A5A84E9BFE450");
      keys.add("90E806BEA98D35A8");
      keys.add("9EE9AB09D4B757D4");
      keys.add("55F484F2502C9329");
      keys.add("69A835BF6894E9DD");
      keys.add("2875A7A0FBDB71B2");
      keys.add("E1A5C80793C1CA74");
      keys.add("75A53A511B6983B1");
      keys.add("AAF21BA8C7B7995F");
    }
   public String keylookupTable1( int k){      
      return keys.get(k);
  }
   
  public String getkey(){
      int sum=0;
      String df=dateFormat2.format(new Date());
       for(int j=0;j<df.length();j++){
       sum+=(int)df.charAt(j);
      }
       int k=sum%(keys.size());
       return keylookupTable1(k);
  }
    
}

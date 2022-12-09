package com.audio.AudioPlay;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javazoom.jl.player.Player;

public class Audioclass {

	public static void main(String[] args) {
	
		VoiceProcess au=new VoiceProcess();
		au.start();
		
	}

}

class VoiceProcess extends Thread {
	static boolean validate=true;
    
	public static void convert_to_words(List<String> list) {
     	char[] num = null;
    	
	for(int j=0;j<list.size();j++) {
	     Object ls = list.get(j);
	String st=ls.toString();
	//System.out.println(st.toCharArray());
	num=st.toCharArray();
		}

 	String zeroaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\1655441536507-voicemaker.in-speech.mp3";
	String oneaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS1.mp3";
	String twoaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS2.mp3";
	String threeaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS3.mp3";
	String fouraudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS4.mp3";
	String fiveaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS5.mp3";
	String sixaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS6.mp3";
	String sevenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS7.mp3";
	String eightaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS8.mp3";
	String nineaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS9.mp3";
	String tenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS10.mp3";
	String elevenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS11.mp3";
	String twelveaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS12.mp3";
	String thirteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS13.mp3";
	String fourteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS14.mp3";
	String fifteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS15.mp3";
	String sixteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS16.mp3";
	String seventeenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS17.mp3";
	String eighteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS18.mp3";
	String nineteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS19.mp3";
	String twentyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS20.mp3";
	String thirtyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS30.mp3";
	String fortyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS40.mp3";
	String fiftyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS50.mp3";
	String sixtyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS60.mp3";
	String seventyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS70.mp3";
	String eightyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS80.mp3";
	String ninetyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS90.mp3";
	
	String hunderedaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\1655445943799-voicemaker.in-speech (1).mp3";
	String thousandaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\1655446062983-voicemaker.in-speech.mp3";
	
   try {
  
	   for(int i=0;i<list.size();i++)
	   {
		   list.get(i);
	   }
	   
	   
	// Get number of digits
      // in given number
      int len = num.length;

      /* The first string is not used, it is to make
          array indexing simple */
      String[] single_digits = new String[] {
          zeroaudio, oneaudio, twoaudio,   threeaudio, fouraudio,
          fiveaudio, sixaudio, sevenaudio, eightaudio, nineaudio
      };

      /* The first string is not used, it is to make
          array indexing simple */
      String[] two_digits = new String[] {
          "",          tenaudio,      elevenaudio,  twelveaudio,
          thirteenaudio,  fourteenaudio, fifteenaudio, sixteenaudio,
          seventeenaudio, eighteenaudio, nineteenaudio
      };

      /* The first two string are not used, they are to
       * make array indexing simple*/
      String[] tens_multiple = new String[] {
          "",      "",      twentyaudio,  thirtyaudio, fortyaudio,
          fiftyaudio, sixtyaudio, seventyaudio, eightyaudio, ninetyaudio
      };

      String[] tens_power
          = new String[] {hunderedaudio, thousandaudio};

      /* Used for debugging purpose only */
    //  System.out.print("1-->"+String.valueOf(num) + ": ");

      /* For single digit number */
      if (len == 1) {
      Player plays=new Player(new FileInputStream(new File(single_digits[num[0] -'0']).getAbsoluteFile()));
   	  plays.play();
   //       System.out.println("2-->"+single_digits[num[0] - '0']);
          return;
      }

      /* Iterate while num
          is not '\0' */
      int x = 0;
      while (x < num.length) {

          /* Code path for first 2 digits */
          if (len >= 3) {
              if (num[x] - '0' != 0) {
            	  Player plays=new Player(new FileInputStream(new File(single_digits[num[x] - '0']).getAbsoluteFile()));
               	  plays.play();
                
                  plays=new Player(new FileInputStream(new File(tens_power[len - 3]).getAbsoluteFile()));
               	  plays.play();
               
              }
              --len;
          }

          /* Code path for last 2 digits */
          else {
              /* Need to explicitly handle
              10-19. Sum of the two digits
              is used as index of "two_digits"
              array of strings */
              if (num[x] - '0' == 1) {
                  int sum
                      = num[x] - '0' + num[x + 1] - '0';
                  
                  Player plays=new Player(new FileInputStream(new File(two_digits[sum]).getAbsoluteFile()));
               	  plays.play();
               
                  
                  return;
              }

              /* Need to explicitly handle 20 */
              else if (num[x] - '0' == 2
                       && num[x + 1] - '0' == 0) {
             
                  Player plays=new Player(new FileInputStream(new File(twentyaudio).getAbsoluteFile()));
               	  plays.play();
              
                  
                  return;
              }

              /* Rest of the two digit
              numbers i.e., 21 to 99 */
              else {
                  int i = (num[x] - '0');
                  if (i > 0)
                  {
               	     Player plays=new Player(new FileInputStream(new File(tens_multiple[i]).getAbsoluteFile()));
                  	  plays.play();
               
                   }
                  else {
                      System.out.print("");
                  }
                  ++x;
                  if (num[x] - '0' != 0) {
                	  
                	  Player plays=new Player(new FileInputStream(new File(single_digits[num[x] - '0']).getAbsoluteFile()));
              	  plays.play();
             
                   }
              }
          }
          ++x;
      }
}  catch (Exception e)
   {
		e.printStackTrace();
  }

  
   
	}	
	
	public static void prcoessrun(int ch,String number) {
		
		
	String[] sp=number.split(",");
	List<String> list=new LinkedList<String>();	
	Scanner scstop=new Scanner(System.in);
	System.out.println("2 stop");
	int num=scstop.nextInt();
	if(ch==1) {
while(validate) {
	for(int i=0;i<sp.length;i++) 
	{
	    list.add(sp[i]);
		convert_to_words(list);
	
		switch (num) {
		case 2:
			validate=false;
			break;
		}
		
	}
}}
	}
	
	/*public static void switchcase(int ch,String number)
	{
		switch (ch) {
		case 1:{
			
				 VoiceProcess.prcoessrun(number);
				 break;
		}
		case 2:{
			VoiceProcess.validate=false;
			break;
		}
		
		}
	}*/
	
	
	public void run()
	{
		
		Scanner sc=new Scanner(System.in);
		
		while (true)
        {
			System.out.println("--->Enter Number");
			String number=sc.nextLine();
            System.out.println("1. play");
             
        	int ch=sc.nextInt();
        	
        	prcoessrun(ch,number);
        }
			}
	
	
}

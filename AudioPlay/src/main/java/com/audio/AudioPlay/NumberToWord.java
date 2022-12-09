package com.audio.AudioPlay;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class NumberToWord
{
	
	  static	String zeroaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\1655441536507-voicemaker.in-speech.mp3";
      static	String oneaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS1.mp3";
      static	String twoaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS2.mp3";
      static	String threeaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS3.mp3";
      static	String fouraudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS4.mp3";
      static	String fiveaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS5.mp3";
      static    String sixaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS6.mp3";
      	static	String sevenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS7.mp3";
      	static	String eightaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS8.mp3";
      	static	String nineaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS9.mp3";
      	static	String tenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS10.mp3";
      	static	String elevenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS11.mp3";
      	static	String twelveaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS12.mp3";
      	static	String thirteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS13.mp3";
      	static	String fourteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS14.mp3";
      	static	String fifteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS15.mp3";
      	static	String sixteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS16.mp3";
      	static	String seventeenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS17.mp3";
      	static	String eighteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS18.mp3";
      	static	String nineteenaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS19.mp3";
      	static	String twentyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS20.mp3";
      	static	String thirtyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS30.mp3";
      	static	String fortyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS40.mp3";
      	static	String fiftyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS50.mp3";
      	static	String sixtyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS60.mp3";
      	static	String seventyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS70.mp3";
      	static	String eightyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS80.mp3";
      	static	String ninetyaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\PCS90.mp3";
      	
      	static	String hunderedaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\1655445943799-voicemaker.in-speech (1).mp3";
      	static	String thousandaudio="E:\\new eclipse workspace\\AudioPlay\\audio\\1655446062983-voicemaker.in-speech.mp3";

	
	static void convert_to_words(char[] num)
    {
    
        int len = num.length;
 
        // Base cases
        if (len == 0) {
            System.out.println("empty string");
            return;
        }
        if (len > 4) {
            System.out.println(
                "Length more than 4 is not supported");
            return;
        }
 
             	
        	
         String[] single_digits = new String[] {
        		zeroaudio, oneaudio, twoaudio,   threeaudio, fouraudio,
        	          fiveaudio, sixaudio, sevenaudio, eightaudio, nineaudio
        	      };

        	      /* The first string is not used, it is to make
        	          array indexing simple */
         String[] two_digits  = new String[] {
        	         "", tenaudio,      elevenaudio,  twelveaudio,
        	          thirteenaudio,  fourteenaudio, fifteenaudio, sixteenaudio,
        	          seventeenaudio, eighteenaudio, nineteenaudio
        	      };

        	      /* The first two string are not used, they are to
        	       * make array indexing simple*/
         String[] tens_multiple   = new String[] {
        	         "","", twentyaudio,  thirtyaudio, fortyaudio,
        	          fiftyaudio, sixtyaudio, seventyaudio, eightyaudio, ninetyaudio
        	      };

         String[] tens_power = new String[] { hunderedaudio, thousandaudio };
         
 
        System.out.print(String.valueOf(num) + ": ");

        if (len == 1) {
            System.out.println(single_digits[num[0] - 48]);
            try {
                Player plays=new Player(new FileInputStream(new File(single_digits[num[0] - 48]).getAbsoluteFile()));
            	plays.play();
                }catch (Exception e) {
					// TODO: handle exception
				}
            
            return;
        }
 
        int x = 0;
        while (x < num.length) { if (len >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.print(single_digits[num[x] - '0'] + " ");
                    try {
                        Player plays=new Player(new FileInputStream(new File(single_digits[num[x] - 48]).getAbsoluteFile()));
                    	plays.play();
                        }catch (Exception e) {
        					// TODO: handle exception
        				}
                    
                    try {
                        Player plays=new Player(new FileInputStream(new File(tens_power[len - 3] + " ").getAbsoluteFile()));
                    	plays.play();
                        }catch (Exception e) {
        					// TODO: handle exception
        				}
                    
                    
                    System.out.print(tens_power[len - 3] + " ");
                    
                }
                --len;
            }
 
            else {
        
                if (num[x] - '0' == 1) {
                    int sum
                        = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(two_digits[sum]);
                    
                    try {
                        Player plays=new Player(new FileInputStream(new File(two_digits[sum]).getAbsoluteFile()));
                    	plays.play();
                        }catch (Exception e) {
        					// TODO: handle exception
        				}
                    
                    return;
                }
 
                else if (num[x] - '0' == 2
                         && num[x + 1] - '0' == 0) {
                    System.out.println("twenty");
                    try {
                        Player plays=new Player(new FileInputStream(new File(twentyaudio).getAbsoluteFile()));
                    	plays.play();
                        }catch (Exception e) {
        					// TODO: handle exception
        				}   
                    
                    
                    return;
                }
 
                else {
                    int i = (num[x] - '0');
                    if (i > 0) {
                        System.out.print(tens_multiple[i] + " ");
                    
                    try {
                        Player plays=new Player(new FileInputStream(new File(tens_multiple[i] + " ").getAbsoluteFile()));
                    	plays.play();
                        }catch (Exception e) {
        					// TODO: handle exception
        				} 
                    }
                    
                    else
                        System.out.print("");
                    ++x;
                    if (num[x] - '0' != 0) {
                        System.out.println(single_digits[num[x] - '0']);
                        
                        try {
                            Player plays=new Player(new FileInputStream(new File(single_digits[num[x] - '0']).getAbsoluteFile()));
                        	plays.play();
                            }catch (Exception e) {
            					// TODO: handle exception
            				} 
                        
                    }
                }
            }
            ++x;
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        convert_to_words("1".toCharArray());
    }
}
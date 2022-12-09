package com.audio.AudioPlay;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javazoom.jl.player.Player;

public class Task {
	
	static List<String> listNumber=new LinkedList<String>();

	public static void EnterNumber() {
		while(true) {
			System.out.println("ragul");
		System.out.println("1.start .........S");
		System.out.println("2.remove ........R");
		System.out.println("3.exit ..........E");
		
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	if(number==1) {
		System.out.println("Enter number to add" + "enter number " + " Enter number to add ");
		Scanner scs=new Scanner(System.in);
		String addNumber=scs.nextLine();
		listNumber.add(addNumber);
	//	for(int i=0;i<listNumber.size();i++) { System.out.println("list"+listNumber.get(i));}

		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
			
//				for(int i=0;i<listNumber.size();i++) {
//					System.out.println(listNumber.get(i));
//			}
				synchronized (listNumber) {
				Runnable r=new Process();
Thread th=new Thread(r);
th.start();
th.yield();

try {
	th.join(50000);	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
				}
				Thread.yield();
				}

			
		},0, 8000, TimeUnit.MILLISECONDS);
		
	}
 
 if(number==2) {
	System.out.println("Enter number to remove");
	Scanner scs=new Scanner(System.in);
	String removeNumber=scs.nextLine();
	int remove=listNumber.indexOf(removeNumber);
	listNumber.remove(remove);
//	for(int i=0;i<listNumber.size();i++) { System.out.println("rem"+listNumber.get(i));}

}
 
 if(number==3) {
	 System.out.println("Enter to exit");
	 System.exit(0);
 }
 
 		}
	}
	
	
	
	public static void main(String[] args) {
EnterNumber();


	}
	
	
	
	
	
}
class Process implements Runnable{
 
	public static void convert_to_words(String list) {
		System.out.println("list-->"+list);
     	char[] num = null;
    	
		//System.out.println(st.toCharArray());
	num=list.toCharArray();
	
		
		
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
	         String[] tens_multiple  = new String[] {
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

         
}  catch (Exception e)
   {
		e.printStackTrace();
  }
	
	}

	public void run() {
		
		for(int i=0;i<Task.listNumber.size();i++) {
		
	convert_to_words(Task.listNumber.get(i));
			}
	
	}
	
}

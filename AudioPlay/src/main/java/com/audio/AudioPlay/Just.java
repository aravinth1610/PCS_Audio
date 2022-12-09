package com.audio.AudioPlay;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Just {
	public String ragul = "";
	public String ragul12345 = "";
	
	  private long stopWatchStartTime = 0;
	  private boolean stopWatchRunning = false;

	public static void main(String[] args) {

	}
	public static void timeList(int number) {
		
		final List<String> ls=new LinkedList<String>();
		ls.add("a");
		
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
	
				for(int i=0;i<ls.size();i++) {
					System.out.println(ls.get(i));
				}
				}
		},1, 500, TimeUnit.MILLISECONDS);
        System.out.println("end");
       
	}
	

}

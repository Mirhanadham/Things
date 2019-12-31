package project;

import java.util.Map;

import UI.DisplayStat;

public class AdminStatistics {
	DisplayStat disStat;
	//almfrod yt3mlha "call" fl action button w yglha almap aly mwgoda f statistics ;
	public void maximum(Map <Integer,Integer> x)
	{
		int calcu=1;
		Integer max=0;
	    for (Map.Entry<Integer,Integer> entry : x.entrySet())  
	    {     if (max <entry.getValue()) 
                           max=entry.getValue();
	    } 
	    disStat=new DisplayStat(max,calcu);
	    System.out.println(max);
	 }
	//almfrod yt3mlha "call" fl action button w yglha almap aly mwgoda f statistics ;
	public void minimumm(Map <Integer,Integer> x)
	{
		int calcu=2;
		Integer min=100000000;
	    for (Map.Entry<Integer,Integer> entry : x.entrySet())  
	    {     if (min >entry.getValue()) 
                           min=entry.getValue();
	    } 
	    disStat=new DisplayStat(min,calcu);
	    
	 }
	//almfrod yt3mlha "call" fl action button w yglha almap aly mwgoda f statistics ;
	public void average(Map <Integer,Integer> x)
	{
		int calcu=3;
		Integer avg=0;

		for (Map.Entry<Integer,Integer> entry : x.entrySet())  
	    {     
             avg=avg+entry.getValue();
         
	    } 
	    avg=avg/x.size();
	    disStat=new DisplayStat(avg,calcu);
	 }
	
	
}

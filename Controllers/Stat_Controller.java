package Controllers;

import java.util.HashMap;
import java.util.Map;

import project.AdminStatistics;
import project.Statistics;

public class Stat_Controller {
	Statistics stat;
	AdminStatistics ADStat;
	Map<Integer ,Integer >soldOutProducts;
	Map<Integer ,Integer >boughtProducts;
	public Stat_Controller(Statistics stat,AdminStatistics ADStat) {
		this.stat=stat;
		this.ADStat=ADStat;
		soldOutProducts=stat.getSoldoutProducts();
		boughtProducts=stat.getBoughtProducts();
	}
		 
	 

	public void max(int mapNO)
	{
		
		 if (mapNO==2)
			ADStat.maximum(soldOutProducts);
		else
			ADStat.maximum(boughtProducts);
		
		
	}
	public void min(int mapNO)
	{
		
		 if (mapNO==2)
			ADStat.minimumm(soldOutProducts);
		else
			ADStat.minimumm(boughtProducts);
		
		
	}
	public void avg(int mapNO)
	{
		
		 if (mapNO==2)
			ADStat.average(soldOutProducts);
		else
			ADStat.average(boughtProducts);
		
		
	}

}
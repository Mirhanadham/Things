package Controllers;

import java.util.HashMap;
import java.util.Map;

import project.AdminStatistics;
import project.Statistics;

public class Stat_Controller {
	Statistics stat;
	AdminStatistics ADStat;
	Map<Integer ,Integer > view=stat.getViews();
	Map<Integer ,Integer > soldOutProducts=stat.getSoldoutProducts();
	Map<Integer ,Integer > boughtProducts=stat.getBoughtProducts();

	public void max(int mapNO)
	{
		if (mapNO==1)
			ADStat.maximum(view);
		else if (mapNO==2)
			ADStat.maximum(soldOutProducts);
		else
			ADStat.maximum(boughtProducts);
		
		
	}
	public void min(int mapNO)
	{
		if (mapNO==1)
			ADStat.minimumm(view);
		else if (mapNO==2)
			ADStat.minimumm(soldOutProducts);
		else
			ADStat.minimumm(boughtProducts);
		
		
	}
	public void avg(int mapNO)
	{
		if (mapNO==1)
			ADStat.average(view);
		else if (mapNO==2)
			ADStat.average(soldOutProducts);
		else
			ADStat.average(boughtProducts);
		
		
	}

}

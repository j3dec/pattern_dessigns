package fr.diginamic.strategy;

import java.util.List;

public class DemoTri {

	public static void main(String[] args) {
		StrategyFactorySort.Sort s = StrategyFactorySort.Sort.BUBBLE;
		StrategyFactorySort.Sort s2 = StrategyFactorySort.Sort.SELECTION;
		StrategyFactorySort.Sort s3 = StrategyFactorySort.Sort.INSERTION;
		StrategyFactorySort strat = new StrategyFactorySort();
		Integer[] array1 = {12, -5, 7, 0, 8, 4, -3, 9, 15};

		strat.exec(array1, s);
		strat.exec(array1, s2);
		strat.exec(array1, s3);


	}

}

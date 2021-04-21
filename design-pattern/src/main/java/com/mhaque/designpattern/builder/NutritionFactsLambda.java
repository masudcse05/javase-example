package com.mhaque.designpattern.builder;

import java.util.function.Consumer;

public class NutritionFactsLambda {
	private  int servingSize;
	private  int servings;
	private  int calories;
	private  int fat;
	private  int sodium;
	private  int carbohydrate;

	public NutritionFactsLambda servingSize(int servingSize) {
		this.servingSize= servingSize;
		return this;
	}

	public NutritionFactsLambda servings(int servings) {
		this.servings= servings;
		return this;
	}

	public NutritionFactsLambda calories(int calories) {
		this.calories= calories;
		return this;
	}

	public NutritionFactsLambda fat(int fat) {
		this.fat= fat;
		return this;
	}

	public NutritionFactsLambda sodium(int sodium) {
		this.sodium= sodium;
		return this;
	}

	public NutritionFactsLambda carbohydrate(int carbohydrate) {
		this.carbohydrate= carbohydrate;
		return this;
	}
	
	public static NutritionFactsLambda build(Consumer<NutritionFactsLambda> consumer) {
		NutritionFactsLambda nt = new NutritionFactsLambda();
		consumer.accept(nt);
		return nt;
	}
	
	
	
	@Override
	public String toString() {
		return "NutritionFactsLambda [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}

	public static void main(String[] args) {
		NutritionFactsLambda cocaCola = NutritionFactsLambda.build(n-> n.servingSize(10).calories(5).fat(10).carbohydrate(100));
		System.out.println(cocaCola);
	}

	
}

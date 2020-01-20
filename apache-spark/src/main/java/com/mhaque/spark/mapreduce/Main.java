package com.mhaque.spark.mapreduce;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Main {

	public static void main(String[] args) {
		
		Logger.getLogger("org.apache").setLevel(Level.WARN);
		
		List<Double> inputData = new ArrayList<>();
		inputData.add(35.5);
		inputData.add(25.5);
		inputData.add(45.5);
		inputData.add(75.5);
		inputData.add(95.5);
		SparkConf conf = new SparkConf().setAppName("startingSpark").setMaster("local[*]");
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		JavaRDD<Double> myRDD=sc.parallelize(inputData);
		 Double result = myRDD.reduce((value1, value2) -> value1 + value2);

		 System.out.println(result);
		 
		 JavaRDD<Double> squrtResult = myRDD.map(value -> Math.sqrt(value));
		 
		 squrtResult.collect().forEach(System.out::println);
		 
		 //Map and reduce
		 squrtResult = squrtResult.map(value -> 1D);
		 Double mapResult = squrtResult.reduce((value1, value2) -> value1 + value2);
		 System.out.println(mapResult);
		sc.close();
	}

}

package com.mhaque.spark;

import java.util.ArrayList;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class Main {

	public static void main(String[] args) {
		List<Double> inputData = new ArrayList<>();
		inputData.add(35.5);
		inputData.add(25.5);
		inputData.add(45.5);
		inputData.add(75.5);
		inputData.add(95.5);
		SparkConf conf = new SparkConf().setAppName("startingSpark").setMaster("local[*]");
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		JavaRDD<Double> myRDD=sc.parallelize(inputData);

		sc.close();
	}

}

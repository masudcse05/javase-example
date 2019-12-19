package com.mhaque.javase13.newfeatures;

public class TextBlock {
	public static void main(String[] args) {
		var html = """
				           <html>
				               <body>
				                   <p>Hello, World</p>
				               </body>
				           </html>
				""";

		var json = """
				{
				    "name":"mkyong",
				    "age":38
				}
				""";
		System.out.println(html);
		System.out.println(json);
	}
}

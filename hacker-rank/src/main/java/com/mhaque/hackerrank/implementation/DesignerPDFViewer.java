/**
 * Created by @authoer haquem on Feb 17, 2020 
 */
package com.mhaque.hackerrank.implementation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haquem
 *
 */
public class DesignerPDFViewer {
	 static int designerPdfViewer(int[] h, String word) {
       Map<Character, Integer> map = new HashMap<>();
       for(int i=0; i<h.length;i++) {
    	   char ch = (char) (97+i);
    	   map.put(ch, h[i]);
       }
       int maxHeight = 0;
       for(int i=0; i< word.length(); i++) {
    	   char ch = word.charAt(i);
    	   int height = map.get(ch);
    	   if(maxHeight < height) {
    		   maxHeight= height;
    	   }
       }
       return word.length()*maxHeight;
     }
}

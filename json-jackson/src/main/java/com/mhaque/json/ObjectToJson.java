package com.mhaque.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mhaque.json.model.Customer;

public class ObjectToJson {

	   public static String toJson(Customer customer) throws JsonProcessingException {
		   ObjectMapper objectMapper = new ObjectMapper();
		  return objectMapper.writeValueAsString(customer);
	   }
	   
	   public static Customer toObject(String json) throws JsonParseException, JsonMappingException, IOException {
		   ObjectMapper objectMapper = new ObjectMapper();
		   return objectMapper.readValue(json, Customer.class);
	   }
}

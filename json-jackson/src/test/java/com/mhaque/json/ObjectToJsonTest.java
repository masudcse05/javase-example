package com.mhaque.json;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mhaque.json.model.Address;
import com.mhaque.json.model.Customer;
import com.mhaque.json.model.Event;

public class ObjectToJsonTest {

	@Test
	public void testToJson() throws JsonProcessingException {
		Customer customer = new Customer();
		customer.setName("Masudul Haque");
		customer.setEmail("masud.cse.05@gmail.com");
		customer.setPhone("+318989545");
		customer.setDateOfBirth(new Date());
		Address address = new Address();
		address.setStreetName("Vogelwikke 13");
		address.setCity("Hilversum");
		address.setPostalCode("4545RR");
		address.setState("Utrecht");
		customer.setAddress(address);

		String value = ObjectToJson.toJson(customer);
		System.out.println(value);
	}

	@Test
	public void testToObject() throws JsonParseException, JsonMappingException, IOException {
		String json = "Masudul Haque";
		Customer customer = ObjectToJson.toObject(json);
		assertEquals("Masudul Haque", customer.getName());
	}

	@Test
	public void whenSerializingDateWithJackson_thenSerializedToTimestamp()
			throws JsonProcessingException, ParseException {

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm");
		df.setTimeZone(TimeZone.getTimeZone("UTC"));

		Date date = df.parse("01-01-1970 01:00");
		Event event = new Event("party", date);

		ObjectMapper mapper = new ObjectMapper();
		String value = mapper.writeValueAsString(event);
		System.out.println(value);
	}
}

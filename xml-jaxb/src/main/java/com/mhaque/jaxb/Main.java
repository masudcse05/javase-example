package com.mhaque.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.mhaque.jaxb.model.Customer;

public class Main {
	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("Masudul Haque");
		customer.setAge(29);

		try {

			File file = new File("customer.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}

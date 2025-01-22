package com.mtm.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mtm.entity.Customer;
import com.mtm.entity.Item;
import com.mtm.repository.CustomerRepository;
import com.mtm.repository.ItemRepository;
@Component
public class MyRunner implements CommandLineRunner {
@Autowired
CustomerRepository customerRepo;
@Autowired
ItemRepository itemRepo ;
	@Override
	public void run(String... args) throws Exception {
 
		Customer c1=new Customer();
		c1.setCustomerId(1);
		c1.setCustomerName("Bhushan");
		
		Customer c2=new Customer();
		c2.setCustomerId(2);
		c2.setCustomerName("Rakesh");
		
		Customer c3=new Customer();
		c3.setCustomerId(3);
		c3.setCustomerName("Sumit");
		
		Customer c4=new Customer();
		c4.setCustomerId(4);
		c4.setCustomerName("sunil");
		
		Item i1=new Item();
		i1.setItemId(1001);
		i1.setItemName("Laptop");
		
		Item i2=new Item();
		i2.setItemId(1002);
		i2.setItemName("Laptop");
		
		Item i3=new Item();
		i3.setItemId(1003);
		i3.setItemName("Mobile");
		
		Item i4=new Item();
		i4.setItemId(1004);
		i4.setItemName("Keyboard");
		
		List<Item> itemList1=new ArrayList<Item>();
		itemList1.add( i1);
		itemList1.add( i2);
		itemList1.add( i3);
		
		List<Item> itemList2=new ArrayList<Item>();
		itemList2.add( i1);
		itemList2.add( i2);
		itemList2.add( i4);
		
		c1.setItems(itemList1);
        customerRepo.save(c1);
        c2.setItems(itemList2);
         customerRepo.save(c2);
         
                 
//        
//		List<Customer> customerList=new ArrayList<Customer>();
//        customerList.add(c1);
//        customerList.add(c2);
//        customerList.add(c3);
//         i1.setCustomers(customerList);
//         itemRepo.save(i1);
//
//             
        
	}

}

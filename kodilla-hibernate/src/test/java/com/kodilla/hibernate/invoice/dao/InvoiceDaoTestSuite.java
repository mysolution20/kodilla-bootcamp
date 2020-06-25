package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product apples = new Product("Apples");
        Product strawberries= new Product("Strawberries");

        Product pears = new Product("Carrot");
        Product plums= new Product("Parsley");

        List<Product> fruits = new ArrayList<>();
        fruits.add(apples);
        fruits.add(strawberries);

        List<Product> vegetables = new ArrayList<>();
        vegetables.add(pears);
        vegetables.add(plums);

        Item item = new Item();

        item.setProducts(fruits);
        Item item1 = new Item(fruits,new BigDecimal(4.4),2,new BigDecimal(8.8));
        Item item2 = new Item(vegetables,new BigDecimal(2.1),3,new BigDecimal(6.3));


        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        Invoice invoice = new Invoice("AA/0001/06/2020",items);


    }
}
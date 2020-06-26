package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product apples = new Product("Apples");
        Product strawberries = new Product("Strawberries");
        Product carrot = new Product("Carrot");

        Item itemApples = new Item(new BigDecimal(4.4), 2, new BigDecimal(8.8));
        Item itemStrawberries = new Item(new BigDecimal(2.1), 3, new BigDecimal(6.3));
        Item itemCarrot = new Item(new BigDecimal(4.2), 4, new BigDecimal(16.8));

        itemApples.setProduct(apples);
        itemStrawberries.setProduct(strawberries);
        itemCarrot.setProduct(carrot);

        Invoice invoice = new Invoice("AA/001/06/2020");
        invoice.getItems().add(itemApples);
        invoice.getItems().add(itemStrawberries);
        invoice.getItems().add(itemCarrot);

        invoiceDao.save(invoice);

        //When
        int applesId = apples.getId();
        int strawberriesId = strawberries.getId();
        int carrotId = carrot.getId();

        int itemApplesId = itemApples.getId();
        int itemStrawberriesId = itemStrawberries.getId();
        int itemCarrotId = itemCarrot.getId();

        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        Assert.assertNotEquals(0, applesId);
        Assert.assertNotEquals(0, strawberriesId);
        Assert.assertNotEquals(0, carrotId);

        Assert.assertNotEquals(0, itemApplesId);
        Assert.assertNotEquals(0, itemStrawberriesId);
        Assert.assertNotEquals(0, itemCarrotId);

        // CleanUp
        try {
            invoiceDao.deleteById(invoiceId);

            productDao.deleteById(applesId);
            productDao.deleteById(strawberriesId);
            productDao.deleteById(carrotId);

            itemDao.deleteById(itemApplesId);
            itemDao.deleteById(itemStrawberriesId);
            itemDao.deleteById(itemCarrotId);

        } catch (Exception e) {
            System.out.println("All records have been cleaned Up.");
        }
    }

}
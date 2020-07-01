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
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product apples = new Product("Apples");
        Product strawberries = new Product("Strawberries");
        Product carrot = new Product("Carrot");

        Item itemApples = new Item(new BigDecimal(4.4), 2, new BigDecimal(8.8));
        Item itemStrawberries = new Item(new BigDecimal(2.1), 3, new BigDecimal(6.3));
        Item itemCarrot = new Item(new BigDecimal(4.2), 4, new BigDecimal(16.8));

        Invoice invoice = new Invoice("AA/001/06/2020");

        invoice.getItems().add(itemApples);
        invoice.getItems().add(itemStrawberries);
        invoice.getItems().add(itemCarrot);

        /**
         * Z racji tego ze klucze obce sa jedynie w tabeli items
         * to najpierw dolaczyc do encji Item product
         * oraz Invoice za pomoca setterow i dopiero zapisac na bazie.
         */

        itemApples.setInvoice(invoice);
        itemApples.setProduct(apples);

        itemStrawberries.setInvoice(invoice);
        itemStrawberries.setProduct(strawberries);

        itemCarrot.setInvoice(invoice);
        itemCarrot.setProduct(carrot);

        itemDao.save(itemApples);
        itemDao.save(itemStrawberries);
        itemDao.save(itemCarrot);

        //When
        int itemApplesId = itemApples.getId();
        int itemStrawberriesId = itemStrawberries.getId();
        int itemCarrotId = itemCarrot.getId();

        int applesId = apples.getId();
        int strawberriesId = strawberries.getId();
        int carrotId = carrot.getId();

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
            itemDao.deleteAll();
        } catch (Exception e) {
            System.out.println("Records have not been cleaned up.");
        }
    }
}
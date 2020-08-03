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
    public static final String NUMBER = "FV01012020/1";
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product brick = new Product("Brick");
        Product plank = new Product("Plank");
        Product nail = new Product("Nail");

        Item item1 = new Item(brick, new BigDecimal(10), 100);
        Item item2 = new Item(plank, new BigDecimal(20), 40);
        Item item3 = new Item(nail, new BigDecimal(1), 1000);

        brick.getItems().add(item1);
        plank.getItems().add(item2);
        nail.getItems().add(item3);

        Invoice invoice = new Invoice(NUMBER);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(brick);
        productDao.save(plank);
        productDao.save(nail);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        try {
            itemDao.delete(item1);
            itemDao.delete(item2);
            itemDao.delete(item3);
            invoiceDao.delete(invoice);
            productDao.delete(brick);
            productDao.delete(plank);
            productDao.delete(nail);
        } catch (Exception e) {
            //do nothing
        }

    }
}

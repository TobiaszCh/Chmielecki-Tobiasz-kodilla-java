package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.Dao.InvoiceDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoTest() {

        //Given
        Invoice invoice = new Invoice("1");

        Item item1 = new Item(new BigDecimal(3000));
        Item item2 = new Item(new BigDecimal(100));
        Item item3 = new Item(new BigDecimal(30));

        Product product1 = new Product("PS4");
        Product product2 = new Product("headphone");
        Product product3 = new Product("etui");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoiceDao.save(invoice);
        int id = invoice.getID();
        //Then
        assertNotEquals(0, id);
        //CleanUp
        invoiceDao.deleteById(id);


    }
}

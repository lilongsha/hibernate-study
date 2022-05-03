package com.mzvzm.entity;

import org.hibernate.engine.jdbc.ClobProxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/4/28 16:10
 */
@Entity(name = "Product")
public class Product {

    @Id
    private Integer id;

    private String sku;

    private String name;

    private String description;

    @Lob
    private Clob warranty;

    public Clob getWarranty() {
        return warranty;
    }

    public void setWarranty(Clob warranty) {
        this.warranty = warranty;
    }

    public static void main(String[] args) throws SQLException, IOException {
        Product product = new Product();
        product.setWarranty(ClobProxy.generateProxy("My product warranty"));
        Clob clob = product.getWarranty();
        Reader characterStream = clob.getCharacterStream();
    }
}

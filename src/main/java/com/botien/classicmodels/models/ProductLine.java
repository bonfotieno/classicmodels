package com.botien.classicmodels.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Entity
@Table(name = "product_lines")
public class ProductLine implements Serializable {

    @Id
    @Size(max = 50)
    @Column(name = "product_line", nullable = false, length = 50)
    private String productLine;

    @Size(max = 4000)
    @Column(name = "text_description", length = 4000)
    private String textDescription;

    @Lob
    @Column(name = "html_description")
    private String htmlDescription;

    @Column(name = "image")
    private byte[] image;


    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}

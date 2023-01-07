package com.botien.classicmodels.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @Column(name = "product_code", nullable = false, updatable = false)
    private String productCode;

    @NotNull
    @Size(max = 70)
    @Column(name = "product_name", length = 70, nullable = false)
    private String productName;


    @OneToOne(optional = false)
    @JoinColumn(name = "product_line",foreignKey = @ForeignKey(name = "products_ibfk_1"))
    private ProductLine productLine;

    @NotNull
    @Size(max = 10)
    @Column(name = "product_scale", length = 10, nullable = false)
    private String productScale;


    @NotNull
    @Size(max = 50)
    @Column(name = "product_vendor", length = 50, nullable = false)
    private String productVendor;

    @NotNull
    @Column(name = "product_description", nullable = false, columnDefinition = "text")
    private String productDescription;

    @NotNull
    @Column(name = "quantity_inStock", nullable = false, columnDefinition = "smallint")
    private Integer quantityInStock;

    @NotNull
    @Column(name = "buy_price", nullable = false)
    BigDecimal buyPrice;

    @NotNull
    @Column(nullable = false,name = "MSRP")
    BigDecimal MSRP;


    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public void setProductLine(ProductLine productLine) {
        this.productLine = productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getMSRP() {
        return MSRP;
    }

    public void setMSRP(BigDecimal MSRP) {
        this.MSRP = MSRP;
    }
}

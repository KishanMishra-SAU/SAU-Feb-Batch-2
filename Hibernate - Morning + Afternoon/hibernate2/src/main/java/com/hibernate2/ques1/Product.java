package com.hibernate2.ques1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;

    @OneToMany (mappedBy = "prodObj")
    private List<Categories> catlist = new ArrayList<>();

    public List<Categories> getCatlist() {
        return catlist;
    }

    public void setCatlist(List<Categories> catlist) {
        this.catlist = catlist;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}

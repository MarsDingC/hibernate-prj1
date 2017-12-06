package cn.edu.zjut.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

/**
 * Created by 92377 on 2017/11/17.
 */
@Entity
public class ItemBasic {
    private ItemPK ipk;

    private String description;
    private Double cost;

    public ItemBasic(ItemPK ipk, String description, Double cost) {
        this.ipk = ipk;
        this.description = description;
        this.cost = cost;
    }

    public ItemBasic() {
    }

    public ItemPK getIpk() {
        return ipk;
    }

    public void setIpk(ItemPK ipk) {
        this.ipk = ipk;
    }

    @Id
    @Column(name = "ISBN", nullable = false, length = 20)
    public String getIsbn() {
        return ipk.getIsbn();
    }

    public void setIsbn(String isbn) {
        ipk.setIsbn(isbn);
    }

    @Basic
    @Column(name = "title", nullable = true, length = 30)
    public String getTitle() {
        return ipk.getTitle();
    }

    public void setTitle(String title) {
        ipk.setTitle(title);
    }

    @Basic
    @Column(name = "description", nullable = true, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "cost", nullable = true, precision = 0)
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Item item = (Item) o;
//
////        if (isbn != null ? !isbn.equals(item.isbn) : item.isbn != null) return false;
////        if (title != null ? !title.equals(item.title) : item.title != null) return false;
//        if (description != null ? !description.equals(item.description) : item.description != null) return false;
//        if (cost != null ? !cost.equals(item.cost) : item.cost != null) return false;
//        if (!Arrays.equals(image, item.image)) return false;
//
//        return true;
//    }

//    @Override
//    public int hashCode() {
//        int result = isbn != null ? isbn.hashCode() : 0;
//        result = 31 * result + (title != null ? title.hashCode() : 0);
//        result = 31 * result + (description != null ? description.hashCode() : 0);
//        result = 31 * result + (cost != null ? cost.hashCode() : 0);
//        result = 31 * result + Arrays.hashCode(image);
//        return result;
//    }
}

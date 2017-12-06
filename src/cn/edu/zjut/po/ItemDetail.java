package cn.edu.zjut.po;

import java.sql.Blob;

public class ItemDetail extends ItemBasic {
    private Blob image;

    public ItemDetail() {
    }

    public ItemDetail(ItemPK ipk, String description, Double cost, Blob image) {
        super(ipk, description, cost);
        this.image = image;
    } //省略setters/getters方法

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}
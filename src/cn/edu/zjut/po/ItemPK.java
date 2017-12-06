package cn.edu.zjut.po;

import java.io.Serializable;

/**
 * Created by 92377 on 2017/11/17.
 */
public class ItemPK implements Serializable {
    private String isbn;
    private String title;

    public ItemPK() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

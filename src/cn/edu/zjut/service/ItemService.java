package cn.edu.zjut.service;

import cn.edu.zjut.dao.ItemDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 92377 on 2017/11/17.
 */
public class ItemService {
    private List items = new ArrayList();

    public List getAllItems() {
        ItemDAO dao = new ItemDAO();
        List items = dao.findAll();
        return items;
    }
}
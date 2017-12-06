package cn.edu.zjut.action;
import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.ItemService;
import cn.edu.zjut.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 92377 on 2017/11/17.
 */
public class ItemAction {
    private List items = new ArrayList();

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public String getAllItems(){//获取所有商品信息
        ItemService itemService=new ItemService();
        items=itemService.getAllItems();
        return "success";
    }
}

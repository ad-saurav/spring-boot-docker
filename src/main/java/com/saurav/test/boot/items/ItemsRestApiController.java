package com.saurav.test.boot.items;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/items")
public class ItemsRestApiController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Item> getItems() {
        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("Computer", 120));
        itemList.add(new Item("Mobile", 80));
        itemList.add(new Item("Tablet", 90));

        return  itemList;
    }
}

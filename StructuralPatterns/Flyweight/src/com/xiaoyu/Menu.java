package com.xiaoyu;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by gxytk on 2016/10/30.
 */
public class Menu {
    private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<>();

    public CoffeeFlavour lookup(String flavourName) {
        if(!flavours.containsKey(flavourName))
            flavours.put(flavourName, new CoffeeFlavour(flavourName));
        return flavours.get(flavourName);
    }

    public int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}

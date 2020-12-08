package ru.mirea.practic12;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;

public class Address {
    private String address;
    private Map<String, String> addressMap;
    private final LinkedList<String> VALUES = new LinkedList();

    public Address(String address) {
        this.address = address.trim();
        this.addressMap = new LinkedHashMap();
        this.VALUES.addAll(Arrays.asList("country", "city", "street", "home", "body", "flat"));
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void splitByComma() {
        String[] splitArr = this.address.split(",");
        for(int i = 0; i < splitArr.length; ++i) {
            this.addressMap.put(this.VALUES.get(i), splitArr[i].trim());
        }

    }

    public void display() {
        System.out.println(this.addressMap);
    }

    public void splitByAnySymbol() {
        int i = 0;
        for(StringTokenizer tokens = new StringTokenizer(this.address, "[,.;-]"); tokens.hasMoreTokens(); ++i) {
            this.addressMap.put(this.VALUES.get(i), tokens.nextToken().trim());
        }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitaliy on 1/19/2016.
 */
public class CollectionEx {

    private List<LetterPair> list;

    public CollectionEx(List<LetterPair> list) {
        this.list = list;
    }

    public void print(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
}

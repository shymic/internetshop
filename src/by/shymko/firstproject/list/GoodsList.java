package by.shymko.firstproject.list;

import by.shymko.firstproject.JSONRecord;
import by.shymko.firstproject.client.Client;
import by.shymko.firstproject.exceptions.IdNotFoundException;
import by.shymko.firstproject.goods.Good;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Andrey on 17.02.2015.
 */
public class GoodsList extends ArrayList<Good> {
    public GoodsList(int initialCapacity ) {
        super(initialCapacity);
    }

    public GoodsList() {}

    public GoodsList(ArrayList<JSONRecord> list){
        super(list.size());
        for(int i = 0; i < list.size(); ++i)
            add((Good) list.get(i));
    }


    public boolean removeById( int id) throws  IdNotFoundException{
        for( int i = 0; i < this.size(); ++i){
            if  ( this.get(i).getId() == id){
                this.remove(i);
                return true;
            }
        }
      return false;
    }

}

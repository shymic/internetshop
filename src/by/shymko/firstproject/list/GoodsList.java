package by.shymko.firstproject.list;

import by.shymko.firstproject.exceptions.IdNotFoundException;
import by.shymko.firstproject.goods.Good;

import java.util.ArrayList;

/**
 * Created by Andrey on 17.02.2015.
 */
public class GoodsList extends ArrayList<Good> {
    public GoodsList(int initialCapacity) {
        super(initialCapacity);
    }

    public GoodsList() {
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

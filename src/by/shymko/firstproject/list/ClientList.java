package by.shymko.firstproject.list;


import by.shymko.firstproject.JSONRecord;
import by.shymko.firstproject.client.Client;
import by.shymko.firstproject.exceptions.IdNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Andrey on 17.02.2015.
 */
public class ClientList extends ArrayList<Client> {
    public ClientList(int initialCapacity) {
        super(initialCapacity);
    }

    public ClientList() {
    }

    public ClientList(ArrayList<JSONRecord> list){
        super(list.size());
        for(int i = 0; i < list.size(); ++i)
            add((Client) list.get(i));
    }

    public Client findById(int id)throws IdNotFoundException {
        for( int i = 0; i < this.size(); ++i){
            if ( this.get(i).getId() == id){
                return this.get(i);
            }
        }
        throw new IdNotFoundException();
    }
}

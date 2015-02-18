package by.shymko.firstproject.administrator;

import by.shymko.firstproject.JSONRecord;
import by.shymko.firstproject.client.Client;
import by.shymko.firstproject.exceptions.IdNotFoundException;
import by.shymko.firstproject.goods.Good;
import by.shymko.firstproject.list.ClientList;
import by.shymko.firstproject.list.GoodsList;
import by.shymko.firstproject.user.User;

import java.util.ArrayList;


/**
 * Created by Andrey on 17.02.2015.
 */
public class Administrator extends User{
    private String contact;
    private GoodsList priseList;
    private ClientList clientList;

    public Administrator(int id, String name, String contact,
                         ArrayList<JSONRecord> clientList, ArrayList<JSONRecord> priseList) {
        super(id, name);
        this.contact = contact;
        this.priseList = new GoodsList(priseList);
        this.clientList = new ClientList(clientList);
    }

    public Administrator(int id, String name, String contact) {
        super(id, name);
        this.contact = contact;
        priseList = new GoodsList();
        clientList = new ClientList();
    }


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public GoodsList getPriseList() {
        return priseList;
    }

    public void setPriseList(GoodsList priseList) {
        this.priseList = priseList;
    }

    public ClientList getClientList() {
        return clientList;
    }

    public void setClientList(ClientList clientList) {
        this.clientList = clientList;
    }

    public boolean addClient(Client client){
        return clientList.add(client);
    }

    public boolean removeGood ( int id ) throws IdNotFoundException {
        return getPriseList().removeById(id);
    }

    public boolean addGood(Good good){
        return priseList.add( good);
    }

    public void blockClient( int id ) throws IdNotFoundException {
      clientList.findById(id).setActivity(false);
    }

    public void unblockClient( int id ) throws IdNotFoundException {
       clientList.findById(id).setActivity(true);
    }

    @Override
    public String toString() {
        return "Administrator{" + "id=" + super.getId() +'\n' +
                ", name='" + super.getName() + '\n' +
                "contact='" + contact + '\n' +
                ", priseList=" + priseList +'\n' +
                ", clientList=" + clientList +'\n' +
                '}';
    }
}

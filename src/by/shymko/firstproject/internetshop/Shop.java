package by.shymko.firstproject.internetshop;

import by.shymko.firstproject.administrator.Administrator;
import by.shymko.firstproject.exceptions.ReadFileNotFoundException;
import by.shymko.firstproject.initializators.ReadData;
import by.shymko.firstproject.user.User;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Andrey on 17.02.2015.
 */
public class Shop {
    private ArrayList<User> staff;
    private Administrator admin;

    public Shop(Administrator admin) {
        this.admin = admin;
        initStaff();
    }

    public Administrator getAdmin() {
        return admin;
    }

    public Shop() throws ParseException, IOException, ReadFileNotFoundException {
        admin = new Administrator(123, "admin", "admin@tut.by", ReadData.readClients(), ReadData.readGoods() );
        initStaff();
    }

    public void initStaff(){
        staff = new ArrayList<User>();
        staff.add(admin);
        staff.addAll(admin.getClientList());
    }

    @Override
    public String toString() {
        return "Shop{" +
                "staff=" + staff +
                ", admin=" + admin +
                '}';
    }
}
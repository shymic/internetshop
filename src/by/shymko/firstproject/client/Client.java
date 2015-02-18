package by.shymko.firstproject.client;

import by.shymko.firstproject.list.GoodsList;
import by.shymko.firstproject.user.User;


/**
 * Created by Andrey on 17.02.2015.
 */
public class Client extends User {
    private GoodsList order;
    private int budget;
    private boolean activity;

    protected Client(int id, String name) {
        super(id, name);
    }

    public Client(int id, String name, int budget, boolean activity) {
        super(id, name);
        this.budget = budget;
        this.activity = activity;
    }

    public GoodsList getOrder() {
        return order;
    }

    public void setOrder(GoodsList order) {
        this.order = order;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + super.getId() +
                ", name='" + super.getName() +
                "order=" + order +
                ", budget=" + budget +
                ", activity=" + activity +
                '}'+ '\n';
    }
}

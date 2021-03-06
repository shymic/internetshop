package by.shymko.firstproject.goods;

/**
 * Created by Andrey on 17.02.2015.
 */
public class Good {
    private int id;
    private String name;
    private int prise;
    private int sale;
    private String info;
    private int quantity;

    public Good(int id, String name, int prise, int sale, String info, int quantity) {
        this.id = id;
        this.name = name;
        this.prise = prise;
        this.sale = sale;
        this.info = info;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prise=" + prise +
                ", sale=" + sale +
                ", info='" + info + '\'' +
                ", quantity=" + quantity +
                '}'+'\n' ;
    }
}

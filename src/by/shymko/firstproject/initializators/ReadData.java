package by.shymko.firstproject.initializators;

import by.shymko.firstproject.client.Client;
import by.shymko.firstproject.exceptions.ReadFileNotFoundException;
import by.shymko.firstproject.goods.Good;
import by.shymko.firstproject.list.ClientList;
import by.shymko.firstproject.list.GoodsList;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by Andrey on 17.02.2015.
 */
public class ReadData {
    public static final String CLIENTS = "src\\by\\shymko\\firstproject\\resourses\\clients.json";
    public static final String GOODS = "src\\by\\shymko\\firstproject\\resourses\\goods.json";
    private static  final Logger LOG = Logger.getLogger(ReadData.class);

    public static  ClientList readClients() throws ReadFileNotFoundException, IOException, ParseException {
        try (FileReader fileReader = new FileReader(CLIENTS)){
            LOG.debug("clients file opened");
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) obj;


            ClientList clientsList = new ClientList();
            JSONArray clients = (JSONArray) jsonObject.get("clients");

            Iterator<JSONObject> iterator = clients.iterator();

            while (iterator.hasNext()) {
                JSONObject jsObject = iterator.next();
                Long id = (Long) jsObject.get("id");
                String name = (String) jsObject.get("name");
                Long budget = (Long) jsObject.get("budget");
                boolean status = (Boolean) jsObject.get("status");
                clientsList.add(new Client(id.intValue(), name, budget.intValue(), status));
            }
            return clientsList;

        } catch (FileNotFoundException e) {
           LOG.error("exception", e);
           throw new ReadFileNotFoundException(e);
        }
    }

    public static  GoodsList readGoods() throws ReadFileNotFoundException, IOException, ParseException {
        try (FileReader fileReader = new FileReader(GOODS)){
            LOG.debug("goods file opened");
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(fileReader);
            JSONObject jsonObject = (JSONObject) obj;


            GoodsList priseList = new GoodsList();
            JSONArray goods = (JSONArray) jsonObject.get("goods");

            Iterator<JSONObject> iterator = goods.iterator();

            while (iterator.hasNext()) {
                JSONObject jsObject = iterator.next();
                Long id = (Long) jsObject.get("id");
                String name = (String) jsObject.get("name");
                Long prise = (Long) jsObject.get("prise");
                Long sale = (Long) jsObject.get("sale");
                String info = (String) jsObject.get("info");
                Long quantity = (Long) jsObject.get("quantity");
                priseList.add(new Good(id.intValue(), name, prise.intValue(), sale.intValue(), info, quantity.intValue()));
            }
            return priseList;

        } catch (FileNotFoundException e) {
            LOG.error("file not found", e);
            throw new ReadFileNotFoundException(e);
        }
    }



}

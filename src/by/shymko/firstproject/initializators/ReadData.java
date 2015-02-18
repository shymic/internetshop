package by.shymko.firstproject.initializators;

import by.shymko.firstproject.JSONRecord;
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
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Andrey on 17.02.2015.
 *
 */
public class ReadData {
    private static final Logger LOG = Logger.getLogger(ReadData.class);

    public static ArrayList<JSONRecord> read(String filename, String arrayName, JSONRecord record) {
        ArrayList<JSONRecord> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(filename)) {
            LOG.debug(filename + " file opened");
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            JSONArray jsonArray = (JSONArray) jsonObject.get(arrayName);
            Iterator<JSONObject> iterator = jsonArray.iterator();
            while (iterator.hasNext())
                list.add(record.read(iterator.next()));
            return list;
        } catch (IOException e) {
            list = new ArrayList<>();
            e.printStackTrace();
        } catch (ParseException e) {
            list = new ArrayList<>();
            e.printStackTrace();
        }
        return list;
    }
}

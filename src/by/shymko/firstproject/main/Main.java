package by.shymko.firstproject.main;

import by.shymko.firstproject.internetshop.Shop;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


/**
 * Created by Andrey on 17.02.2015.
 */
public class Main {
    private static  final Logger LOG = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        try {
            new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
            LOG.info("Start");
            Shop shop = new Shop();
            LOG.info(shop.toString());
            LOG.debug("finish");
        } catch (Exception e) {
            LOG.error("exception", e);
        }
    }
}

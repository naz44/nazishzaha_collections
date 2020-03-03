package com.vnr.nazish.customcollection;
import org.apache.logging.log4j.*;

public class App 
{
    public static void main( String[] args )
    {
    	final Logger LOGGER = LogManager.getLogger(MyCustomList.class.getName());
    	MyCustomList<String> customList=new MyCustomList<String>(10);
    	customList.add("Shinchan");
    	customList.add("Pokemon");
    	customList.add("Doraemon");
    	customList.add("Chota Bheem");
    	customList.add("Kiteretsu");
    	customList.add("Pingu the penguin");    	
    	customList.add("Ninga Hattori");
    	customList.add("Mr.Bean");
    	LOGGER.debug("This is a custom list which has list of cartoons:-----");
    	customList.print();
    	
    	LOGGER.debug("The size of custom List is "+customList.size());
    	
    	LOGGER.debug("After inserting at index positon 3\tThe old value is:"
    	+customList.set(2,"Tom and Jerry"));
    	LOGGER.debug("The custom list is-----");
    	customList.print();
    	
    	LOGGER.debug("The element at index 5 is :"+customList.fetch(4));

    	customList.remove(2);
    	LOGGER.debug("After removing element at index 3 the list is");
    	customList.print();
    }
}

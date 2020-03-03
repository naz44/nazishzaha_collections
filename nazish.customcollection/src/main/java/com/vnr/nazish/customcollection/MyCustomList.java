package com.vnr.nazish.customcollection;
import java.util.AbstractList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyCustomList<T> extends AbstractList<T>
{
	T[] arr;
	final Logger LOGGER = LogManager.getLogger(MyCustomList.class.getName());
	private int cnt=0;
	MyCustomList(T[] array)
	{
		arr=array;
	}
	 @SuppressWarnings("unchecked")
	MyCustomList(int i) {
	   arr=(T[]) new Object[i];
	}
	public T get(int index)
	{
		return(arr[index]);
	}
	public T set(int index,T element)
	{
		T temp=arr[index];
		arr[index]=element;
		return(temp);
	}
	public int size() 
	{
		return arr.length;
	}
	public void print()
	{
		
		for(T i:arr)
	    	LOGGER.debug(i);
	}
	public T fetch(int index)
	{
		return(arr[index]);
	}
	public boolean add(T element)
	{
		if(cnt<=arr.length) {
		arr[cnt++]=element;
		return(true);
		}
		return(false);
		
	}
	public T remove(int index)
	{
		T element=null;
		if(index<0 || index>arr.length)
			{LOGGER.debug("sorry that positon does not exist");
			return(element);}
		element=arr[index];
		for(int i=index;i<arr.length;i++)
			{if(i==arr.length-1)
				break;
			arr[i]=arr[i+1];}
		return(element);		
	}
	
}

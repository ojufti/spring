package com.bitwise.cart;

public class ItemDetail {
	public  String name,price,quantity,size;
	ShowPropertyBeans obj= new ShowPropertyBeans();
 	public void detail(String n)
 	{
	switch(n)
	   {
	case "tv":
		name="samsung";price="25k"; quantity="out of stock"; size="24inches";
	case "pen":
		name="reynolds"; price="10Rs"; quantity="34"; size="-";
	case "pencil":
		name="natraj" ;price="5Rs"; quantity="100"; size="normal";
	case "toygun":
		name="hammer"; price="333Rs"; quantity="12"; size="handgun";
	case "candle":
		name="wewe"; price="10Rs"; quantity="1"; size="large";
		default:
			name="null"; price="10Rs"; quantity="1"; size="large";
		}
	
	obj.setName(name);obj.setPrice(price);obj.setSize(size);obj.setQuantity(quantity);
	
	
 	}
}

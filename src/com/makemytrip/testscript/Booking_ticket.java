package com.makemytrip.testscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.makemytrip.lib.General;
public class Booking_ticket 
{
	@Test
	public void booking_ticket()throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openapplication();
		obj.booking_trian();
		
		
		
		
	}

}

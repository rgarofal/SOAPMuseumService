package com.museum.services;

import javax.jws.WebService;
import javax.jws.WebMethod;



@WebService
public class Museum_server {
	@WebMethod
	public String getMuseumHour(int idMuseum) {
		String pp = "";
		if (idMuseum > 80)
			idMuseum = 10000;
		if (idMuseum > 7)
			idMuseum = 12000;
		switch (idMuseum) {
		case 1:
			pp = "09:30 am - 5:30 pm";
			break;
		case 2:
			pp = "08:15 am - 5:45 pm";
			break;
		case 3:
			pp = "10:00 am - 6:30 pm";
			break;
		case 4:
			pp = "09:00 am - 5:30 pm";
			break;
		case 5:
			pp = "09:30 am - 5:30 pm";
			break;
		case 6:
			pp = "09:30 am - 5:30 pm";
			break;
		case 10000:
			pp = "09:30 am - 5:30 pm";
			break;
		case 12000:
			pp = "09:00 am - 6:30 pm";
			break;
		default:
			pp = "09:00 am - 6:00 pm";
		}
      return pp;
	}
}

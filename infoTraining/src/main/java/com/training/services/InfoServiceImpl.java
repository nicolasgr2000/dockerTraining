package com.training.services;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

import org.springframework.stereotype.Service;

import com.training.model.InfoModel;

@Service
public class InfoServiceImpl {

	public InfoModel getInfo() {
		InfoModel info = null;
		try {
			InetAddress address = InetAddress.getLocalHost();
			ZonedDateTime zoneNow = ZonedDateTime.now();
			info = new InfoModel(address.getHostName(), address.getHostAddress(), LocalDate.now(), LocalTime.now(),
					zoneNow.getZone().toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		return info;
	}
}

package com.training.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class InfoModel implements Serializable {

	private static final long serialVersionUID = 2845837459535419603L;
	private String hostname;
	private String ip;
	private LocalDate localDate;
	private LocalTime localTime;
	private String zoneId;

	public InfoModel(String hostname, String ip, LocalDate localDate, LocalTime localTime, String zoneId) {
		this.hostname = hostname;
		this.ip = ip;
		this.localDate = localDate;
		this.localTime = localTime;
		this.zoneId = zoneId;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
}

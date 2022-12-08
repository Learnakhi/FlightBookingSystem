package com.Flight.Booking.System.Bookingmicroservice.Entity;

//import java.sql.Date;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reservation")
public class Booking {

	private int bookingId;
	private String name;
	private String gender;
	private String age;
	private String address;
	private int seatnumber;
	private long bankid;
	private String origin;
	private String destination;
	private LocalDate bookingdate;

	public Booking() {

	}

	@Override
	public String toString() {
		return "Booking [Id=" + bookingId + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address
				+ ", seatnumber=" + seatnumber + ", bankid=" + bankid + ", origin=" + origin + ", destination=" + destination
				+ ", Ldate=" + bookingdate + "]";
	}

	public Booking(int bookingid, String name, String gender, String age, String address, int seatnumber, long bankid,
			String origin, String destination, String bookingdate, String flightstatus) {
		super();
		bookingId = bookingid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.seatnumber = seatnumber;
		this.bankid = bankid;
		this.origin = origin;
		this.destination = destination;
		this.bookingdate = LocalDate.parse(bookingdate);
	}

	public int getbookingId() {
		return bookingId;
	}

	public void setId(int id) {
		bookingId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public long getBankid() {
		return bankid;
	}

	public void setBankid(long bankid) {
		this.bankid = bankid;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getDate() {
		return bookingdate;
	}

	public void setDate(String date) {
		this.bookingdate = LocalDate.parse(date);
	}





}

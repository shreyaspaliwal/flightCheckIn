package com.shreyas.flightcheckinintegration.dto;

public class ReservationRequest {

	private Long flightId;
	private String passengerFirstname;
	private String passengerLastName;
	private String passengerEmail;
	private String passengerPhone;
	private String nameOnTheCard;
	private String cardNumber;
	private String expirationDate;
	private String securiyCode;

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getPassengerFirstname() {
		return passengerFirstname;
	}

	public void setPassengerFirstname(String passengerFirstname) {
		this.passengerFirstname = passengerFirstname;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getSecuriyCode() {
		return securiyCode;
	}

	public void setSecuriyCode(String securiyCode) {
		this.securiyCode = securiyCode;
	}
}

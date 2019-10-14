package com.redfort.rhotel.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_reservationAgent")
public class ReservationAgent implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reservationAgentID")
	@Setter
	private Long id;

	@Column(name = "raFirstName")
	private String firstName;
	@Column(name = "raLastName")
	private String lastName;
	@Column(name = "raAddress")
	private String address;
	@Column(name = "raAddress2")
	private String addressTwo;
	@Column(name = "raCity")
	private String city;
	@Column(name = "raState")
	private String state;
	@Column(name = "raZipCode")
	private String zipCode;
	@Column(name = "raCounty")
	private String county;
	@Column(name = "raHomePhoneNumber")
	private String homePhoneNumber;
	@Column(name = "raCellularNumber")
	private String cellularNumber;
	@Column(name = "raGender")
	private String gender;
	@Column(name = "raEmailAddress")
	private String email;

}

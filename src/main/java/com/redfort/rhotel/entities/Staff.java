package com.redfort.rhotel.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

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
@Table(name = "tb_staff")
public class Staff implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sStaffID")
	private Long id;
	
	@NotBlank(message = "staff-1")
	@Column(name = "sFirstName")
	private String firstName;
	
	@NotBlank(message = "staff-2")
	@Column(name = "sLastName")
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name = "sPositionID")
	private Position position;
	
	@Column(name = "sAddress")
	private String address;
	@Column(name = "sAddress2")
	private String addressTwo;
	@Column(name = "sCity")
	private String city;
	@Column(name = "sState")
	private String state;
	@Column(name = "sZipCode")
	private String zipCode;
	@Column(name = "sCounty")
	private String county;
	@Column(name = "sHomePhoneNumber")
	private String homePhoneNumber;
	@Column(name = "sCellularNumber")
	private String cellularNumber;
	
	@Column(name = "sGender")
	private String gender;
	
	@Email(message = "staff-3")
	@Column(name = "sEmailAddress")
	private String email;

}

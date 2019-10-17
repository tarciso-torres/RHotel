package com.redfort.rhotel.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tb_guest")
public class Guest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gGuestID")
	private Long id;

	@NotBlank(message = "guest-1")
	@Column(name = "gFirstName")
	private String firstName;
	
	@NotBlank(message = "guest-2")
	@Column(name = "gLastName")
	private String lastName;
	
	@Column(name = "gAddress")
	private String address;
	@Column(name = "gAddress2")
	private String addressTwo;
	@Column(name = "gCity")
	private String city;
	@Column(name = "gState")
	private String state;
	@Column(name = "gZipCode")
	private String zipCode;
	@Column(name = "gCounty")
	private String county;
	@Column(name = "gHomePhoneNumber")
	private String homePhoneNumber;
	@Column(name = "gCellularNumber")
	private String cellularNumber;
	@Column(name = "gGender")
	private String gender;
	
	@NotBlank(message = "guest-3") @Email(message = "guest-4")
	@Column(name = "gEmailAddress")
	private String email;

}

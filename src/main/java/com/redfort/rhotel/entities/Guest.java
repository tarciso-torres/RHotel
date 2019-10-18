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
	@Column(name = "gguestiD")
	private Long id;

	@NotBlank(message = "guest-1")
	@Column(name = "gfirstname")
	private String firstName;
	
	@NotBlank(message = "guest-2")
	@Column(name = "glastname")
	private String lastName;
	
	@Column(name = "gaddress")
	private String address;
	
	@Column(name = "gaddress2")
	private String addressTwo;
	
	@Column(name = "gcity")
	private String city;
	@Column(name = "gstate")
	private String state;
	@Column(name = "gzipcode")
	private String zipCode;
	@Column(name = "gcounty")
	private String county;
	@Column(name = "ghomephonenumber")
	private String homePhoneNumber;
	@Column(name = "gcellularnumber")
	private String cellularNumber;
	@Column(name = "ggender")
	private String gender;
	
	@NotBlank(message = "guest-3") @Email(message = "guest-4") 
	@Column(name = "gemailaddress", unique = true)
	private String email;

}

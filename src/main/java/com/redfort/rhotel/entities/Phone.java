package com.redfort.rhotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.redfort.rhotel.entities.enums.TypePhone;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@EqualsAndHashCode(of = { "id" })
@ToString
@Entity
@Table(name = "tb_phone")
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_phone")
	@Getter @Setter private Long id;
	private Integer typePhone;
	@Getter @Setter private String number;
	
	@ManyToOne
	@JoinColumn(name = "id_guest")
	@Getter @Setter private Guest guest;

	public Phone(Long id, TypePhone typePhone, String number) {
		this.id = id;
		setTypePhone(typePhone);
		this.number = number;
	}

	public TypePhone getTypePhone() {
		return TypePhone.valueOf(typePhone);
	}

	public void setTypePhone(TypePhone typePhone) {
		if (typePhone != null) {
			this.typePhone = typePhone.getCode();
		}
	}
	
	

}

package com.redfort.rhotel.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_position")
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pPositionID")
	private Long id;
	
	@Column(name = "pPosition")
	@Setter private String position;
	@Column(name = "pSortOrder")
	@Setter private String sortOrder;
	@Column(name = "pActive")
	@Setter private Boolean active;
	
	@JsonIgnore
	@OneToMany(mappedBy = "position")
	private List<Staff> staffs = new ArrayList<>();

}

package com.employee.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
@Entity
@Table(name="roles")
@Getter
@Setter
@ToString(exclude="users")
@EqualsAndHashCode(of="roleId")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")
	private int roleId;
	@Column(name="role_name")
	private String roleName;
	@ManyToOne
	@JoinColumn(name="user_id_fk",nullable=false)
	@JsonBackReference
	private User users;
	
}


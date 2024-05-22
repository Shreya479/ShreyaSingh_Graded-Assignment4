package com.employee.model;

import java.util.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

@Entity
@Table(name="users")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Long id;
	
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy="users", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JsonManagedReference 
	private Set<Role> roles=new HashSet<>();
}


package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPT")
public class Department {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;

	    @Column(name="uname",unique = true, nullable = false)
	    private String userName;

	    @Column (nullable = false)
	    private String password;

	    @Column
	    private String firstName;

	    @Column
	    private String lastName;

	    @Column
	    private String dob;

}

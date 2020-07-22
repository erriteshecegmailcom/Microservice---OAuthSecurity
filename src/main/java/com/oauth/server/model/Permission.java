package com.oauth.server.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "permission"/*, schema="oauth"*/)
public class Permission implements Serializable {
	
	private static final long serialVersionUID = 7409158317741001873L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}


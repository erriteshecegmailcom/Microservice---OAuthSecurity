package com.oauth.server.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user"/*, schema="oauth"*/)
public class User implements Serializable {

	private static final long serialVersionUID = 8433669584243190874L;


	public User() {
    }

    public User(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.enabled = user.isEnabled();
        this.accountnonexpired = user.isAccountNonExpired();
        this.credentialsnonexpired = user.isCredentialsNonExpired();
        this.accountnonlocked = user.isAccountNonLocked();
        this.roles = user.getRoles();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "enabled")
    private boolean enabled;
    @Column(name = "accountnonexpired")
    private boolean accountnonexpired;
    @Column(name = "credentialsnonexpired")
    private boolean credentialsnonexpired;
    @Column(name = "accountnonlocked")
    private boolean accountnonlocked;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_user", joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id", referencedColumnName = "id")})
    private List<Role> roles;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isAccountNonExpired() {
		return accountnonexpired;
	}

	public void setAccountNonExpired(boolean accountnonexpired) {
		this.accountnonexpired = accountnonexpired;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsnonexpired;
	}

	public void setCredentialsNonExpired(boolean credentialsnonexpired) {
		this.credentialsnonexpired = credentialsnonexpired;
	}

	public boolean isAccountNonLocked() {
		return accountnonlocked;
	}

	public void setAccountNonLocked(boolean accountnonlocked) {
		this.accountnonlocked = accountnonlocked;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


    

}

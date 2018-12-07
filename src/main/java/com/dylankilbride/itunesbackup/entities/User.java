package com.dylankilbride.itunesbackup.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = AUTO)
	private int id;
	private String email;
	private String password;
	@OneToMany
	private Set<Playlist> playlists;

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public User() {}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Playlist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(Set<Playlist> playlists) {
		this.playlists = playlists;
	}
}


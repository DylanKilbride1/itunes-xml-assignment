package com.dylankilbride.itunesbackup.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Playlist {

	@Id
	@GeneratedValue(strategy = AUTO)
	private int playlistId;
	private String playlistName;
	@OneToMany
	private Set<Track> tracks;

	public Playlist() {}

	public int getPlaylistId() {
		return playlistId;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public Set<Track> getTracks() {
		return tracks;
	}

	public void setTracks(Set<Track> tracks) {
		this.tracks = tracks;
	}
}


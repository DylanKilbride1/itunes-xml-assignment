package com.dylankilbride.itunesbackup.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Track {

	@Id
	@GeneratedValue(strategy = AUTO)
	private int id;
	private String trackId;
	private String name;
	private String artist;
	private String album;
	private String genre;
	private String year;

	public Track() {}

	public Track(String trackId, String name, String artist, String album, String genre, String year) {
		this.trackId = trackId;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.genre = genre;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public String getTrackId() {
		return trackId;
	}

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getGenre() {
		return genre;
	}

	public String getYear() {
		return year;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
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
	private int trackId;
	private String name;
	private String artist;
	private String album;
	private String genre;
	private String year;
	private int totalTime;

	public Track() {}

	public int getId() {
		return id;
	}

	public int getTrackId() {
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

	public int getTotalTime() {
		return totalTime;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTrackId(int trackId) {
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

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}
}
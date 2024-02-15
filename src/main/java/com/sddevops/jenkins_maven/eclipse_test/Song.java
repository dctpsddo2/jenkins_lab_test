package com.sddevops.jenkins_maven.eclipse_test;

import java.util.Comparator;
import java.util.Objects;

public class Song {
	private String id;
	private String title;
	private String artiste;
	private double songLength;

	/**
	 * @param id
	 * @param title
	 * @param artiste
	 * @param songLength
	 */
	public Song(String id, String title, String artiste, double songLength) {
		super();
		this.id = id;
		this.title = title;
		this.artiste = artiste;
		this.songLength = songLength;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the artiste
	 */
	public String getArtiste() {
		return artiste;
	}

	/**
	 * @param artiste the artiste to set
	 */
	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	/**
	 * @return the songLength
	 */
	public double getSongLength() {
		return songLength;
	}

	/**
	 * @param songLength the songLength to set
	 */
	public void setSongLength(double songLength) {
		this.songLength = songLength;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artiste, id, songLength, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Song))
			return false;
		Song other = (Song) obj;
		return Objects.equals(artiste, other.artiste) && Objects.equals(id, other.id)
				&& Double.doubleToLongBits(songLength) == Double.doubleToLongBits(other.songLength)
				&& Objects.equals(title, other.title);
	}

	public static Comparator<Song> titleComparator = new Comparator<Song>() { 
		@Override
		public int compare(Song s1, Song s2) {
			return (s1.getTitle().compareTo(s2.getTitle()));
			//If the result is negative, it means that the title of s1 comes before the title of s2 in lexicographical order.
			//If the result is zero, it means that the titles of s1 and s2 are the same.
			//If the result is positive, it means that the title of s1 comes after the title of s2 in lexicographical order.
			
			//title 1 : All ABout You
			//title 2 : All ABout You
			//title 3 : here we go
			
			//compare title 1 with title 3 -> will return a negative value
			//title 1 : All ABout You
			//title 3 : here we go
			
			//comparing title 1 and 2 which is the same
			//title 1 : All ABout You
			//title 2 : All ABout You
			
		}
	};

	public static Comparator<Song> songLengthComparator = new Comparator<Song>() {
		@Override         
	    public int compare(Song s1, Song s2) {             
	      return (s2.getSongLength() < s1.getSongLength() ? -1 :   //-1 This indicates that s1 should come before s2 in the sorted order.                    
	              (s2.getSongLength() == s1.getSongLength() ? 0 : 1));  
	      			//zero -> This means that the order of s1 and s2 in the sorted result doesn't matter with respect to their song lengths.
	      			// 1 -> this indicates that s1 should come after s2 in the sorted orde
	    }     
	};
}

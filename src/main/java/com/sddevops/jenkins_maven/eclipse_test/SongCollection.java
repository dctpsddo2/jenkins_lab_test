package com.sddevops.jenkins_maven.eclipse_test;

import java.util.*;

public class SongCollection {

    private ArrayList<Song> songs = new ArrayList<>();
    private int capacity;

    public SongCollection() { 

        this.capacity = 20;
    }

    public SongCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
    	if(songs.size() != capacity) { //true or false condition
    		songs.add(song);
    	}
    }
    
    public ArrayList<Song> sortSongsByTitle() {         
        Collections.sort(songs, Song.titleComparator);         
        return songs;     
    } 
    
    public ArrayList<Song> sortSongsBySongLength() {         
        Collections.sort(songs, Song.songLengthComparator);         
        return songs;     
    } 
    
    public Song findSongsById(String id) {
    	for (Song s : songs) { 		      
            if(s.getId().equals(id)) return s;
       }
    	return null;
    }

    public Song findSongByTitle(String title) {
    	for (Song s : songs) { 		      
            if(s.getTitle().equals(title)) return s;
       }
    	return null;
    }
}

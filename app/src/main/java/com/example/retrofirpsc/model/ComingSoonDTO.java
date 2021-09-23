package com.example.retrofirpsc.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ComingSoonDTO implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("title")
	private String title;

	@SerializedName("year")
	private String year;

	@SerializedName("contentRating")
	private String contentRating;

	@SerializedName("duration")
	private String duration;

	@SerializedName("releaseDate")
	private String releaseDate;

	@SerializedName("averageRating")
	private int averageRating;

	@SerializedName("originalTitle")
	private String originalTitle;

	@SerializedName("storyline")
	private String storyline;

	@SerializedName("imdbRating")
	private String imdbRating;

	@SerializedName("posterurl")
	private String posterurl;

	@SerializedName("video_url")
	private String videoUrl;

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setYear(String year){
		this.year = year;
	}

	public String getYear(){
		return year;
	}

	public void setContentRating(String contentRating){
		this.contentRating = contentRating;
	}

	public String getContentRating(){
		return contentRating;
	}

	public void setDuration(String duration){
		this.duration = duration;
	}

	public String getDuration(){
		return duration;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setAverageRating(int averageRating){
		this.averageRating = averageRating;
	}

	public int getAverageRating(){
		return averageRating;
	}

	public void setOriginalTitle(String originalTitle){
		this.originalTitle = originalTitle;
	}

	public String getOriginalTitle(){
		return originalTitle;
	}

	public void setStoryline(String storyline){
		this.storyline = storyline;
	}

	public String getStoryline(){
		return storyline;
	}

	public void setImdbRating(String imdbRating){
		this.imdbRating = imdbRating;
	}

	public String getImdbRating(){
		return imdbRating;
	}

	public void setPosterurl(String posterurl){
		this.posterurl = posterurl;
	}

	public String getPosterurl(){
		return posterurl;
	}

	public void setVideoUrl(String videoUrl){
		this.videoUrl = videoUrl;
	}

	public String getVideoUrl(){
		return videoUrl;
	}

	@Override
 	public String toString(){
		return 
			"ComingSoonDTO{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",year = '" + year + '\'' + 
			",contentRating = '" + contentRating + '\'' + 
			",duration = '" + duration + '\'' + 
			",releaseDate = '" + releaseDate + '\'' + 
			",averageRating = '" + averageRating + '\'' + 
			",originalTitle = '" + originalTitle + '\'' + 
			",storyline = '" + storyline + '\'' + 
			",imdbRating = '" + imdbRating + '\'' + 
			",posterurl = '" + posterurl + '\'' + 
			",video_url = '" + videoUrl + '\'' + 
			"}";
		}
}
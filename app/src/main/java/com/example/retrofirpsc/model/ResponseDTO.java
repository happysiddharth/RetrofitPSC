package com.example.retrofirpsc.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseDTO implements Serializable {


	@SerializedName("coming_soon")
	private List<ComingSoonDTO> comingSoon;

	@SerializedName("now_showing")
	private List<NowShowingDTO> nowShowing;

	public void setComingSoon(List<ComingSoonDTO> comingSoon){
		this.comingSoon = comingSoon;
	}

	public List<ComingSoonDTO> getComingSoon(){
		return comingSoon;
	}

	public void setNowShowing(List<NowShowingDTO> nowShowing){
		this.nowShowing = nowShowing;
	}

	public List<NowShowingDTO> getNowShowing(){
		return nowShowing;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDTO{" + 
			"coming_soon = '" + comingSoon + '\'' + 
			",now_showing = '" + nowShowing + '\'' + 
			"}";
		}
}
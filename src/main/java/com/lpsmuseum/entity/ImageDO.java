package com.lpsmuseum.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.lpsmuseum.dto.MuseologicalObject;
import com.lpsmuseum.dto.object.Image;

@Entity
@DiscriminatorValue(value="ImageDO")
@SuppressWarnings("serial")
public class ImageDO extends MuseologicalObjectDO {
	@Column(name="urlAddress")
	String urlAddress;
	@Column(name="text")
	String description;

	public String getUrlAddress() {
		return urlAddress;
	}

	public void setUrlAddress(String urlAddress) {
		this.urlAddress = urlAddress;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	@Override
	public MuseologicalObject getDto() {
		Image image = new Image();
		image.setId(getId());
		image.setName(getName());
		Calendar c = Calendar.getInstance();
		c.setTime(getDate());
		image.setDate(c);
		image.setObjectType(getObjectType());
		image.setUrlAddress(getUrlAddress());
		image.setDescription(getDescription());
		return image;
	}
}
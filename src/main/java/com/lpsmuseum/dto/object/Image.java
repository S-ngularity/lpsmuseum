package com.lpsmuseum.dto.object;

import com.lpsmuseum.dto.MuseologicalObject;
import com.lpsmuseum.entity.ImageDO;
import com.lpsmuseum.entity.MuseologicalObjectDO;

public class Image extends MuseologicalObject {
	
	private String urlAddress;
	private String description;

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
	public MuseologicalObjectDO getEntity(){
		ImageDO objDO = new ImageDO();
		if(getId() != null) objDO.setId(getId());
		objDO.setName(getName());
		objDO.setDate(getDate().getTime());
		objDO.setObjectType(getObjectType());
		objDO.setUrlAddress(getUrlAddress());
		objDO.setDescription(getDescription());
		return objDO;
	}
}

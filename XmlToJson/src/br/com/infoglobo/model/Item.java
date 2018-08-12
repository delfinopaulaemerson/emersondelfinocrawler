package br.com.infoglobo.model;

import javax.xml.bind.annotation.XmlElement;


public class Item {
	
	
	String guid;

	
    String title;

	
    String description;
	
	
    String link;

	
    public String getGuid ()
    {
        return guid;
    }

    public void setGuid (String guid)
    {
        this.guid = guid;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [guid = "+guid+", title = "+title+", description = "+description+", link = "+link+"]";
    }

}

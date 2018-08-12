package br.com.infoglobo.model;

import javax.xml.bind.annotation.XmlElement;


public class Image{
	
	
	String title;

	
    String link;

	
    String url;

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [title = "+title+", link = "+link+", url = "+url+"]";
    }

}

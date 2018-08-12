package br.com.infoglobo.model;

public class Channel{

		
		String title;

		
	    String description;

	    String link;

		
	    Item[] item;
		
		
	    Image image;

		
	    String language;

		
	    String copyright;

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

	    public Item[] getItem ()
	    {
	        return item;
	    }

	    public void setItem (Item[] item)
	    {
	        this.item = item;
	    }

	    public Image getImage ()
	    {
	        return image;
	    }

	    public void setImage (Image image)
	    {
	        this.image = image;
	    }

	    public String getLanguage ()
	    {
	        return language;
	    }

	    public void setLanguage (String language)
	    {
	        this.language = language;
	    }

	    public String getCopyright ()
	    {
	        return copyright;
	    }

	    public void setCopyright (String copyright)
	    {
	        this.copyright = copyright;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [title = "+title+", description = "+description+", link = "+link+", item = "+item+", image = "+image+", language = "+language+", copyright = "+copyright+"]";
	    }

}

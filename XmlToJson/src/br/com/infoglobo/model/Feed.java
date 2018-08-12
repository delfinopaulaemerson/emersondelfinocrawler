package br.com.infoglobo.model;

public class Feed {
	
	
	private Rss rss;

	    public Rss getRss ()
	    {
	        return rss;
	    }

	    public void setRss (Rss rss)
	    {
	        this.rss = rss;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [rss = "+rss+"]";
	    }

}

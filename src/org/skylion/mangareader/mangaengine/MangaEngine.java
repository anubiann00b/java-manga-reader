package org.skylion.mangareader.mangaengine;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;


/**
 * An interface used for Manga Scrapers
 * @author Skylion
 *
 */
public abstract class MangaEngine implements Serializable {

	public abstract String getCurrentURL();
	public abstract void setCurrentURL(String url);
	public abstract BufferedImage loadImg(String url) throws IOException;
	public abstract BufferedImage getImage(String url) throws IOException;
	
	public abstract String getNextPage();
	public abstract String getPreviousPage();
	
	public abstract boolean isValidPage(String url);
	
	public abstract List<String> getMangaList();
	
	public abstract String getMangaName();
	
	public abstract String[] getChapterList();
	public abstract String[] getPageList();
	public abstract String[] getChapterNames();
	
	public abstract String getMangaURL(String mangaName);
	
	public abstract int getCurrentPageNum();
	public abstract int getCurrentChapNum();
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		
	}
	
	private void readObjectNoData() throws ObjectStreamException {
		
	}
}

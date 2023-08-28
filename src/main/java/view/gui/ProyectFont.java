package view.gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ProyectFont {
	
	/**
	 * Creates the font that it is used in all the project.
	 * @param fontsize The font size  
	 * @return The Roboto Condesed Bold font 
	 */
	public static Font createFont(String urlFont, float fontsize) {
		Font robotoCondesedBoldFont = null;
		try {
			InputStream inputStream = new BufferedInputStream(new FileInputStream(urlFont)); 
				
			robotoCondesedBoldFont = Font.createFont(Font.TRUETYPE_FONT, inputStream).deriveFont(fontsize);
			
		} catch (IOException |FontFormatException e ) {
			e.printStackTrace();
			
		}
		return robotoCondesedBoldFont;
	}
}

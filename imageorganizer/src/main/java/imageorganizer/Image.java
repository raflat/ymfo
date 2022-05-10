<<<<<<< HEAD
package imageorganizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Class that wraps a File type and provides methods to extract informations
 * relative to it's date of last modification.
 *  
 * @version 
 * 1.0.0
 * @author 
 * raflat
 */
final class Image {

	private final File file;
	private final String date;

	/**
	 * Constructor of the class.
	 * <p>Initialises the {@link Image} and extracts it's date.</p>
	 * 
	 * @param 
	 * source File type object to wrap.
	 */
	Image(File source) {
		this.file = source;
		
		String extractedDate = null;
		try {
			extractedDate = extractDate();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		date = extractedDate;
	}

	/**
	 * Getter that returns the file wrapped by the {@link Image} 
	 * it's called on.
	 * 
	 * @return 
	 * {@link File} associated to the {@link Image}.
	 */
	File getFile() {
		return file;
	}
	
	/**
	 * Method that extracts the year of the {@link Image}'s 
	 * date it's called on.
	 * 
	 * @return 
	 * String representing the number of the year of the
	 * {@link Image} it's called on.
	 * <p>The format of the returned string is "yyyy".</p>
	 */
	String extractYear() {
		return date.substring(0, 4);
	}
	
	/**
	 * Method that extracts the year of the {@link Image}'s 
	 * date it's called on.
	 * 
	 * @return
	 * String representing the number of the month of the {@link Image} 
	 * it's called on.
	 * <p>The format of the returned string is "mm".</p>
	 */
	String extractMonth() {
		return date.substring(5, 7);
	}
	
	/**
	 * Method that extracts the extension of the {@link Image}, 
	 * preceded by a dot.
	 * 
	 * @return
	 * String in the form "." + extension.
	 */
	String extractDotExtension() {
		String name = file.getName();
		
		return name.substring(name.indexOf("."));
	}

	private final String extractDate() throws IOException {
		if (!file.isFile())
			throw new IOException("Ensure that a file was given " + "and not a directory.");
		
		return Files.readAttributes(file.toPath(), BasicFileAttributes.class).lastModifiedTime().toString();
	}

=======
package imageorganizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Class that wraps a File type and provides methods to extract informations
 * relative to it's date of last modification.
 *  
 * @version 
 * 1.0.0
 * @author 
 * raflat
 */
final class Image {

	private final File file;
	private final String date;

	/**
	 * Constructor of the class.
	 * <p>Initialises the {@link Image} and extracts it's date.</p>
	 * 
	 * @param 
	 * source File type object to wrap.
	 */
	Image(File source) {
		this.file = source;
		
		String extractedDate = null;
		try {
			extractedDate = extractDate();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		date = extractedDate;
	}

	/**
	 * Getter that returns the file wrapped by the {@link Image} 
	 * it's called on.
	 * 
	 * @return 
	 * {@link File} associated to the {@link Image}.
	 */
	File getFile() {
		return file;
	}
	
	/**
	 * Method that extracts the year of the {@link Image}'s 
	 * date it's called on.
	 * 
	 * @return 
	 * String representing the number of the year of the
	 * {@link Image} it's called on.
	 * <p>The format of the returned string is "yyyy".</p>
	 */
	String extractYear() {
		return date.substring(0, 4);
	}
	
	/**
	 * Method that extracts the year of the {@link Image}'s 
	 * date it's called on.
	 * 
	 * @return
	 * String representing the number of the month of the {@link Image} 
	 * it's called on.
	 * <p>The format of the returned string is "mm".</p>
	 */
	String extractMonth() {
		return date.substring(5, 7);
	}
	
	/**
	 * Method that extracts the extension of the {@link Image}, 
	 * preceded by a dot.
	 * 
	 * @return
	 * String in the form "." + extension.
	 */
	String extractDotExtension() {
		String name = file.getName();
		
		return name.substring(name.indexOf("."));
	}

	private final String extractDate() throws IOException {
		if (!file.isFile())
			throw new IOException("Ensure that a file was given " + "and not a directory.");
		
		return Files.readAttributes(file.toPath(), BasicFileAttributes.class).lastModifiedTime().toString();
	}

>>>>>>> 26ef2a4 (Project added)
}
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Class Book
 */
public class Book {

	//
	// Fields
	//

	private String name;
	private int iSBN;
	private String localImagePath = null;
	private String onlineImagePath;
	private String localFilePath = null;
	private String onlineFilePath;
	private Date releaseDate;
	private String author;
	private Format format;
	private Protection protection;
	private boolean isDownloaded = false;

	//
	// Constructors
	//
	public Book(int iSBN) {
		this.name = WebAPIIO.instance.getBookName(iSBN);
		this.iSBN = iSBN;
		this.onlineImagePath = WebAPIIO.instance.getBookImagePath(iSBN);
		this.releaseDate = WebAPIIO.instance.getBookReleaseDate(iSBN);
		this.author = WebAPIIO.instance.getAuthorName(iSBN);
		this.format = WebAPIIO.instance.getFormat(iSBN);
		this.protection = WebAPIIO.instance.getProtection(iSBN);
		this.onlineFilePath = WebAPIIO.instance.getOnlineFilePath(iSBN);
	};

	/**
	 * This downloads the cover image for the book, and saves it in /temp/ folder if isTemporary is true, and in /covers/ if it is not. 
	 * @param isTemporary
	 */
	public void downloadImage(boolean isTemporary) {
		URL url = new URL(onlineImagePath);
		InputStream is = url.openStream();
		if (isTemporary) {
			this.localImagePath = "/temp/" + this.iSBN + ".jpg";
		} else {
			this.localImagePath = "/covers/" + this.iSBN + ".jpg";
		}
		OutputStream os = new FileOutputStream(this.localImagePath);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}
		is.close();
		os.close();
	}

	/**
	 * @return String
	 */
	public String getLocalImagePath() {
		return this.localImagePath;
	}

	/**
	 * @return String
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return int
	 */
	public int getISBN() {
		return this.iSBN;
	}

	/**
	 * @return Date
	 */
	public Date getReleaseDate() {
		return this.releaseDate;
	}

	/**
	 * @return String
	 */
	public String getAuthor() {
		return this.author;
	}

	/**
	 * @return Format
	 */
	public Format getFormat() {
		return this.format;
	}

	/**
	 * @return Protection
	 */
	public Protection getProtection() {
		return this.protection;
	}

	/**
	 * @param url
	 */
	public void downloadBook() {
		URL url = new URL(onlineFilePath);
		InputStream is = url.openStream();
		this.localFilePath = "/books/" + this.format.toString() + this.iSBN
									   + "." + this.format.getExtension();
		OutputStream os = new FileOutputStream(this.localImagePath);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}
		is.close();
		os.close();
	}

	/**
	 * @return String
	 */
	public String getLocalFilePath() {
		return this.localFilePath;
	}

}
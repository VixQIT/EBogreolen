package com.example.ebogreolen;

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

    private final String name;
    private final int iSBN;
    private String localImagePath = null;
    private final String onlineImagePath;
    private String localFilePath = null;
    private final String onlineFilePath;
    private final Date releaseDate;
    private final String author;
    private final Format format;
    // private Protection protection;
    public boolean isDownloaded = false;

    //
    // Constructors
    //
    public Book(final int iSBN) {
        this.name = WebAPIIO.instance.getBookName(iSBN);
        this.iSBN = iSBN;
        this.onlineImagePath = WebAPIIO.instance.getBookImagePath(iSBN);
        this.releaseDate = WebAPIIO.instance.getBookReleaseDate(iSBN);
        this.author = WebAPIIO.instance.getAuthorName(iSBN);
        this.format = WebAPIIO.instance.getFormat(iSBN);
        // this.protection = WebAPIIO.instance.getProtection(iSBN);
        this.onlineFilePath = WebAPIIO.instance.getOnlineFilePath(iSBN);
    };

    /**
     * This downloads the cover image for the book, and saves it in /temp/
     * folder if isTemporary is true, and in /covers/ if it is not.
     * 
     * @param isTemporary
     * @throws IOException
     */
    public void downloadImage(final boolean isTemporary) throws IOException {
        final URL url = new URL(this.onlineImagePath);
        InputStream is;
        is = url.openStream();

        if (isTemporary) {
            this.localImagePath = "/temp/" + this.iSBN + ".jpg";
        } else {
            this.localImagePath = "/covers/" + this.iSBN + ".jpg";
        }
        final OutputStream os = new FileOutputStream(this.localImagePath);

        final byte[] b = new byte[2048];
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
     * @return Protection public Protection getProtection() { return
     *         this.protection; }
     */

    /**
     * @param url
     * @throws IOException
     */
    public void downloadBook() throws IOException {
        final URL url = new URL(this.onlineFilePath);
        final InputStream is = url.openStream();
        this.localFilePath = "/books/" + this.format.toString() + this.iSBN
                + "." + this.format.getExtension();
        OutputStream os = null;
        try {
            os = new FileOutputStream(this.localImagePath);
        } catch (final Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        final byte[] b = new byte[2048];
        int length;

        try {
            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }
        } catch (final Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            is.close();
        } catch (final Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            os.close();
        } catch (final Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @return String
     */
    public String getLocalFilePath() {
        return this.localFilePath;
    }

}
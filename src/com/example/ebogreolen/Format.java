package com.example.ebogreolen;

public enum Format {
    FORMAT_EPUB("EPUB"), FORMAT_PDF("PDF");

    private Format(final String format) {
        this.format = format;
    }

    private final String format;

    @Override
    public String toString() {
        return this.format;
    }

    public String type(final Format format) {
        switch (format) {
        case FORMAT_EPUB:
        case FORMAT_PDF:
            return "Ebook";
        default:
            return null;
        }
    }

    public String getExtension() {
        return this.format;
    }
}
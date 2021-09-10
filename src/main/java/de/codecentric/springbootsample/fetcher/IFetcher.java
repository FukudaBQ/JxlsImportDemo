package de.codecentric.springbootsample.fetcher;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.xml.sax.SAXException;

import java.io.IOException;

public interface IFetcher {
    public boolean fetchExcel() throws IOException, SAXException, InvalidFormatException;
}

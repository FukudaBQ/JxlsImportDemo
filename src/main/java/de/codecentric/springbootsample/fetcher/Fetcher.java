package de.codecentric.springbootsample.fetcher;

import de.codecentric.springbootsample.Dao.App;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jxls.reader.ReaderBuilder;
import org.jxls.reader.XLSReadStatus;
import org.jxls.reader.XLSReader;
import org.xml.sax.SAXException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Fetcher implements IFetcher{
    @Override
    public boolean fetchExcel() throws IOException, SAXException, InvalidFormatException {
        File file;
        InputStream inputXML = new FileInputStream("D:\\project\\JXLS Import\\springboot-sample-app-master\\JxlsImportDemo\\src\\main\\resources\\templates\\inputConfig.xml");
        XLSReader reader = ReaderBuilder.buildFromXML(inputXML);
        InputStream inputXLS = new FileInputStream("D:\\project\\JXLS Import\\springboot-sample-app-master\\JxlsImportDemo\\src\\main\\resources\\xlsFiles");
        App app = new App();
        Map beans = new HashMap<>();
        beans.put("app", app);
        XLSReadStatus readStatus = reader.read(inputXLS, beans);
        return false;
    }
}

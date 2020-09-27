package daich.com.reader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {

    public static final String XLSX_FILE_PATH = "./outfile/sample-xlsx-file.xlsx";

    public static void create() {
        Workbook workbook = null;
        try {
            // Creating a Workbook from an Excel file (.xls or .xlsx)
            workbook = WorkbookFactory.create(new File(XLSX_FILE_PATH));
        } catch (IOException ex) {
            // } catch (IOException | InvalidFormatException ex) {
            throw new RuntimeException(ex);
        }

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

    }

}

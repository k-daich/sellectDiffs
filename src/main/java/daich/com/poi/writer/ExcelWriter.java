package daich.com.poi.writer;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.util.Date;

public class ExcelWriter {

    private final String SHEET_NAME;

    // HSSF
    private final HSSFWorkbook book = new HSSFWorkbook();

    private final HSSFSheet sheet;

    /**
     * Constructor
     * 
     * @param tableName
     */
    public ExcelWriter(String tableName) {
        // set sheet name
        SHEET_NAME = tableName;
        // create sheet
        sheet = book.createSheet(SHEET_NAME);
    }

    public static final String XLSX_FILE_PATH = "./outfile/sample-xlsx-file" + new Date() + ".xlsx";

}

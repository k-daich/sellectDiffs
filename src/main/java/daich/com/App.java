package daich.com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import daich.com.procedure.SellectDiffProcedure;
import daich.com.db.dao.TSentenceDao;
import daich.com.reader.ExcelReader;
import daich.com.common.util.StringUtil;

/**
 * アプリ起点クラス
 */
public class App {

    // Logger
    private static final Logger LOG = LogManager.getLogger();

    static class Arguments {
        String sentenceId;

        Arguments(final String sentenceId) {
            this.sentenceId = sentenceId;
        }

        String getSentenceId() {
            return this.sentenceId;
        }
    }

    /**
     * start point
     * 
     * @param args arg0 : sentenceId
     */
    public static void main(final String[] args) {

        LOG.info("### Start App ###");
        System.out.println("!!! Start App !!!");

        // check args
        assertArgs(args);

        final Arguments arguments = new Arguments(args[0]);

        ExcelReader.create();
        new SellectDiffProcedure().execute(arguments.getSentenceId());

        System.out.println("!!! Fin App !!!");
        LOG.info("### End App ###");
    }

    /**
     * assert args
     */
    private static void assertArgs(final String[] args) {
        if (args == null || args.length != 1) {
            LOG.info("Error @ assertArgs()");
            new RuntimeException("Invalid args length");
        }

        // 第1引数の空チェック
        if (StringUtil.isEmpty(args[0])) {
            LOG.info("Error @ assertArgs()");
            new RuntimeException("args0 is empty");
        }
    }
}

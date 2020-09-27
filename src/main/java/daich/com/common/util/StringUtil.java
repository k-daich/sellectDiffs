package daich.com.common.util;

public class StringUtil {

    /**
     * Invalid Constructor
     */
    private StringUtil() {
    }

    /**
     * isEmpty
     * @param subject
     * @return isEmpty
     */
    public static boolean isEmpty(String subject) {
        return subject == null || subject.equals("");
    }

}

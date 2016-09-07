package design_pattern.bridge;

/**
 * Created by songheng on 9/7/16.
 */
public class Client {
    public static void main(String[] args) {
        DataConverter converter = new PDFConverter();
        DBLoader loader = new PGLoader();
        converter.setLoader(loader);
        converter.convert();
    }
}

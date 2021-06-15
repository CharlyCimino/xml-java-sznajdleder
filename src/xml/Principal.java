package xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        try {
            // obtenemos el parser
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser sp = spf.newSAXParser();
            // parseamos el archivo connectionpool.xml
            sp.parse("connectionpool.xml", new CPoolXMLHandler());
            /* El handler debe ser una instancia de alguna clase que herede de:
            org.xml.sax.helpers.DefaultHandler */
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}

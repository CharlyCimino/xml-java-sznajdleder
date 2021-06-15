package xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */

/*
    Heredará dos métodos: startElement y endElement
    Estos métodos se invocarán automáticamente cada vez que el parser encuentre un tag
    que se abre o un tag que se cierra
 */
public class CPoolXMLHandler extends DefaultHandler {

    public CPoolXMLHandler() {
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        // muestro el nombre del tag
        System.out.println("Comienza tag: " + qName);
        // recorro la lista de atributos del tag
        for (int i = 0; i < attributes.getLength(); i++) {
            // muestro cada atributo del tag (atributo = valor)
            System.out.print(" " + attributes.getQName(i) + " = ");
            System.out.println(attributes.getValue(i));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("Cierra: " + qName);
    }

}

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

class Parser {

    String[] countryList, rateList;
    String currencies, rates;

    //DOM Parser:
    public void parse() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        {
            try {
                builder = factory.newDocumentBuilder();
                Document doc = builder.parse("eurofxref-daily.xml");
                NodeList cubeList = doc.getElementsByTagName("Cube");

                countryList = new String[cubeList.getLength()-2];
                rateList = new String[cubeList.getLength()-2];

                for (int i = 2; i < cubeList.getLength(); i++) {
                    Node cl = cubeList.item(i);
                    if (cl.getNodeType() == Node.ELEMENT_NODE) {
                        Element cube = (Element) cl;

                        currencies =cube.getAttribute("currency");
                        rates =cube.getAttribute("rate");

                        countryList[i-2] = currencies;
                        rateList[i-2] = rates;
                    }
                }

            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            }
        }
    }
}

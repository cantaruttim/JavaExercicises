package StrategyReport.Reports;

import StrategyReport.Interface.ReportGenerator;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLReport implements ReportGenerator {

    @Override
    public void generateReport(String fileName) {

        try {
            // Lê o arquivo XML
            File file = new File(fileName);

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList list = doc.getDocumentElement().getChildNodes();

            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;
                    System.out.println("Element: " + element.getNodeName());

                    // imprime atributos (se existirem)
                    NamedNodeMap attributes = element.getAttributes();
                    for (int j = 0; j < attributes.getLength(); j++) {
                        Node attr = attributes.item(j);
                        System.out.println("   Attribute: " + attr.getNodeName() + " = " + attr.getNodeValue());
                    }

                    // imprime elementos internos
                    NodeList children = element.getChildNodes();
                    for (int k = 0; k < children.getLength(); k++) {
                        Node child = children.item(k);

                        if (child.getNodeType() == Node.ELEMENT_NODE) {
                            System.out.println("   " + child.getNodeName() + ": " + child.getTextContent());
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

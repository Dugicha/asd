import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlUtil {
    public static void createXML() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document document = documentBuilder.newDocument();

        Element departmentsElement = document.createElement("departments");
        document.appendChild(departmentsElement);

        Element departmentElement = document.createElement("department");
        departmentsElement.appendChild(departmentElement);
        Element departmentElement2 = document.createElement("department");
        departmentsElement.appendChild(departmentElement2);

        Element nameElement = document.createElement("name");
        nameElement.appendChild(document.createTextNode("HR"));
        departmentElement.appendChild(nameElement);
        Element firstName = document.createElement("firstname");
        firstName.appendChild(document.createTextNode("IT"));
        departmentElement2.appendChild(firstName);

        Element emailElement = document.createElement("email");
        emailElement.appendChild(document.createTextNode("hr@oracle.com"));
        departmentElement.appendChild(emailElement);
        Element emailElement2 = document.createElement("email");
        emailElement2.appendChild(document.createTextNode("it@java.com"));
        departmentElement2.appendChild(emailElement2);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);

        StreamResult streamResult = new StreamResult(new File("gio.xml"));
        transformer.transform(domSource, streamResult);
    }
}

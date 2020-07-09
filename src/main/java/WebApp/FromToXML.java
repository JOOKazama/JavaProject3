package WebApp;
import Tables.UserXML;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class FromToXML
{
    public UserXML FromXML(String file) throws JAXBException
    {
        JAXBContext context=JAXBContext.newInstance(UserXML.class);
        Unmarshaller unmarshaller=context.createUnmarshaller();
        return (UserXML)unmarshaller.unmarshal(new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(file))));
    }

    public void ToXML(String file, UserXML list) throws JAXBException
    {
        JAXBContext context=JAXBContext.newInstance(UserXML.class);
        Marshaller marshaller=context.createMarshaller();
        marshaller.marshal(list, new File(file));
    }
}

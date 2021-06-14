import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        List<String> phoneNumber = new ArrayList<>();
        phoneNumber.add("+37494657895");
        phoneNumber.add("+37455711175");

        Person person = new Person("Aghasi", "Khachatryan", phoneNumber, new Car("Hyundai", "White"));
        String xml="";
        XmlMapper mapper = new XmlMapper();
        try {
            xml = mapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(xml);

        Person person1 = null;
        String xml1 = xml;

        try {
            person1 = mapper.readValue(xml1, Person.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println("Deserialize XML");
        System.out.println(person1);
    }
}

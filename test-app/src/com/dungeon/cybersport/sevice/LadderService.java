package com.dungeon.cybersport.sevice;

import com.dungeon.cybersport.model.Ladder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class LadderService {
    public Ladder fromXmlToObject(String filePath) {
        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(Ladder.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Ladder) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    // сохраняем объект в XML файл
    public void convertObjectToXml(Ladder ladder, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Ladder.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // маршаллинг объекта в файл
            marshaller.marshal(ladder, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

package by.teachmeskills.lessen11.task4;

import java.io.*;

public class Serializator {
    public boolean serialization(Auto auto) {
        boolean flag = false;
        File file = new File(".\\src\\by\\teachmeskills\\lessen11\\task4\\object.data");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(auto);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public Auto deserialization() throws InvalidObjectException {
        File file = new File(".\\src\\by\\teachmeskills\\lessen11\\task4\\object.data");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                Auto auto = (Auto) ois.readObject();
                return auto;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        throw new InvalidObjectException("Objekt fail");        //ошибка будет обработана в main.
    }
}

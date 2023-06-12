import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main implements Serializable{
    public static void main(String[] args) {
        Student mahesh = new Student("1", "Mahesh", "Hyderabad");

        try {

            System.out.println("object to be serialized and de-serialized:\n"+mahesh);

            System.out.println("\n-----------Serializing the object-----------");
            /**
             * will create generated_byte_stream.txt file
             * then object is written into that file by converting obj into byte stream (SERIALiZE)
             * */
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("generated_byte_stream.txt"));
            out.writeObject(mahesh);
            out.flush();
            out.close();

            System.out.println("serialized");

            
            System.out.println("\n-----------De-Serializing the object-----------");
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("generated_byte_stream.txt"));
            Student convertedObject = (Student) in.readObject();
            
            System.out.println("de-serialized");
            System.out.println("\nconverted object : " + convertedObject);

        } catch (Exception e) {
            
        }

    }
}
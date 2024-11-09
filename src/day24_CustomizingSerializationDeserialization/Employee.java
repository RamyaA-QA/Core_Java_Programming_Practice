package day24_CustomizingSerializationDeserialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//If you need custom behavior during serialization or deserialization (e.g., for security purposes or transforming fields)
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    transient String password;  // Transient field won't be serialized

    public Employee(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream out) throws IOException { 
        // Custom serialization logic
        out.defaultWriteObject();  // Write the default fields
        out.writeObject("ENCRYPTED_" + password);  // Encrypting password before serializing
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        // Custom deserialization logic
        in.defaultReadObject();  // Read the default fields
        String encryptedPassword = (String) in.readObject();
        this.password = encryptedPassword.replace("ENCRYPTED_", "");  // Decrypting password after deserialization
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', password='" + password + "'}";
    }
    
    }
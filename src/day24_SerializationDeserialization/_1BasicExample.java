package day24_SerializationDeserialization;

import java.io.Serializable;

/*
 * Serialization is the process of converting an object into a byte stream so that it can be easily saved to a file or transmitted over a network. 
 * Deserialization is the reverse process where the byte stream is converted back into an actual Java object. 
 * Serialization is essential when you want to persist an object’s state or send an object across a network.

In Java, serialization is done using the Serializable interface and the ObjectOutputStream/ObjectInputStream classes.
 */

/*
 * Key Points:
To serialize an object, the class must implement the Serializable interface.
Serializable is a marker interface (it has no methods to implement).
Transient fields are not serialized.
The serialVersionUID is used to ensure compatibility during deserialization (versioning).
 */
public class _1BasicExample implements Serializable { // The class must implement the Serializable interface for its objects to be serialized.
	
	    private static final long serialVersionUID = 1L;  // Optional but recommended
	    int id;
	    String name;
	    transient String password;  // Transient field won't be serialized

	    public _1BasicExample(int id, String name, String password) {
	        this.id = id;
	        this.name = name;
	        this.password = password;
	    }

	    // toString method to display object info
	    @Override
	    public String toString() {
	        return "Employee{id=" + id + ", name='" + name + "', password='" + password + "'}";
	    }
	}

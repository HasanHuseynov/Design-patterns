package exampleTwo;

import java.security.cert.CertificateParsingException;

public class Main {
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        object.print();
    }
}

package uk.ac.cam.cl.cleancyclerouting;

public class NotSetUpException extends Exception {
    NotSetUpException(){

    }
    NotSetUpException(Exception e) {
        super(e);
    }
}
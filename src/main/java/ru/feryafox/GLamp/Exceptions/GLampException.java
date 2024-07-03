package ru.feryafox.GLamp.Exceptions;

public class GLampException extends RuntimeException{
    public GLampException(String s){
        super(s);
    }

    public GLampException(){
        super();
    }
}

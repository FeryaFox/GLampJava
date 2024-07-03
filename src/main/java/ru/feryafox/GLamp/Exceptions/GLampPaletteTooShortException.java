package ru.feryafox.GLamp.Exceptions;

public class GLampPaletteTooShortException extends GLampException{
    public GLampPaletteTooShortException(){
        super("Длина палитры, не может быть меньше 2");
    }
}

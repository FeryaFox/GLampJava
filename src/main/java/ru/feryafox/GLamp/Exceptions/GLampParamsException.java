package ru.feryafox.GLamp.Exceptions;

public class GLampParamsException extends GLampException{
    public GLampParamsException(String methodName, String paramsText){
        super("Ошибка параметров метода " + methodName + ": " + paramsText);
    }
}

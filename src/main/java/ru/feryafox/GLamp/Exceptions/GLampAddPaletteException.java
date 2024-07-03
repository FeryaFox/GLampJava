package ru.feryafox.GLamp.Exceptions;

public class GLampAddPaletteException extends GLampException{
    public GLampAddPaletteException(){
        super("Ошибка при добавления в палитру. Максимальная длина палитры 16");
    }
}

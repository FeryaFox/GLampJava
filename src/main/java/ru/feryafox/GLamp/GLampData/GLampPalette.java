package ru.feryafox.GLamp.GLampData;

import ru.feryafox.GLamp.Exceptions.GLampAddPaletteException;
import ru.feryafox.GLamp.Exceptions.GLampPaletteTooShortException;
import ru.feryafox.GLamp.Exceptions.GLampParamsException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GLampPalette implements Iterable<GLampBand>{
    private ArrayList<GLampBand> GLampBands = new ArrayList<>();

    public void addBand(GLampBand GLampBand) {
        if (Integer.parseInt(GLampBand.R()) < 0 || Integer.parseInt(GLampBand.R()) > 255) throw new GLampParamsException("addBand", "Параметр R должен быть от 0 до 255");
        if (Integer.parseInt(GLampBand.G()) < 0 || Integer.parseInt(GLampBand.G()) > 255) throw new GLampParamsException("addBand", "Параметр G должен быть от 0 до 255");
        if (Integer.parseInt(GLampBand.B()) < 0 || Integer.parseInt(GLampBand.B()) > 255) throw new GLampParamsException("addBand", "Параметр B должен быть от 0 до 255");

        if (GLampBands.size() > 16) throw new GLampAddPaletteException();

        GLampBands.add(GLampBand);
    }

    public void addBand(String R, String G, String B) {
        if (Integer.parseInt(R) < 0 || Integer.parseInt(R) > 255) throw new GLampParamsException("addBand", "Параметр R должен быть от 0 до 255");
        if (Integer.parseInt(G) < 0 || Integer.parseInt(G) > 255) throw new GLampParamsException("addBand", "Параметр G должен быть от 0 до 255");
        if (Integer.parseInt(B) < 0 || Integer.parseInt(B) > 255) throw new GLampParamsException("addBand", "Параметр B должен быть от 0 до 255");

        if (GLampBands.size() > 16) throw new GLampAddPaletteException();

        GLampBands.add(new GLampBand(R, G, B));
    }

    public void addBand(Integer R, Integer G, Integer B) {
        addBand(R.toString(), G.toString(), B.toString());
    }

    public ArrayList<GLampBand> getPalette() {
        return (ArrayList<GLampBand>) GLampBands.clone();
    }

    public Integer getPaletteSize(){
        return GLampBands.size();
    }

    public void setBand(Integer index, String R, String G, String B) {
        if (Integer.parseInt(R) < 0 || Integer.parseInt(R) > 255) throw new GLampParamsException("addBand", "Параметр R должен быть от 0 до 255");
        if (Integer.parseInt(G) < 0 || Integer.parseInt(G) > 255) throw new GLampParamsException("addBand", "Параметр G должен быть от 0 до 255");
        if (Integer.parseInt(B) < 0 || Integer.parseInt(B) > 255) throw new GLampParamsException("addBand", "Параметр B должен быть от 0 до 255");

        GLampBands.set(index, new GLampBand(R, G, B));
    }

    public void setBand(Integer index, Integer R, Integer G, Integer B) {
        setBand(index, R.toString(), G.toString(), B.toString());
    }

    public void setBand(Integer index, GLampBand GLampBand) {
        if (Integer.parseInt(GLampBand.R()) < 0 || Integer.parseInt(GLampBand.R()) > 255) throw new GLampParamsException("addBand", "Параметр R должен быть от 0 до 255");
        if (Integer.parseInt(GLampBand.G()) < 0 || Integer.parseInt(GLampBand.G()) > 255) throw new GLampParamsException("addBand", "Параметр G должен быть от 0 до 255");
        if (Integer.parseInt(GLampBand.B()) < 0 || Integer.parseInt(GLampBand.B()) > 255) throw new GLampParamsException("addBand", "Параметр B должен быть от 0 до 255");

        GLampBands.set(index, GLampBand);
    }

    public void deleteBand(int index){
        GLampBands.remove(index);
    }

    @Override
    public String toString() {
        if (GLampBands.size() > 1) throw new GLampPaletteTooShortException();

        StringBuilder sb = new StringBuilder();
        sb.append(GLampBands.size());
        for (GLampBand GLampBand : GLampBands) {
            sb.append(",");
            sb.append(GLampBand.toString());
        }

        return sb.toString();
    }

    public static GLampPalette buildFromResponse(String response) {
        String[] r = response.split(",");
        GLampPalette palette = new GLampPalette();

        int bandsCount = Integer.parseInt(r[2]);

        for (int i = 0; i < bandsCount; i++) {
            int offset = 3 * i + 3;

            palette.addBand(r[offset], r[offset + 1], r[offset + 2]);
        }

        return palette;
    }

    @Override
    public Iterator<GLampBand> iterator() {
        return new GLampBandIterator();
    }

    private class GLampBandIterator implements Iterator<GLampBand> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < GLampBands.size();
        }

        @Override
        public GLampBand next() {
            if (hasNext()) {
                return GLampBands.get(currentIndex++);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {

        }
    }
}



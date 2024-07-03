package ru.feryafox.GLamp.GLampData;

import ru.feryafox.GLamp.Exceptions.GLampAddPaletteException;
import ru.feryafox.GLamp.Exceptions.GLampPaletteTooShortException;
import ru.feryafox.GLamp.Exceptions.GLampParamsException;

import java.util.ArrayList;

public class GLampPalette {
    private ArrayList<Band> bands = new ArrayList<>();

    public record Band(String R, String G, String B) {
        @Override
        public String toString() {
            return R + "," + G + "," + B;
        }
    }

    public void addBand(Band band) {
        if (Integer.parseInt(band.R()) < 0 || Integer.parseInt(band.R()) > 255) throw new GLampParamsException("addBand", "Параметр R должен быть от 0 до 255");
        if (Integer.parseInt(band.G()) < 0 || Integer.parseInt(band.G()) > 255) throw new GLampParamsException("addBand", "Параметр G должен быть от 0 до 255");
        if (Integer.parseInt(band.B()) < 0 || Integer.parseInt(band.B()) > 255) throw new GLampParamsException("addBand", "Параметр B должен быть от 0 до 255");

        if (bands.size() > 16) throw new GLampAddPaletteException();

        bands.add(band);
    }

    public void addBand(String R, String G, String B) {
        if (Integer.parseInt(R) < 0 || Integer.parseInt(R) > 255) throw new GLampParamsException("addBand", "Параметр R должен быть от 0 до 255");
        if (Integer.parseInt(G) < 0 || Integer.parseInt(G) > 255) throw new GLampParamsException("addBand", "Параметр G должен быть от 0 до 255");
        if (Integer.parseInt(B) < 0 || Integer.parseInt(B) > 255) throw new GLampParamsException("addBand", "Параметр B должен быть от 0 до 255");

        if (bands.size() > 16) throw new GLampAddPaletteException();

        bands.add(new Band(R, G, B));
    }

    public void addBand(Integer R, Integer G, Integer B) {
        addBand(R.toString(), G.toString(), B.toString());
    }

    public ArrayList<Band> getPalette() {
        return (ArrayList<Band>) bands.clone();
    }

    public Integer getPaletteSize(){
        return bands.size();
    }

    public void setBand(Integer index, String R, String G, String B) {
        if (Integer.parseInt(R) < 0 || Integer.parseInt(R) > 255) throw new GLampParamsException("addBand", "Параметр R должен быть от 0 до 255");
        if (Integer.parseInt(G) < 0 || Integer.parseInt(G) > 255) throw new GLampParamsException("addBand", "Параметр G должен быть от 0 до 255");
        if (Integer.parseInt(B) < 0 || Integer.parseInt(B) > 255) throw new GLampParamsException("addBand", "Параметр B должен быть от 0 до 255");

        bands.set(index, new Band(R, G, B));
    }

    public void setBand(Integer index, Integer R, Integer G, Integer B) {
        setBand(index, R.toString(), G.toString(), B.toString());
    }

    public void setBand(Integer index, Band band) {
        if (Integer.parseInt(band.R()) < 0 || Integer.parseInt(band.R()) > 255) throw new GLampParamsException("addBand", "Параметр R должен быть от 0 до 255");
        if (Integer.parseInt(band.G()) < 0 || Integer.parseInt(band.G()) > 255) throw new GLampParamsException("addBand", "Параметр G должен быть от 0 до 255");
        if (Integer.parseInt(band.B()) < 0 || Integer.parseInt(band.B()) > 255) throw new GLampParamsException("addBand", "Параметр B должен быть от 0 до 255");

        bands.set(index, band);
    }

    public void deleteBand(int index){
        bands.remove(index);
    }

    @Override
    public String toString() {
        if (bands.size() > 1) throw new GLampPaletteTooShortException();

        StringBuilder sb = new StringBuilder();
        sb.append(bands.size());
        for (Band Band : bands) {
            sb.append(",");
            sb.append(Band.toString());
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
}



package ru.feryafox.GLamp.GLampData;

public record GLampBand(String R, String G, String B) {
    @Override
    public String toString() {
        return R + "," + G + "," + B;
    }
}

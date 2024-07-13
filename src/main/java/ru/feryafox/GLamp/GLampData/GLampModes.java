package ru.feryafox.GLamp.GLampData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GLampModes implements Iterable<GLampMode> {
    private ArrayList<GLampMode> modes;
    private int currentMode = 1;

    public GLampModes() {
        modes = new ArrayList<>();
    }

    GLampModes(ArrayList<GLampMode> modes, int currentMode) {
        this.modes = modes;
        this.currentMode = currentMode;
    }

    public void addMode(GLampMode mode) {
        modes.add(mode);
    }

    public ArrayList<GLampMode> getModes() {
        return modes;
    }

    public void setModes(int index, GLampMode mode) {
        modes.set(index, mode);
    }

    public int getModesCount(){
        return modes.size();
    }

    public void deleteMode(int index) {
        modes.remove(index);
    }

    public void setCurrentMode(int currentMode) {
        this.currentMode = currentMode;
    }

    public void setCurrentMode(String currentMode) {
        this.currentMode = Integer.parseInt(currentMode);
    }

    public int getCurrentMode() {
        return currentMode;
    }

    public GLampMode getMode(int index) {
        return modes.get(index);
    }

    public static GLampModes buildFromResponse(String response) {
        String[] r = response.split(",");
        GLampModes modes = new GLampModes();
        modes.setCurrentMode(r[2]);

        int modes_count = Integer.parseInt(r[3]);

        for (int i = 0; i < modes_count; i++) {
            int offset = 13 * i + 8;

            GLampMode.Builder mb = new GLampMode.Builder();

            mb.setEffectType(r[offset]);
            mb.setFlagPersonalBrightness(r[offset + 1]);
            mb.setPersonalBrightness(r[offset + 2]);
            mb.setAdditional(r[offset + 3]);
            mb.setSoundReaction(r[offset + 4]);
            mb.setMinSignal(r[offset + 5]);
            mb.setMaxSignal(r[offset + 6]);
            mb.setSpeed(r[offset + 7]);
            mb.setPalette(r[offset + 8]);
            mb.setScale(r[offset + 9]);
            mb.setFromCenter(r[offset + 10]);
            mb.setColor(r[offset + 11]);
            mb.setRandom(r[offset + 12]);

            modes.addMode(mb.build());
        }

        return modes;
    }

    @Override
    public Iterator<GLampMode> iterator() {
        return new GLampModesIterator();
    }

    private class GLampModesIterator implements Iterator<GLampMode>{
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < modes.size();
        }

        @Override
        public GLampMode next() {
            if (hasNext()) {
                return modes.get(currentIndex++);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {

        }
    }
}

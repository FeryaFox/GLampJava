package ru.feryafox.GLamp.GLampData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GLampModes implements Iterable<GLampMode> {
    private final ArrayList<GLampMode> modes;
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

    public void nextMode() {
        if (currentMode == modes.size()) {
            currentMode = 1;
            return;
        }
        currentMode++;
    }

    public void prevMode() {
        if (currentMode == 1) {
            currentMode = modes.size();
            return;
        }
        currentMode--;
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

    public static class Converter {
        private static final HashMap<Integer, String> effectTypes = new HashMap<>() {{
            put(1, "Перлин");
            put(2, "Цвет");
            put(3, "Смена");
            put(4, "Градиент");
            put(5, "Частицы");
            put(6, "Огонь");
            put(7, "Погода");
        }};

        private static final HashMap<Integer, String> additional = new HashMap<>() {{
           put(1, "Нет");
           put(2, "Громкость");
           put(3, "Низкие");
           put(4, "Высокие");
           put(5, "Часы");
        }};

        private static final HashMap<Integer, String> soundReactions = new HashMap<>() {{
           put(1, "Яркость");
           put(2, "Масштаб");
           put(3, "Длина");
        }};

        private static final HashMap<Integer, String> palettes = new HashMap<>() {{
            put(1, "Кастом");
            put(2, "Тепловая");
            put(3, "Огненная");
            put(4, "Лава");
            put(5, "Вечеринка");
            put(6, "Радуга");
            put(7, "Полосатая радуга");
            put(8, "Облака");
            put(9, "Океан");
            put(10, "Лес");
            put(11, "Закат");
            put(12, "Полиция");
            put(13, "Оптимус Прайм");
            put(14, "Тёплая лава");
            put(15, "Холодная лава");
            put(16, "Горячая лава");
            put(17, "Розовая лава");
            put(18, "Уютный");
            put(19, "Киберпанк");
            put(20, "Девчачая");
            put(21, "Рождество");
            put(22, "Кислота");
            put(23, "Синий дым");
            put(24, "Жвачка");
            put(25, "Леопард");
            put(26, "Аврора");
        }};

        public static String getEffectTypeNameById(int id){
            return effectTypes.get(id);
        }

        public static String getAdditionalNameById(int id){
            return additional.get(id);
        }

        public static String getSoundReactionNameById(int id){
            return soundReactions.get(id);
        }

        public static String getPaletteNameById(int id){
            return palettes.get(id);
        }

        public static ArrayList<String> getAllEffectTypeName(){
            ArrayList<String> effectTypeNames = new ArrayList<>();

            for (Integer effectTypeId : effectTypes.keySet()) {
                effectTypeNames.add(getEffectTypeNameById(effectTypeId));
            }
            return effectTypeNames;
        }

        public static ArrayList<String> getAllAdditionalName(){
            ArrayList<String> additionalNames = new ArrayList<>();

            for (Integer effectTypeId : additional.keySet()) {
                additionalNames.add(getAdditionalNameById(effectTypeId));
            }
            return additionalNames;
        }

        public static ArrayList<String> getAllSoundReactionName(){
            ArrayList<String> soundReactionNames = new ArrayList<>();

            for (Integer soundReaction : soundReactions.keySet()){
                soundReactionNames.add(getSoundReactionNameById(soundReaction));
            }
            return soundReactionNames;
        }

        public static ArrayList<String> getAllPaletteName(){
            ArrayList<String> palleteNames = new ArrayList<>();

            for (Integer paletteId : palettes.keySet()){
                palleteNames.add(getPaletteNameById(paletteId));
            }
            return palleteNames;
        }


        public static int getEffectTypeIdByName(String name){
            for (Integer effectTypeId : effectTypes.keySet()) {
                if (getEffectTypeNameById(effectTypeId).equals(name)) return effectTypeId;
            }
            return -1;
        }

        public static int getAdditionalIdByName(String name){
            for (Integer additionalId : additional.keySet()) {
                if (getAdditionalNameById(additionalId).equals(name)) return additionalId;
            }
            return -1;
        }

        public static int getSoundReactionIdByName(String name){
            for (Integer soundReactionId : soundReactions.keySet()){
                if (getSoundReactionNameById(soundReactionId).equals(name)) return soundReactionId;
            }
            return -1;
        }

        public static int getPaletteIdByName(String name){
            for (Integer paletteId : palettes.keySet()) {
                if (getPaletteNameById(paletteId).equals(name)) return paletteId;
            }
            return -1;
        }
    }
}

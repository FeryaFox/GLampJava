package ru.feryafox.GLamp.GLampData;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.feryafox.GLamp.Exceptions.GLampParamsException;

@Getter
@Setter
@AllArgsConstructor
public class GLampMode {
    private String effectType = "";
    private String flagPersonalBrightness = "";
    private String personalBrightness = "";
    private String additional = "";
    private String soundReaction = "";
    private String minSignal = "";
    private String maxSignal = "";
    private String speed = "";
    private String palette = "";
    private String scale = "";
    private String fromCenter = "";
    private String color = "";
    private String random = "";

    @Override
    public String toString() {
        return effectType + "," + flagPersonalBrightness + "," + personalBrightness + ","
                + additional + "," + soundReaction + "," + minSignal + "," + maxSignal + "," + speed + ","
                + palette + "," + scale + "," + fromCenter + "," + color + "," + random;
    }

    public static class Builder{
        private String effectType = "";
        private String flagPersonalBrightness = "";
        private String personalBrightness = "";
        private String additional = "";
        private String soundReaction = "";
        private String minSignal = "";
        private String maxSignal = "";
        private String speed = "";
        private String palette = "";
        private String scale = "";
        private String fromCenter = "";
        private String color = "";
        private String random = "";

        public Builder setEffectType(String effect_type) {
            if ( Integer.parseInt(effect_type) < 1  || Integer.parseInt(effect_type) > 7) throw new GLampParamsException("setEffectType", "Параметр effect_type должный быть 1 (Перлин) или 2 (Цвет) или 3 (Смена) или 4 (Градиент) или 5 (Частицы) или 6 (Огонь) или 7 (Погода)");
            this.effectType = effect_type;

            return this;
        }

        public Builder setEffectType(Integer effect_type) {
            if ( effect_type < 1  || effect_type > 7) throw new GLampParamsException("setEffectType", "Параметр effect_type должный быть 1 (Перлин) или 2 (Цвет) или 3 (Смена) или 4 (Градиент) или 5 (Частицы) или 6 (Огонь) или 7 (Погода)");
            this.effectType = effect_type.toString();

            return this;
        }

        public Builder setFlagPersonalBrightness(String flag_personal_brightness) {
            if ( Integer.parseInt(flag_personal_brightness) < 0  || Integer.parseInt(flag_personal_brightness) > 1) throw new GLampParamsException("setFlagPersonalBrightness", "Параметр flag_personal_brightness должный быть 0 (выкл) или 1 (вкл)");
            this.flagPersonalBrightness = flag_personal_brightness;

            return this;
        }

        public Builder setFlagPersonalBrightness(Integer flag_personal_brightness) {
            if ( flag_personal_brightness < 0  || flag_personal_brightness > 1) throw new GLampParamsException("setFlagPersonalBrightness", "Параметр flag_personal_brightness должный быть 0 (выкл) или 1 (вкл)");
            this.flagPersonalBrightness = flag_personal_brightness.toString();

            return this;
        }

        public Builder setPersonalBrightness(String personal_brightness) {
            if ( Integer.parseInt(personal_brightness) < 0  || Integer.parseInt(personal_brightness) > 255) throw new GLampParamsException("setPersonalBrightness", "Параметр personal_brightness должный быть в промежутке от 0 до 255");
            this.personalBrightness = personal_brightness;

            return this;
        }

        public Builder setPersonalBrightness(Integer personal_brightness) {
            if ( personal_brightness < 0  || personal_brightness > 255) throw new GLampParamsException("setPersonalBrightness", "Параметр personal_brightness должный быть в промежутке от 0 до 255");
            this.personalBrightness = personal_brightness.toString();

            return this;
        }

        public Builder setAdditional(String additional) {
            if ( Integer.parseInt(additional) < 1  || Integer.parseInt(additional) > 5) throw new GLampParamsException("setAdditional", "Параметр additional должный быть 1 (Нет) или 2 (Громкость) или 3 (Низкие) или 4 (Высокие) или 5 (Часы)");
            this.additional = additional;

            return this;
        }

        public Builder setAdditional(Integer additional) {
            if ( additional < 1  || additional > 5) throw new GLampParamsException("setAdditional", "Параметр additional должный быть 1 (Нет) или 2 (Громкость) или 3 (Низкие) или 4 (Высокие) или 5 (Часы)");
            this.additional = additional.toString();

            return this;
        }

        public Builder setSoundReaction(String sound_reaction) {
            if ( Integer.parseInt(sound_reaction) < 1  || Integer.parseInt(sound_reaction) > 3) throw new GLampParamsException("setSoundReaction", "Параметр sound_reaction должный быть 1 (Яркость) или 2 (Масштаб) или 3 (Длина)");
            this.soundReaction = sound_reaction;

            return this;
        }

        public Builder setSoundReaction(Integer sound_reaction) {
            if ( sound_reaction < 1  || sound_reaction > 3) throw new GLampParamsException("setSoundReaction", "Параметр sound_reaction должный быть 1 (Яркость) или 2 (Масштаб) или 3 (Длина)");
            this.soundReaction = sound_reaction.toString();

            return this;
        }

        public Builder setMinSignal(String min_signal) {
            if ( Integer.parseInt(min_signal) < 0  || Integer.parseInt(min_signal) > 255) throw new GLampParamsException("setMinSignal", "Параметр min_signal должный быть в промежутке от 0 до 255");
            this.minSignal = min_signal;

            return this;
        }

        public Builder setMinSignal(Integer min_signal) {
            if ( min_signal < 0  || min_signal > 255) throw new GLampParamsException("setMinSignal", "Параметр min_signal должный быть в промежутке от 0 до 255");
            this.minSignal = min_signal.toString();

            return this;
        }

        public Builder setMaxSignal(String max_signal) {
            if ( Integer.parseInt(max_signal) < 0  || Integer.parseInt(max_signal) > 255) throw new GLampParamsException("setMaxSignal", "Параметр max_signal должный быть в промежутке от 0 до 255");
            this.maxSignal = max_signal;

            return this;
        }

        public Builder setMaxSignal(Integer max_signal) {
            if ( max_signal < 0  || max_signal > 255) throw new GLampParamsException("setMaxSignal", "Параметр max_signal должный быть в промежутке от 0 до 255");
            this.maxSignal = max_signal.toString();

            return this;
        }

        public Builder setSpeed(String speed) {
            if ( Integer.parseInt(speed) < 0  || Integer.parseInt(speed) > 255) throw new GLampParamsException("setSpeed", "Параметр speed должный быть в промежутке от 0 до 255");
            this.speed = speed;

            return this;
        }

        public Builder setSpeed(Integer speed) {
            if ( speed < 0  || speed > 255) throw new GLampParamsException("setSpeed", "Параметр speed должный быть в промежутке от 0 до 255");
            this.speed = speed.toString();

            return this;
        }

        public Builder setPalette(String palette) {
            this.palette = palette;
            return this;
        }

        public Builder setPalette(Integer palette) {
            this.palette = palette.toString();
            return this;
        }

        public Builder setScale(String scale) {
            if ( Integer.parseInt(scale) < 0  || Integer.parseInt(scale) > 255) throw new GLampParamsException("setScale", "Параметр scale должный быть в промежутке от 0 до 255");
            this.scale = scale;

            return this;
        }

        public Builder setScale(Integer scale) {
            if ( scale < 0  || scale > 255) throw new GLampParamsException("setScale", "Параметр scale должный быть в промежутке от 0 до 255");
            this.scale = scale.toString();

            return this;
        }

        public Builder setFromCenter(String from_center) {
            if ( Integer.parseInt(from_center) < 0  || Integer.parseInt(from_center) > 1) throw new GLampParamsException("setFromCenter", "Параметр from_center должный быть 0 (выкл) или 1 (вкл)");
            this.fromCenter = from_center;

            return this;
        }

        public Builder setFromCenter(Integer from_center) {
            if ( from_center < 0  || from_center > 1) throw new GLampParamsException("setFromCenter", "Параметр from_center должный быть 0 (выкл) или 1 (вкл)");
            this.fromCenter = from_center.toString();

            return this;
        }

        public Builder setColor(String color) {
            if ( Integer.parseInt(color) < 0  || Integer.parseInt(color) > 255) throw new GLampParamsException("setColor", "Параметр color должный быть в промежутке от 0 до 255");
            this.color = color;

            return this;
        }

        public Builder setColor(Integer color) {
            if ( color < 0  || color > 255) throw new GLampParamsException("setColor", "Параметр color должный быть в промежутке от 0 до 255");
            this.color = color.toString();

            return this;
        }

        public Builder setRandom(String random) {
            if ( Integer.parseInt(random) < 0  || Integer.parseInt(random) > 1) throw new GLampParamsException("setRandom", "Параметр random должный быть 0 (выкл) или 1 (вкл)");
            this.random = random;

            return this;
        }

        public Builder setRandom(Integer random) {
            if (random < 0 || random > 1)
                throw new GLampParamsException("setRandom", "Параметр random должный быть 0 (выкл) или 1 (вкл)");
            this.random = random.toString();

            return this;
        }

        public GLampMode build(){
            return new GLampMode(effectType, flagPersonalBrightness, personalBrightness,
                    additional, soundReaction, minSignal, maxSignal, speed,
                    palette, scale, fromCenter, color, random);
        }
    }
}

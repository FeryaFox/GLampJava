package ru.feryafox.GLamp.GLampData;

import ru.feryafox.GLamp.Exceptions.GLampParamsException;

public class GLampSettings {
    private String brightness = "100";
    private String adc = "1";
    private String min_brightness = "0";
    private String max_brightness = "255";
    private String regime_change = "0";
    private String random_order_modes = "0";
    private String shift_period = "1";
    private String strip_type = "2";
    private String maximal_current = "15";
    private String work_hours_from = "0";
    private String work_hours_to = "0";
    private String matrix_orientation = "1";
    private String height = "16";
    private String width = "16";
    private String gmt = "16";
    private String city_id = "524901";
    private String mqtt_state = "0";
    private String mqtt_id = "alexLamp123";
    private String mqtt_host = "broker.mqttdashboard.com";
    private String mqtt_port = "1883";
    private String mqtt_login = "gyver";
    private String mqtt_pass = "123456";

    public GLampSettings(String brightness, String adc, String min_brightness, String max_brightness, String regime_change,
                         String random_order_modes, String shift_period, String strip_type, String maximal_current,
                         String work_hours_from, String work_hours_to, String matrix_orientation, String height, String width,
                         String gmt, String city_id, String mqtt_state, String mqtt_id, String mqtt_host, String mqtt_port,
                         String mqtt_login, String mqtt_pass) {
        this.brightness = brightness;
        this.adc = adc;
        this.min_brightness = min_brightness;
        this.max_brightness = max_brightness;
        this.regime_change = regime_change;
        this.random_order_modes = random_order_modes;
        this.shift_period = shift_period;
        this.strip_type = strip_type;
        this.maximal_current = maximal_current;
        this.work_hours_from = work_hours_from;
        this.work_hours_to = work_hours_to;
        this.matrix_orientation = matrix_orientation;
        this.height = height;
        this.width = width;
        this.gmt = gmt;
        this.city_id = city_id;
        this.mqtt_state = mqtt_state;
        this.mqtt_id = mqtt_id;
        this.mqtt_host = mqtt_host;
        this.mqtt_port = mqtt_port;
        this.mqtt_login = mqtt_login;
        this.mqtt_pass = mqtt_pass;
    }


    public String getBrightness() {
        return brightness;
    }

    public String getAdc() {
        return adc;
    }

    public String getMinBrightness() {
        return min_brightness;
    }

    public String getMaxBrightness() {
        return max_brightness;
    }

    public String getRegimeChange() {
        return regime_change;
    }

    public String getRandomOrderModes() {
        return random_order_modes;
    }

    public String getShiftPeriod() {
        return shift_period;
    }

    public String getStripType() {
        return strip_type;
    }

    public String getMaximalCurrent() {
        return maximal_current;
    }

    public String getWorkHoursFrom() {
        return work_hours_from;
    }

    public String getWorkHoursTo() {
        return work_hours_to;
    }

    public String getMatrixOrientation() {
        return matrix_orientation;
    }

    public String getHeight() {
        return height;
    }

    public String getWidth() {
        return width;
    }

    public String getGmt() {
        return gmt;
    }

    public String getCityId() {
        return city_id;
    }

    public String getMqttState() {
        return mqtt_state;
    }

    public String getMqttId() {
        return mqtt_id;
    }

    public String getMqttHost() {
        return mqtt_host;
    }

    public String getMqttPort() {
        return mqtt_port;
    }

    public String getMqttLogin() {
        return mqtt_login;
    }

    public String getMqttPass() {
        return mqtt_pass;
    }

    @Override
    public String toString() {
        return brightness + "," + adc + "," + min_brightness + "," + max_brightness + "," + regime_change + "," +
                random_order_modes + "," + shift_period + "," + strip_type + "," + maximal_current + "," +
                work_hours_from + "," + work_hours_to + "," + matrix_orientation + "," + height + "," + width + "," +
                gmt + "," + city_id + "," + mqtt_state + "," + mqtt_id + "," + mqtt_host + "," + mqtt_port + "," +
                mqtt_login + "," + mqtt_pass;
    }

    public static class Builder{
        public Builder(){

        }

        private String brightness = "100";
        private String adc = "1";
        private String min_brightness = "0";
        private String max_brightness = "255";
        private String regime_change = "0";
        private String random_order_modes = "0";
        private String shift_period = "1";
        private String strip_type = "2";
        private String maximal_current = "15";
        private String work_hours_from = "0";
        private String work_hours_to = "0";
        private String matrix_orientation = "1";
        private String height = "16";
        private String width = "16";
        private String gmt = "16";
        private String city_id = "524901";
        private String mqtt_state = "0";
        private String mqtt_id = "alexLamp123";
        private String mqtt_host = "broker.mqttdashboard.com";
        private String mqtt_port = "1883";
        private String mqtt_login = "gyver";
        private String mqtt_pass = "123456";

        public Builder setBrightness(String brightness) {
            if ( Integer.parseInt(brightness) < 0  || Integer.parseInt(brightness) > 255) throw new GLampParamsException("setBrightness", "Параметр brightness должный быть в промежутке от 0 до 255");
            this.brightness = brightness;

            return this;
        }

        public Builder setBrightness(Integer brightness) {
            if ( brightness < 0  || brightness > 255) throw new GLampParamsException("setBrightness", "Параметр brightness должный быть в промежутке от 0 до 255");
            this.brightness = brightness.toString();

            return this;
        }

        public Builder setAdc(String adc) {
            if ( Integer.parseInt(adc) < 1  || Integer.parseInt(adc) > 4) throw new GLampParamsException("setAdc", "Параметр adc должный быть 1 (выкл) или 2 (яркость) или 3 (музыка) или 4 (оба)");
            this.adc = adc;

            return this;
        }

        public Builder setAdc(Integer adc) {
            if ( adc < 1  || adc > 4) throw new GLampParamsException("setAdc", "Параметр adc должный быть 1 (выкл) или 2 (яркость) или 3 (музыка) или 4 (оба)");
            this.adc = adc.toString();

            return this;
        }

        public Builder setMinBrightness(String min_brightness) {
            if ( Integer.parseInt(min_brightness) < 0  || Integer.parseInt(min_brightness) > 255) throw new GLampParamsException("setMinBrightness", "Параметр min_brightness должный быть в промежутке от 0 до 255");
            this.min_brightness = min_brightness;

            return this;
        }

        public Builder setMinBrightness(Integer min_brightness) {
            if ( min_brightness < 0  || min_brightness > 255) throw new GLampParamsException("setMinBrightness", "Параметр min_brightness должный быть в промежутке от 0 до 255");
            this.min_brightness = min_brightness.toString();

            return this;
        }

        public Builder setMaxBrightness(String max_brightness) {
            if ( Integer.parseInt(max_brightness) < 0  || Integer.parseInt(max_brightness) > 255) throw new GLampParamsException("setMaxBrightness", "Параметр max_brightness должный быть в промежутке от 0 до 255");
            this.max_brightness = max_brightness;

            return this;
        }

        public Builder setMaxBrightness(Integer max_brightness) {
            if ( max_brightness < 0  || max_brightness > 255) throw new GLampParamsException("setMaxBrightness", "Параметр max_brightness должный быть в промежутке от 0 до 255");
            this.max_brightness = max_brightness.toString();

            return this;
        }

        public Builder setRegimeChange(String regime_change) {
            if ( Integer.parseInt(regime_change) < 0  || Integer.parseInt(regime_change) > 1) throw new GLampParamsException("setRegimeChange", "Параметр regime_change должный быть 0 (ручная) или 1 (авто)");
            this.regime_change = regime_change;

            return this;
        }

        public Builder setRegimeChange(Integer regime_change) {
            if ( regime_change < 0  || regime_change > 1) throw new GLampParamsException("setRegimeChange", "Параметр regime_change должный быть 0 (ручная) или 1 (авто)");
            this.regime_change = regime_change.toString();

            return this;
        }

        public Builder setRandomOrderModes(String random_order_modes) {
            if ( Integer.parseInt(random_order_modes) < 0  || Integer.parseInt(random_order_modes) > 1) throw new GLampParamsException("setRandomOrderModes", "Параметр random_order_modes должный быть 0 (выкл) или 1 (вкл)");
            this.random_order_modes = random_order_modes;

            return this;
        }

        public Builder setRandomOrderModes(Integer random_order_modes) {
            if ( random_order_modes < 0  || random_order_modes > 1) throw new GLampParamsException("setRandomOrderModes", "Параметр random_order_modes должный быть 0 (выкл) или 1 (вкл)");
            this.random_order_modes = random_order_modes.toString();

            return this;
        }

        public Builder setShiftPeriod(String shift_period) {
            if ( Integer.parseInt(shift_period) < 0 ) throw new GLampParamsException("setShiftPeriod", "Параметр shift_period должный быть больше нуля");
            this.shift_period = shift_period;

            return this;
        }

        public Builder setShiftPeriod(Integer shift_period) {
            if ( shift_period < 0 ) throw new GLampParamsException("setShiftPeriod", "Параметр shift_period должный быть больше нуля");
            this.shift_period = shift_period.toString();

            return this;
        }

        public Builder setStripType(String strip_type) {
            if ( Integer.parseInt(strip_type) < 0  || Integer.parseInt(strip_type) > 3) throw new GLampParamsException("setStripType", "Параметр strip_type должный быть 0 (лента) или 1 (зигзаг) или 3 (спираль)");
            this.strip_type = strip_type;

            return this;
        }

        public Builder setStripType(Integer strip_type) {
            if ( strip_type < 0  || strip_type > 3) throw new GLampParamsException("setStripType", "Параметр strip_type должный быть 0 (лента) или 1 (зигзаг) или 3 (спираль)");
            this.strip_type = strip_type.toString();

            return this;
        }

        public Builder setMaximalCurrent(String maximal_current) {
            if ( Integer.parseInt(maximal_current) < 0 ) throw new GLampParamsException("setMaximalCurrent", "Параметр maximal_current должный быть больше нуля");
            this.maximal_current = maximal_current;

            return this;
        }

        public Builder setMaximalCurrent(Integer maximal_current) {
            if ( maximal_current < 0 ) throw new GLampParamsException("setMaximalCurrent", "Параметр maximal_current должный быть больше нуля");
            this.maximal_current = maximal_current.toString();

            return this;
        }

        public Builder setWorkHoursFrom(String work_hours_from) {
            if ( Integer.parseInt(work_hours_from) < 0 || Integer.parseInt(work_hours_from) > 23) throw new GLampParamsException("setWorkHoursFrom", "Параметр work_hours_from должен быть от 0 до 23");
            this.work_hours_from = work_hours_from;

            return this;
        }

        public Builder setWorkHoursFrom(Integer work_hours_from) {
            if ( work_hours_from < 0 || work_hours_from > 23) throw new GLampParamsException("setWorkHoursFrom", "Параметр work_hours_from должен быть от 0 до 23");
            this.work_hours_from = work_hours_from.toString();

            return this;
        }

        public Builder setWorkHoursTo(String work_hours_to) {
            if ( Integer.parseInt(work_hours_to) < 0 || Integer.parseInt(work_hours_to) > 23) throw new GLampParamsException("setWorkHoursTo", "Параметр work_hours_to должен быть от 0 до 23");
            this.work_hours_to = work_hours_to;

            return this;
        }

        public Builder setWorkHoursTo(Integer work_hours_to) {
            if ( work_hours_to < 0 || work_hours_to > 23) throw new GLampParamsException("setWorkHoursTo", "Параметр work_hours_to должен быть от 0 до 23");
            this.work_hours_to = work_hours_to.toString();

            return this;
        }

        public Builder setMatrixOrientation(String matrix_orientation) {
            if ( Integer.parseInt(matrix_orientation) < 1 || Integer.parseInt(matrix_orientation) > 8) throw new GLampParamsException("setMatrixOrientation", "Параметр matrix_orientation должен быть от 1 до 8");
            this.matrix_orientation = matrix_orientation;

            return this;
        }

        public Builder setMatrixOrientation(Integer matrix_orientation) {
            if ( matrix_orientation < 1 || matrix_orientation > 8) throw new GLampParamsException("setMatrixOrientation", "Параметр matrix_orientation должен быть от 1 до 8");
            this.matrix_orientation = matrix_orientation.toString();

            return this;
        }

        public Builder setHeight(String height) {
            if (Integer.parseInt(height) < 0) throw new GLampParamsException("setHeight", "Параметр height должен быть положительным");
            this.height = height;

            return this;
        }

        public Builder setHeight(Integer height) {
            if (height < 0) throw new GLampParamsException("setHeight", "Параметр height должен быть положительным");
            this.height = height.toString();

            return this;
        }

        public Builder setWidth(String width) {
            if (Integer.parseInt(width) < 0) throw new GLampParamsException("setWidth", "Параметр width должен быть положительным");
            this.width = width;

            return this;
        }

        public Builder setWidth(Integer width) {
            if (width < 0) throw new GLampParamsException("setWidth", "Параметр width должен быть положительным");
            this.width = width.toString();

            return this;
        }

        public Builder setGmt(String gmt) {
            this.gmt = gmt;

            return this;
        }

        public Builder setCityId(String city_id) {
            if (Integer.parseInt(city_id) < 0) throw new GLampParamsException("setCityId", "Параметр city_id должен быть положительным");
            this.city_id = city_id;

            return this;
        }

        public Builder setCityId(Integer city_id) {
            if (city_id < 0) throw new GLampParamsException("setCityId", "Параметр city_id должен быть положительным");
            this.city_id = city_id.toString();

            return this;
        }

        public Builder setMqttState(String mqtt_state) {
            if (Integer.parseInt(mqtt_state) < 0 || Integer.parseInt(mqtt_state) > 1) throw new GLampParamsException("setMqttState", "Параметр mqtt_state должный быть 0 (выкл) или 1 (вкл)");
            this.mqtt_state = mqtt_state;

            return this;
        }

        public Builder setMqttState(Integer mqtt_state) {
            if (mqtt_state < 0 || mqtt_state > 1) throw new GLampParamsException("setMqttState", "Параметр mqtt_state должный быть 0 (выкл) или 1 (вкл)");
            this.mqtt_state = mqtt_state.toString();

            return this;
        }

        public Builder setMqttId(String mqtt_id) {
            this.mqtt_id = mqtt_id;

            return this;
        }

        public Builder setMqttHost(String mqtt_host) {
            this.mqtt_host = mqtt_host;

            return this;
        }

        public Builder setMqttPort(String mqtt_port) {
            this.mqtt_port = mqtt_port;

            return this;
        }

        public Builder setMqttLogin(String mqtt_login) {
            this.mqtt_login = mqtt_login;

            return this;
        }

        public Builder setMqttPass(String mqtt_pass) {
            this.mqtt_pass = mqtt_pass;

            return this;
        }

        public GLampSettings build(){
            return new GLampSettings(brightness, adc, min_brightness, max_brightness, regime_change, random_order_modes,
                    shift_period, strip_type, maximal_current, work_hours_from, work_hours_to,
                    matrix_orientation, height, width, gmt, city_id, mqtt_state, mqtt_id,
                    mqtt_host, mqtt_port, mqtt_login, mqtt_pass);
        }
    }

    public static GLampSettings buildFromResponse(String response){
        String[] r = response.split(",");
        Builder b = new Builder();
        b.setBrightness(r[2]);
        b.setAdc(r[3]);
        b.setMinBrightness(r[4]);
        b.setMaxBrightness(r[5]);
        b.setRegimeChange(r[6]);
        b.setRandomOrderModes(r[7]);
        b.setShiftPeriod(r[8]);
        b.setStripType(r[9]);
        b.setMaximalCurrent(r[10]);
        b.setWorkHoursFrom(r[11]);
        b.setWorkHoursTo(r[12]);
        b.setMatrixOrientation(r[13]);
        b.setHeight(r[14]);
        b.setWidth(r[15]);
        b.setGmt(r[16]);
        b.setCityId(r[17]);
        b.setMqttState(r[18]);
        b.setMqttId(r[19]);
        b.setMqttHost(r[20]);
        b.setMqttPort(r[21]);
        b.setMqttLogin(r[22]);
        b.setMqttPass(r[23]);

        return b.build();
    }
}

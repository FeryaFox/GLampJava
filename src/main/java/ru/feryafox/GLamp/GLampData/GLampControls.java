package ru.feryafox.GLamp.GLampData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.feryafox.GLamp.Exceptions.GLampParamsException;

@Getter
@Setter
@AllArgsConstructor
public class GLampControls {
    private String modesIndex = "1";
    private String WIFIMode = "0";
    private String role = "0";
    private String groupNumber = "0";


    public static class Builder {
        private String modesIndex = "1";
        private String WIFIMode = "0";
        private String role = "0";
        private String groupNumber = "0";

        public Builder setModesIndex(String modesIndex) {
            if( Integer.parseInt(modesIndex) < 1) throw new GLampParamsException("setModesIndex", "Параметр modesIndex должен быть больше 1");
            this.modesIndex = modesIndex;

            return this;
        }

        public Builder setModesIndex(Integer modesIndex) {
            if( modesIndex < 1) throw new GLampParamsException("setModesIndex", "Параметр modesIndex должен быть больше 1");
            this.modesIndex = modesIndex.toString();

            return this;
        }

        public Builder setWIFIMode(String WIFIMode) {
            if (Integer.parseInt(WIFIMode) < 0 || Integer.parseInt(WIFIMode) > 1) throw new GLampParamsException("setWIFIMode", "Параметр WIFIMode должный быть 0 (AP) или 1 (Local)");
            this.WIFIMode = WIFIMode;

            return this;
        }

        public Builder setWIFIMode(Integer WIFIMode) {
            if (WIFIMode < 0 || WIFIMode > 1) throw new GLampParamsException("setWIFIMode", "Параметр WIFIMode должный быть 0 (AP) или 1 (Local)");
            this.WIFIMode = WIFIMode.toString();

            return this;
        }

        public Builder setGroupNumber(String groupNumber) {
            this.groupNumber = groupNumber;

            return this;
        }

        public Builder setRole(String role) {
            if (Integer.parseInt(role) < 0 || Integer.parseInt(role) > 1) throw new GLampParamsException("setRole", "Параметр role должный быть 0 (slave) или 1 (master)");
            this.role = role;

            return this;
        }

        public Builder setRole(Integer role) {
            if (role < 0 || role > 1) throw new GLampParamsException("setRole", "Параметр role должный быть 0 (slave) или 1 (master)");
            this.role = role.toString();

            return this;
        }

        public GLampControls build() {
            return new GLampControls(modesIndex, WIFIMode, role, groupNumber);
        }
    }

    public static GLampControls buildFromResponse (String response) {
        String[] r = response.split(",");
        GLampControls.Builder b = new Builder();

        b.setModesIndex(r[6]);
        b.setWIFIMode(r[7]);
        b.setRole(r[8]);
        b.setGroupNumber(r[9]);

        return b.build();
    }
}

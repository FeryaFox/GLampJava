package ru.feryafox.GLamp.GLampData;

import ru.feryafox.GLamp.Exceptions.GLampParamsException;

public class GLampDawn{
    private String sundayStatus = "0";
    private String mondayStatus = "0";
    private String tuesdayStatus = "0";
    private String wednesdayStatus = "0";
    private String thursdayStatus = "0";
    private String fridayStatus = "0";
    private String saturdayStatus = "0";
    private String sundayHour = "0";
    private String mondayHour = "0";
    private String tuesdayHour = "0";
    private String wednesdayHour = "0";
    private String thursdayHour = "0";
    private String fridayHour = "0";
    private String saturdayHour = "0";
    private String sundayMinute = "0";
    private String mondayMinute = "0";
    private String tuesdayMinute = "0";
    private String wednesdayMinute = "0";
    private String thursdayMinute = "0";
    private String fridayMinute = "0";
    private String saturdayMinute = "0";
    private String brightness = "0";
    private String minutesBeforeDawn = "0";

    public GLampDawn(String sundayStatus, String mondayStatus, String tuesdayStatus,
                     String wednesdayStatus, String thursdayStatus, String fridayStatus,
                     String saturdayStatus, String sundayHour, String mondayHour,
                     String tuesdayHour, String wednesdayHour, String thursdayHour,
                     String fridayHour, String saturdayHour, String sundayMinute,
                     String mondayMinute, String tuesdayMinute, String wednesdayMinute,
                     String thursdayMinute, String fridayMinute, String saturdayMinute,
                     String brightness, String minutesBeforeDawn) {
        this.sundayStatus = sundayStatus;
        this.mondayStatus = mondayStatus;
        this.tuesdayStatus = tuesdayStatus;
        this.wednesdayStatus = wednesdayStatus;
        this.thursdayStatus = thursdayStatus;
        this.fridayStatus = fridayStatus;
        this.saturdayStatus = saturdayStatus;
        this.sundayHour = sundayHour;
        this.mondayHour = mondayHour;
        this.tuesdayHour = tuesdayHour;
        this.wednesdayHour = wednesdayHour;
        this.thursdayHour = thursdayHour;
        this.fridayHour = fridayHour;
        this.saturdayHour = saturdayHour;
        this.sundayMinute = sundayMinute;
        this.mondayMinute = mondayMinute;
        this.tuesdayMinute = tuesdayMinute;
        this.wednesdayMinute = wednesdayMinute;
        this.thursdayMinute = thursdayMinute;
        this.fridayMinute = fridayMinute;
        this.saturdayMinute = saturdayMinute;
        this.brightness = brightness;
        this.minutesBeforeDawn = minutesBeforeDawn;
    }

    public String getSundayStatus() {
        return sundayStatus;
    }

    public String getMondayStatus() {
        return mondayStatus;
    }

    public String getTuesdayStatus() {
        return tuesdayStatus;
    }

    public String getWednesdayStatus() {
        return wednesdayStatus;
    }

    public String getThursdayStatus() {
        return thursdayStatus;
    }

    public String getFridayStatus() {
        return fridayStatus;
    }

    public String getSaturdayStatus() {
        return saturdayStatus;
    }

    public String getSundayHour() {
        return sundayHour;
    }

    public String getMondayHour() {
        return mondayHour;
    }

    public String getTuesdayHour() {
        return tuesdayHour;
    }

    public String getWednesdayHour() {
        return wednesdayHour;
    }

    public String getThursdayHour() {
        return thursdayHour;
    }

    public String getFridayHour() {
        return fridayHour;
    }

    public String getSaturdayHour() {
        return saturdayHour;
    }

    public String getSundayMinute() {
        return sundayMinute;
    }

    public String getMondayMinute() {
        return mondayMinute;
    }

    public String getTuesdayMinute() {
        return tuesdayMinute;
    }

    public String getWednesdayMinute() {
        return wednesdayMinute;
    }

    public String getThursdayMinute() {
        return thursdayMinute;
    }

    public String getFridayMinute() {
        return fridayMinute;
    }

    public String getSaturdayMinute() {
        return saturdayMinute;
    }

    public String getBrightness() {
        return brightness;
    }

    public String getMinutesBeforeDawn() {
        return minutesBeforeDawn;
    }

    public void setFridayHour(String fridayHour) {
        this.fridayHour = fridayHour;
    }

    public void setSundayStatus(String sundayStatus) {
        this.sundayStatus = sundayStatus;
    }

    public void setMondayStatus(String mondayStatus) {
        this.mondayStatus = mondayStatus;
    }

    public void setTuesdayStatus(String tuesdayStatus) {
        this.tuesdayStatus = tuesdayStatus;
    }

    public void setWednesdayStatus(String wednesdayStatus) {
        this.wednesdayStatus = wednesdayStatus;
    }

    public void setThursdayStatus(String thursdayStatus) {
        this.thursdayStatus = thursdayStatus;
    }

    public void setFridayStatus(String fridayStatus) {
        this.fridayStatus = fridayStatus;
    }

    public void setSaturdayStatus(String saturdayStatus) {
        this.saturdayStatus = saturdayStatus;
    }

    public void setSundayHour(String sundayHour) {
        this.sundayHour = sundayHour;
    }

    public void setMondayHour(String mondayHour) {
        this.mondayHour = mondayHour;
    }

    public void setTuesdayHour(String tuesdayHour) {
        this.tuesdayHour = tuesdayHour;
    }

    public void setWednesdayHour(String wednesdayHour) {
        this.wednesdayHour = wednesdayHour;
    }

    public void setThursdayHour(String thursdayHour) {
        this.thursdayHour = thursdayHour;
    }

    public void setSaturdayHour(String saturdayHour) {
        this.saturdayHour = saturdayHour;
    }

    public void setSundayMinute(String sundayMinute) {
        this.sundayMinute = sundayMinute;
    }

    public void setMondayMinute(String mondayMinute) {
        this.mondayMinute = mondayMinute;
    }

    public void setTuesdayMinute(String tuesdayMinute) {
        this.tuesdayMinute = tuesdayMinute;
    }

    public void setWednesdayMinute(String wednesdayMinute) {
        this.wednesdayMinute = wednesdayMinute;
    }

    public void setThursdayMinute(String thursdayMinute) {
        this.thursdayMinute = thursdayMinute;
    }

    public void setFridayMinute(String fridayMinute) {
        this.fridayMinute = fridayMinute;
    }

    public void setSaturdayMinute(String saturdayMinute) {
        this.saturdayMinute = saturdayMinute;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public void setMinutesBeforeDawn(String minutesBeforeDawn) {
        this.minutesBeforeDawn = minutesBeforeDawn;
    }

    @Override
    public String toString() {
        return sundayStatus + "," + mondayStatus + "," + tuesdayStatus + "," + wednesdayStatus + ","
                + thursdayStatus + "," + fridayStatus + "," + saturdayStatus + "," + sundayHour + ","
                + mondayHour + "," + tuesdayHour + "," + wednesdayHour + "," + thursdayHour + ","
                + fridayHour + "," + saturdayHour + "," + sundayMinute + "," + mondayMinute + ","
                + tuesdayMinute + "," + wednesdayMinute + "," + thursdayMinute + "," + fridayMinute + ","
                + saturdayMinute + "," + brightness +","+ minutesBeforeDawn;
    }

    public static class Builder{
        private String sundayStatus = "0";
        private String mondayStatus = "0";
        private String tuesdayStatus = "0";
        private String wednesdayStatus = "0";
        private String thursdayStatus = "0";
        private String fridayStatus = "0";
        private String saturdayStatus = "0";
        private String sundayHour = "0";
        private String mondayHour = "0";
        private String tuesdayHour = "0";
        private String wednesdayHour = "0";
        private String thursdayHour = "0";
        private String fridayHour = "0";
        private String saturdayHour = "0";
        private String sundayMinute = "0";
        private String mondayMinute = "0";
        private String tuesdayMinute = "0";
        private String wednesdayMinute = "0";
        private String thursdayMinute = "0";
        private String fridayMinute = "0";
        private String saturdayMinute = "0";
        private String brightness = "0";
        private String minutesBeforeDawn = "0";

        public Builder setSundayStatus(String sundayStatus) {
            if ( Integer.parseInt(sundayStatus) < 0  || Integer.parseInt(sundayStatus) > 1) throw new GLampParamsException("setSundayStatus", "Параметр sundayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.sundayStatus = sundayStatus;
            
            return this;
        }
        
        public Builder setSundayStatus(Integer sundayStatus) {
            if ( sundayStatus < 0  || sundayStatus > 1) throw new GLampParamsException("setSundayStatus", "Параметр sundayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.sundayStatus = sundayStatus.toString();
            
            return this;
        }

        public Builder setMondayStatus(String mondayStatus) {
            if ( Integer.parseInt(mondayStatus) < 0  || Integer.parseInt(mondayStatus) > 1) throw new GLampParamsException("setMondayStatus", "Параметр mondayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.mondayStatus = mondayStatus;

            return this;
        }

        public Builder setMondayStatus(Integer mondayStatus) {
            if ( mondayStatus < 0  || mondayStatus > 1) throw new GLampParamsException("setMondayStatus", "Параметр mondayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.mondayStatus = mondayStatus.toString();

            return this;
        }

        public Builder setTuesdayStatus(String tuesdayStatus) {
            if ( Integer.parseInt(tuesdayStatus) < 0  || Integer.parseInt(tuesdayStatus) > 1) throw new GLampParamsException("setTuesdayStatus", "Параметр tuesdayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.tuesdayStatus = tuesdayStatus;

            return this;
        }

        public Builder setTuesdayStatus(Integer tuesdayStatus) {
            if ( tuesdayStatus < 0  || tuesdayStatus > 1) throw new GLampParamsException("setTuesdayStatus", "Параметр tuesdayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.tuesdayStatus = tuesdayStatus.toString();

            return this;
        }

        public Builder setWednesdayStatus(String wednesdayStatus) {
            if ( Integer.parseInt(wednesdayStatus) < 0  || Integer.parseInt(wednesdayStatus) > 1) throw new GLampParamsException("setWednesdayStatus", "Параметр wednesdayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.wednesdayStatus = wednesdayStatus;

            return this;
        }

        public Builder setWednesdayStatus(Integer wednesdayStatus) {
            if ( wednesdayStatus < 0  || wednesdayStatus > 1) throw new GLampParamsException("setWednesdayStatus", "Параметр wednesdayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.wednesdayStatus = wednesdayStatus.toString();

            return this;
        }

        public Builder setThursdayStatus(String thursdayStatus) {
            if ( Integer.parseInt(thursdayStatus) < 0  || Integer.parseInt(thursdayStatus) > 1) throw new GLampParamsException("setSaturdayStatus", "Параметр thursdayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.thursdayStatus = thursdayStatus;

            return this;
        }

        public Builder setThursdayStatus(Integer thursdayStatus) {
            if ( thursdayStatus < 0  || thursdayStatus > 1) throw new GLampParamsException("setSaturdayStatus", "Параметр thursdayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.thursdayStatus = thursdayStatus.toString();

            return this;
        }

        public Builder setFridayStatus(String fridayStatus) {
            if ( Integer.parseInt(fridayStatus) < 0  || Integer.parseInt(fridayStatus) > 1) throw new GLampParamsException("setFridayStatus", "Параметр fridayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.fridayStatus = fridayStatus;

            return this;
        }

        public Builder setFridayStatus(Integer fridayStatus) {
            if ( fridayStatus < 0  || fridayStatus > 1) throw new GLampParamsException("setFridayStatus", "Параметр fridayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.fridayStatus = fridayStatus.toString();

            return this;
        }

        public Builder setSaturdayStatus(String saturdayStatus) {
            if ( Integer.parseInt(saturdayStatus) < 0  || Integer.parseInt(saturdayStatus) > 1) throw new GLampParamsException("setSaturdayStatus", "Параметр saturdayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.saturdayStatus = saturdayStatus;

            return this;
        }

        public Builder setSaturdayStatus(Integer saturdayStatus) {
            if ( saturdayStatus < 0  || saturdayStatus > 1) throw new GLampParamsException("setSaturdayStatus", "Параметр saturdayStatus должный быть 0 (выкл) или 1 (вкл)");
            this.saturdayStatus = saturdayStatus.toString();

            return this;
        }

        public Builder setSundayHour(String sundayHour) {
            if ( Integer.parseInt(sundayHour) < 0  || Integer.parseInt(sundayHour) > 23) throw new GLampParamsException("setSundayHour", "Параметр sundayHour должный быть в промежутке от 0 до 23");
            this.sundayHour = sundayHour;

            return this;
        }

        public Builder setSundayHour(Integer sundayHour) {
            if ( sundayHour < 0  || sundayHour > 23) throw new GLampParamsException("setSundayHour", "Параметр sundayHour должный быть в промежутке от 0 до 23");
            this.sundayHour = sundayHour.toString();

            return this;
        }

        public Builder setMondayHour(String mondayHour) {
            if (Integer.parseInt(mondayHour) < 0 || Integer.parseInt(mondayHour) > 23) {
                throw new GLampParamsException("setMondayHour", "Параметр mondayHour должен быть в пределах от 0 до 23");
            }
            this.mondayHour = mondayHour;
            return this;
        }

        public Builder setMondayHour(Integer mondayHour) {
            if (mondayHour < 0 || mondayHour > 23) {
                throw new GLampParamsException("setMondayHour", "Параметр mondayHour должен быть в пределах от 0 до 23");
            }
            this.mondayHour = mondayHour.toString();
            return this;
        }

        public Builder setTuesdayHour(String tuesdayHour) {
            if (Integer.parseInt(tuesdayHour) < 0 || Integer.parseInt(tuesdayHour) > 23) {
                throw new GLampParamsException("setTuesdayHour", "Параметр tuesdayHour должен быть в пределах от 0 до 23");
            }
            this.tuesdayHour = tuesdayHour;
            return this;
        }

        public Builder setTuesdayHour(Integer tuesdayHour) {
            if (tuesdayHour < 0 || tuesdayHour > 23) {
                throw new GLampParamsException("setTuesdayHour", "Параметр tuesdayHour должен быть в пределах от 0 до 23");
            }
            this.tuesdayHour = tuesdayHour.toString();
            return this;
        }

        public Builder setWednesdayHour(String wednesdayHour) {
            if (Integer.parseInt(wednesdayHour) < 0 || Integer.parseInt(wednesdayHour) > 23) {
                throw new GLampParamsException("setWednesdayHour", "Параметр wednesdayHour должен быть в пределах от 0 до 23");
            }
            this.wednesdayHour = wednesdayHour;
            return this;
        }

        public Builder setWednesdayHour(Integer wednesdayHour) {
            if (wednesdayHour < 0 || wednesdayHour > 23) {
                throw new GLampParamsException("setWednesdayHour", "Параметр wednesdayHour должен быть в пределах от 0 до 23");
            }
            this.wednesdayHour = wednesdayHour.toString();
            return this;
        }

        public Builder setThursdayHour(String thursdayHour) {
            if (Integer.parseInt(thursdayHour) < 0 || Integer.parseInt(thursdayHour) > 23) {
                throw new GLampParamsException("setThursdayHour", "Параметр thursdayHour должен быть в пределах от 0 до 23");
            }
            this.thursdayHour = thursdayHour;
            return this;
        }

        public Builder setThursdayHour(Integer thursdayHour) {
            if (thursdayHour < 0 || thursdayHour > 23) {
                throw new GLampParamsException("setThursdayHour", "Параметр thursdayHour должен быть в пределах от 0 до 23");
            }
            this.thursdayHour = thursdayHour.toString();
            return this;
        }

        public Builder setFridayHour(String fridayHour) {
            if (Integer.parseInt(fridayHour) < 0 || Integer.parseInt(fridayHour) > 23) {
                throw new GLampParamsException("setFridayHour", "Параметр fridayHour должен быть в пределах от 0 до 23");
            }
            this.fridayHour = fridayHour;
            return this;
        }

        public Builder setFridayHour(Integer fridayHour) {
            if (fridayHour < 0 || fridayHour > 23) {
                throw new GLampParamsException("setFridayHour", "Параметр fridayHour должен быть в пределах от 0 до 23");
            }
            this.fridayHour = fridayHour.toString();
            return this;
        }

        public Builder setSaturdayHour(String saturdayHour) {
            if (Integer.parseInt(saturdayHour) < 0 || Integer.parseInt(saturdayHour) > 23) {
                throw new GLampParamsException("setSaturdayHour", "Параметр saturdayHour должен быть в пределах от 0 до 23");
            }
            this.saturdayHour = saturdayHour;
            return this;
        }

        public Builder setSaturdayHour(Integer saturdayHour) {
            if (saturdayHour < 0 || saturdayHour > 23) {
                throw new GLampParamsException("setSaturdayHour", "Параметр saturdayHour должен быть в пределах от 0 до 23");
            }
            this.saturdayHour = saturdayHour.toString();
            return this;
        }

        public Builder setSundayMinute(String sundayMinute) {
            if ( Integer.parseInt(sundayMinute) < 0  || Integer.parseInt(sundayMinute) > 23) throw new GLampParamsException("setSundayMinute", "Параметр sundayMinute должный быть в промежутке от 0 до 23");
            this.sundayMinute = sundayMinute;

            return this;
        }

        public Builder setSundayMinute(Integer sundayMinute) {
            if ( sundayMinute < 0  || sundayMinute > 23) throw new GLampParamsException("setSundayMinute", "Параметр sundayMinute должный быть в промежутке от 0 до 23");
            this.sundayMinute = sundayMinute.toString();

            return this;
        }

        public Builder setMondayMinute(String mondayMinute) {
            if (Integer.parseInt(mondayMinute) < 0 || Integer.parseInt(mondayMinute) > 23) {
                throw new GLampParamsException("setMondayMinute", "Параметр mondayMinute должен быть в промежутке от 0 до 23");
            }
            this.mondayMinute = mondayMinute;
            return this;
        }

        public Builder setMondayMinute(Integer mondayMinute) {
            if (mondayMinute < 0 || mondayMinute > 23) {
                throw new GLampParamsException("setMondayMinute", "Параметр mondayMinute должен быть в промежутке от 0 до 23");
            }
            this.mondayMinute = mondayMinute.toString();
            return this;
        }

        public Builder setTuesdayMinute(String tuesdayMinute) {
            if (Integer.parseInt(tuesdayMinute) < 0 || Integer.parseInt(tuesdayMinute) > 23) {
                throw new GLampParamsException("setTuesdayMinute", "Параметр tuesdayMinute должен быть в промежутке от 0 до 23");
            }
            this.tuesdayMinute = tuesdayMinute;
            return this;
        }

        public Builder setTuesdayMinute(Integer tuesdayMinute) {
            if (tuesdayMinute < 0 || tuesdayMinute > 23) {
                throw new GLampParamsException("setTuesdayMinute", "Параметр tuesdayMinute должен быть в промежутке от 0 до 23");
            }
            this.tuesdayMinute = tuesdayMinute.toString();
            return this;
        }

        public Builder setWednesdayMinute(String wednesdayMinute) {
            if (Integer.parseInt(wednesdayMinute) < 0 || Integer.parseInt(wednesdayMinute) > 23) {
                throw new GLampParamsException("setWednesdayMinute", "Параметр wednesdayMinute должен быть в промежутке от 0 до 23");
            }
            this.wednesdayMinute = wednesdayMinute;
            return this;
        }

        public Builder setWednesdayMinute(Integer wednesdayMinute) {
            if (wednesdayMinute < 0 || wednesdayMinute > 23) {
                throw new GLampParamsException("setWednesdayMinute", "Параметр wednesdayMinute должен быть в промежутке от 0 до 23");
            }
            this.wednesdayMinute = wednesdayMinute.toString();
            return this;
        }

        public Builder setThursdayMinute(String thursdayMinute) {
            if (Integer.parseInt(thursdayMinute) < 0 || Integer.parseInt(thursdayMinute) > 23) {
                throw new GLampParamsException("setThursdayMinute", "Параметр thursdayMinute должен быть в промежутке от 0 до 23");
            }
            this.thursdayMinute = thursdayMinute;
            return this;
        }

        public Builder setThursdayMinute(Integer thursdayMinute) {
            if (thursdayMinute < 0 || thursdayMinute > 23) {
                throw new GLampParamsException("setThursdayMinute", "Параметр thursdayMinute должен быть в промежутке от 0 до 23");
            }
            this.thursdayMinute = thursdayMinute.toString();
            return this;
        }

        public Builder setFridayMinute(String fridayMinute) {
            if (Integer.parseInt(fridayMinute) < 0 || Integer.parseInt(fridayMinute) > 23) {
                throw new GLampParamsException("setFridayMinute", "Параметр fridayMinute должен быть в промежутке от 0 до 23");
            }
            this.fridayMinute = fridayMinute;
            return this;
        }

        public Builder setFridayMinute(Integer fridayMinute) {
            if (fridayMinute < 0 || fridayMinute > 23) {
                throw new GLampParamsException("setFridayMinute", "Параметр fridayMinute должен быть в промежутке от 0 до 23");
            }
            this.fridayMinute = fridayMinute.toString();
            return this;
        }

        public Builder setSaturdayMinute(String saturdayMinute) {
            if (Integer.parseInt(saturdayMinute) < 0 || Integer.parseInt(saturdayMinute) > 23) {
                throw new GLampParamsException("setSaturdayMinute", "Параметр saturdayMinute должен быть в промежутке от 0 до 23");
            }
            this.saturdayMinute = saturdayMinute;
            return this;
        }

        public Builder setSaturdayMinute(Integer saturdayMinute) {
            if (saturdayMinute < 0 || saturdayMinute > 23) {
                throw new GLampParamsException("setSaturdayMinute", "Параметр saturdayMinute должен быть в промежутке от 0 до 23");
            }
            this.saturdayMinute = saturdayMinute.toString();
            return this;
        }

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

        public Builder setMinutesBeforeDawn(String minutesBeforeDawn) {
            if (Integer.parseInt(minutesBeforeDawn) != 1) {
                if (Integer.parseInt(minutesBeforeDawn) < 0 || Integer.parseInt(minutesBeforeDawn) > 60 || Integer.parseInt(minutesBeforeDawn) % 5 != 0) throw new GLampParamsException("setMinutesBeforeDawn", "Параметр minutesBeforeDawn должен быть 5,10,15,20,25,30,40,50,60");
            }
            this.minutesBeforeDawn = minutesBeforeDawn;

            return this;
        }

        public Builder setMinutesBeforeDawn(Integer minutesBeforeDawn) {
            if (minutesBeforeDawn != 1) {
                if (minutesBeforeDawn < 0 || minutesBeforeDawn > 60 || minutesBeforeDawn % 5 != 0) throw new GLampParamsException("setMinutesBeforeDawn", "Параметр minutesBeforeDawn должен быть 5,10,15,20,25,30,40,50,60");

            }
            this.minutesBeforeDawn = minutesBeforeDawn.toString();

            return this;
        }

        public GLampDawn build(){
            return new GLampDawn(sundayStatus, mondayStatus, tuesdayStatus,
                    wednesdayStatus, thursdayStatus, fridayStatus,
                    saturdayStatus, sundayHour, mondayHour,
                    tuesdayHour, wednesdayHour, thursdayHour,
                    fridayHour, saturdayHour, sundayMinute,
                    mondayMinute, tuesdayMinute, wednesdayMinute,
                    thursdayMinute, fridayMinute, saturdayMinute,
                    brightness, minutesBeforeDawn);
        }
    }

    public static GLampDawn buildFromResponse(String response){
        String[] r = response.split(",");

        GLampDawn.Builder dawn = new GLampDawn.Builder();

        dawn.setSundayStatus(r[2]);
        dawn.setMondayStatus(r[3]);
        dawn.setTuesdayStatus(r[4]);
        dawn.setWednesdayStatus(r[5]);
        dawn.setThursdayStatus(r[6]);
        dawn.setFridayStatus(r[7]);
        dawn.setSaturdayStatus(r[8]);

        dawn.setSundayHour(r[9]);
        dawn.setMondayHour(r[10]);
        dawn.setTuesdayHour(r[11]);
        dawn.setWednesdayHour(r[12]);
        dawn.setThursdayHour(r[13]);
        dawn.setFridayHour(r[14]);
        dawn.setSaturdayHour(r[15]);

        dawn.setSundayMinute(r[16]);
        dawn.setMondayMinute(r[17]);
        dawn.setTuesdayMinute(r[18]);
        dawn.setWednesdayMinute(r[19]);
        dawn.setThursdayMinute(r[20]);
        dawn.setFridayMinute(r[21]);
        dawn.setSaturdayMinute(r[22]);

        dawn.setBrightness(r[23]);
        dawn.setMinutesBeforeDawn(r[24]);

        return dawn.build();
    }
}

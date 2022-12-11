package org.example;



    public class Radio {
        private int currentStationNumber;
        private int currentVolume;
        private int maxStation = 9;
        private int maxVolume = 100;

        public Radio(int minStation) {

        }


        public int getMaxVolume() {
            return maxVolume;
        }

        public int getMaxStation() {
            return maxStation;
        }




        public Radio(int maxVolume, int maxStation) {
            this.maxVolume = maxVolume;
            this.maxStation = maxStation;

        }


        public int getCurrentStationNumber() {
            return currentStationNumber;
        }

        public void setCurrentStationNumber(int currentStationNumber) {
            if (currentStationNumber < 0) {
                return;
            }
            if (currentStationNumber > maxStation) {
                return;
            }
            this.currentStationNumber = currentStationNumber;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentVolume(int currentVolume) {
            if (currentVolume < 0) {
                return;
            }
            if (currentVolume > maxVolume) {
                return;
            }

            this.currentVolume = currentVolume;
        }

        public void next() {

            if (currentStationNumber != maxStation) {
                currentStationNumber++;
            } else {
                currentStationNumber = 0;
            }
        }

        public void prev() {
            if (currentStationNumber != 0) {
                currentStationNumber++;
            } else {
                currentStationNumber = maxStation;
            }
        }

        public void plus() {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
            } else {
                return;
            }
        }

        public void minus() {
            if (currentVolume  > 0) {
                currentVolume = currentVolume - 1;
            } else {
                return;
            }
        }
}

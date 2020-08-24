package com.example.oopjava;

public class Boxer extends Fighter {


   private static int stamina = 59;

   public Boxer(int numberOfGloves, int punchSpeed, int punchPower) {

       super(numberOfGloves, punchSpeed, punchPower);

       if (numberOfGloves <= 0 || punchSpeed <= 0 || punchPower <= 0) {
           return;
       }

       setNumberOfGloves(numberOfGloves);
       setPunchSpeed(punchSpeed);
       setPunchPower(punchPower);

   }

    public static int getStamina() {
        return stamina;
    }

    public static void setStamina(int stamina) {
        Boxer.stamina = stamina;
    }

    public String throwJab() {

       return "Jab";
    }

    public String throwUpperCut() {
       return "UpperCut";
    }

    @Override
    public void setPunchSpeed(int punchSpeed) {
        super.setPunchSpeed(punchSpeed);
    }
}

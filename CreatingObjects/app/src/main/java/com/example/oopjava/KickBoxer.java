package com.example.oopjava;

public class KickBoxer extends Boxer {

     private int kickSpeed = 50;
     private int kickPower = 70;


     public KickBoxer(int numberOfGloves, int kickSpeed, int kickPower, int punchSpeed, int punchPower) {
          super(numberOfGloves,punchSpeed, punchPower);
          if (kickSpeed <= 0 || kickPower <= 0 || punchSpeed <= 0 || punchPower <= 0) {
               return;
          }
          this.kickSpeed = kickSpeed;
          this.kickPower = kickPower;
          setPunchSpeed(punchSpeed);
          setPunchPower(punchPower);
     }

     public int getKickSpeed() {
          return kickSpeed;
     }

     public void setKickSpeed(int kickSpeed) {
          this.kickSpeed = kickSpeed;
     }

     public int getKickPower() {
          return kickPower;
     }

     public void setKickPower(int kickPower) {
          this.kickPower = kickPower;
     }

}

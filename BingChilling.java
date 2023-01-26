package Oezden_Mirhan;
import robocode.*;



public class BingChilling extends JuniorRobot
{
		int DistanceToNorth = 0;
		int DistanceToEast = 90;
		int DistanceToWest = 270;
		int DistanceToSouth = 180;
	public void run() {
	
	
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(black, blue, white, white, black);
	
		int heightdistance = fieldHeight - robotY;		//Go to the corners
		int widthdistance = fieldWidth - robotX;
		turnTo(DistanceToNorth);
		ahead(heightdistance);
		turnTo(DistanceToEast);
		ahead(widthdistance);

			while(true) {
			
			turnGunRight(90); //look for the enemy
			
			

			turnTo(DistanceToNorth); //always move so you are a difficult target.
			ahead(fieldHeight);
			out.println("up");
			
			turnTo(DistanceToWest);
			ahead(fieldWidth);
			out.println("left");
			
			turnTo(DistanceToSouth);
			ahead(fieldHeight);
			out.println("down");
			
			turnTo(DistanceToEast);
			ahead(fieldWidth);
			out.println("right");
		}
	}


	

	public void onScannedRobot() {
	turnGunTo(scannedAngle);
	fire(2); //Fire at the enemy
	}

 	public void onHitByBullet() {
	out.print("ouch that hurts");
        
    }
	
	
	public void onHitWall() {
	 out.print ("Ouch that hurts");
	}	
}

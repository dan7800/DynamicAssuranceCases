import gov.nasa.jpf.symbc.Debug;
public class MainClass {
	 /*
    	argument 1 => energyLevel
    	argument 2 => distance between 2 cars (in secs)
	 */
	public static void main(String[] args) {
	    int speed = drive(80,4);
//	    System.out.println(speed);
	    Debug.printPC("");
	}
	
	private static int drive(int energyLevel, int distanceInFront) {
	    if (energyLevel >= 80) {
	        if (distanceInFront > 2 && distanceInFront < 6) {
	            return driveNormalSpeed();
	        }
	
	        return driveFaster();
	    } else if (energyLevel >= 50) {
	        if (distanceInFront < 3) {
	            return driveSlow();
	        }
	
	        return driveNormalSpeed();
	    } else if (energyLevel > 20) {
	        if (distanceInFront < 2) {
	            return parkIt();
	        }
	
	        return driveSlow();
	    }
	
	    return parkIt();
	}
	
	private static int parkIt() {
	    return 0;
	}
	
	private static int driveSlow() {
	    return (int) (10 + Math.random() * 25);
	}
	
	private static int driveNormalSpeed() {
	    return (int) (35 + Math.random() * 20);
	}
	
	private static int driveFaster() {
	    return (int) (55 + Math.random() * 30);
	}
}

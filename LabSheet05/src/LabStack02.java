import java.util.Stack;


public class LabStack02 {

    public static void main(String[] args) {
        
        int[] trainCars = {1, 2, 3, 4, 5};

        
        Stack<Integer> deadEndTrack = new Stack<>();

        
        for (int i = 0; i < trainCars.length; i++) {
            deadEndTrack.push(trainCars[i]);
            System.out.println("Push in track : " + trainCars[i]);
        }
        System.out.println("Train car after into dead-end track : " + deadEndTrack);

        System.out.println();

        
        while (!deadEndTrack.isEmpty()) {
            int car = deadEndTrack.pop();
            System.out.println("Pop from track : " + car);
        }
        System.out.println("Train car after out of dead-end track : " + deadEndTrack);
    }
}
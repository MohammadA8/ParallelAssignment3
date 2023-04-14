import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class MarsTenMinuteSlot
{

    PriorityQueue<Integer> minTemp;
    PriorityQueue<Integer> maxTemp;

    public MarsTenMinuteSlot()
    {

        minTemp = new PriorityQueue<>();
        maxTemp = new PriorityQueue<>(Collections.reverseOrder());

    }

    public void addToMax(int temp)
    {
        
        synchronized(maxTemp){

            maxTemp.add(temp);

        }

    }

    public void addToMin(int temp)
    {
        
        synchronized(minTemp){

            minTemp.add(temp);

        }

    }

}

public class Temperature {
    
    public static void main(String[] args)
    {
        int hour = 0;
        while (hour < 24){
            

            MarsTenMinuteSlot[] tenMinIntervals = new MarsTenMinuteSlot[6];
            
            for (int i = 0; i < 6; i++)
                tenMinIntervals[i] = new MarsTenMinuteSlot();

            Thread thread1 = new Thread () {
                public void run () {

                    Random rand = new Random();

                    try {
                        int temp = rand.nextInt(170) - 70;
                        tenMinIntervals[0].addToMax(temp);
                        tenMinIntervals[0].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[1].addToMax(temp);
                        tenMinIntervals[1].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[2].addToMax(temp);
                        tenMinIntervals[2].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[3].addToMax(temp);
                        tenMinIntervals[3].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[4].addToMax(temp);
                        tenMinIntervals[4].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[5].addToMax(temp);
                        tenMinIntervals[5].addToMin(temp);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
              };
              Thread thread2 = new Thread () {
                public void run () {

                    Random rand = new Random();

                    try {
                        int temp = rand.nextInt(170) - 70;
                        tenMinIntervals[0].addToMax(temp);
                        tenMinIntervals[0].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[1].addToMax(temp);
                        tenMinIntervals[1].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[2].addToMax(temp);
                        tenMinIntervals[2].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[3].addToMax(temp);
                        tenMinIntervals[3].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[4].addToMax(temp);
                        tenMinIntervals[4].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[5].addToMax(temp);
                        tenMinIntervals[5].addToMin(temp);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
              };
              Thread thread3 = new Thread () {
                public void run () {

                    Random rand = new Random();

                    try {
                        int temp = rand.nextInt(170) - 70;
                        tenMinIntervals[0].addToMax(temp);
                        tenMinIntervals[0].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[1].addToMax(temp);
                        tenMinIntervals[1].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[2].addToMax(temp);
                        tenMinIntervals[2].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[3].addToMax(temp);
                        tenMinIntervals[3].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[4].addToMax(temp);
                        tenMinIntervals[4].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[5].addToMax(temp);
                        tenMinIntervals[5].addToMin(temp);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
              };
              Thread thread4 = new Thread () {
                public void run () {

                    Random rand = new Random();

                    try {
                        int temp = rand.nextInt(170) - 70;
                        tenMinIntervals[0].addToMax(temp);
                        tenMinIntervals[0].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[1].addToMax(temp);
                        tenMinIntervals[1].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[2].addToMax(temp);
                        tenMinIntervals[2].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[3].addToMax(temp);
                        tenMinIntervals[3].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[4].addToMax(temp);
                        tenMinIntervals[4].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[5].addToMax(temp);
                        tenMinIntervals[5].addToMin(temp);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
              };
              Thread thread5 = new Thread () {
                public void run () {

                    Random rand = new Random();

                    try {
                        int temp = rand.nextInt(170) - 70;
                        tenMinIntervals[0].addToMax(temp);
                        tenMinIntervals[0].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[1].addToMax(temp);
                        tenMinIntervals[1].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[2].addToMax(temp);
                        tenMinIntervals[2].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[3].addToMax(temp);
                        tenMinIntervals[3].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[4].addToMax(temp);
                        tenMinIntervals[4].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[5].addToMax(temp);
                        tenMinIntervals[5].addToMin(temp);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
              };
              Thread thread6 = new Thread () {
                public void run () {

                    Random rand = new Random();

                    try {
                        int temp = rand.nextInt(170) - 70;
                        tenMinIntervals[0].addToMax(temp);
                        tenMinIntervals[0].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[1].addToMax(temp);
                        tenMinIntervals[1].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[2].addToMax(temp);
                        tenMinIntervals[2].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[3].addToMax(temp);
                        tenMinIntervals[3].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[4].addToMax(temp);
                        tenMinIntervals[4].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[5].addToMax(temp);
                        tenMinIntervals[5].addToMin(temp);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
              };
              Thread thread7 = new Thread () {
                public void run () {

                    Random rand = new Random();

                    try {
                        int temp = rand.nextInt(170) - 70;
                        tenMinIntervals[0].addToMax(temp);
                        tenMinIntervals[0].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[1].addToMax(temp);
                        tenMinIntervals[1].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[2].addToMax(temp);
                        tenMinIntervals[2].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[3].addToMax(temp);
                        tenMinIntervals[3].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[4].addToMax(temp);
                        tenMinIntervals[4].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[5].addToMax(temp);
                        tenMinIntervals[5].addToMin(temp);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
              };
              Thread thread8 = new Thread () {
                public void run () {

                    Random rand = new Random();

                    try {
                        int temp = rand.nextInt(170) - 70;
                        tenMinIntervals[0].addToMax(temp);
                        tenMinIntervals[0].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[1].addToMax(temp);
                        tenMinIntervals[1].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[2].addToMax(temp);
                        tenMinIntervals[2].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[3].addToMax(temp);
                        tenMinIntervals[3].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[4].addToMax(temp);
                        tenMinIntervals[4].addToMin(temp);
                        TimeUnit.SECONDS.sleep(1);

                        temp = rand.nextInt(170) - 70;
                        tenMinIntervals[5].addToMax(temp);
                        tenMinIntervals[5].addToMin(temp);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
              };

              thread1.start();
              thread2.start();
              thread3.start();
              thread4.start();
              thread5.start();
              thread6.start();
              thread7.start();
              thread8.start();

        
            try {
                thread1.join();
                thread2.join();
                thread3.join();
                thread4.join();
                thread5.join();
                thread6.join();
                thread7.join();
                thread8.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("\n\nResults for hour number " + hour);


            int biggestTempDifference = Integer.MIN_VALUE;
            int biggestDifferenceIntereval = 0;


            for (int i = 0; i < 6; i++)
            {
                int maxTemp = Integer.MIN_VALUE;
                int minTemp = Integer.MAX_VALUE;

                System.out.println("\nHighest 5 temperatures for 10-minutes interval " + (i + 1) + ":");
                for (int j = 0; j < 5; j++)
                {
                    int temp = tenMinIntervals[i].maxTemp.remove();
                    System.out.print(" (" + temp + ") ");
                    maxTemp = Integer.max(maxTemp, temp);
                }
                    System.out.println("\nLowest 5 temperatures for 10-minutes interval " + (i + 1) + ":");
                for (int j = 0; j < 5; j++)
                {
                    int temp = tenMinIntervals[i].minTemp.remove();
                    System.out.print(" (" + temp + ") ");
                    minTemp = Integer.max(minTemp, temp);
                }

                int tempDifference = maxTemp - minTemp;
                biggestTempDifference = Integer.max(tempDifference, biggestTempDifference);
                if (tempDifference == biggestTempDifference)
                    biggestDifferenceIntereval = i;

            }

            System.out.println();
            System.out.println("The 10-minute interval with the largest temperature differennce is " + (biggestDifferenceIntereval + 1));


            hour++;
        }


    }

}

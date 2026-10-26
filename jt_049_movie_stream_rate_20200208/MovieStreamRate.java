// MovieStreamRate.java
//
// MS = 6 GB: movie size in GB --> MB = GB * 1024 --> Mb = MB * 8 --> MS = 6 * 1024 * 8[Mbit]
// timem = 90 min: duration in minutes --> times = timem * 60 [sec]
// 
// rate =       (MS * 1024 * 8) / (timem * 60)
// [Mbit/sec] = [Mbit]          / [sec] 
// 
// source: https://entertainment.howstuffworks.com/fast-internet-connection-for-streaming-hd-movies1.htm
// 

// v1.0.0   20200207/en (ORIGINAL)
// v1.0.1   20200207/d


public class MovieStreamRate {

    public static void main(String[] args) {

        MovieStreamRate msr = new MovieStreamRate();
        double myMS = 1.0;
        double mytimem = 1.0;
        
        if (args.length == 0) {
            showAll();
        
        } else if (args.length == 1) {
            if (args[0].equals("h")) {
                usage(msr);
                System.exit(0);
            } else {
                usage(msr);
                System.exit(1);
            }
            

        } else if (args.length == 2) {

            String arg1 = args[0];
            String arg2 = args[1];
            try {
                myMS = Double.valueOf(arg1);
                mytimem = Double.valueOf(arg2);
                System.out.println("Custom parameters calculation:");
                rate(myMS, mytimem);

            } catch(NumberFormatException nfe) {
                System.out.println("Wrong parameters type!");
                usage(msr);
                System.exit(1);
            }

        } else {
            System.out.println("Wrong number of parameters!");
            System.out.print("Usage!");
            // usage(msr);
            System.exit(1);
        }

    } // end main

    public static void rate(double size, double minutes) {
        double rate = (size * 1024 * 8) / (minutes * 60);
        String line = String.format("\nMovie size: %.3f GB\n" +
            "Dration:    %.0f min.\n" +
            "Rate:       %.3f Mbit/s\n", size, minutes, rate);
        System.out.print(line);
    }


    public static void usage(Object ob) {
        String longLine = "\tUsage:\n\t" + "$> java " + ob.getClass().getName() + " [movies size in GB] [duration in minutes]\n";
        String line2 = "\tOR:\n\t" + "$> java " + ob.getClass().getName() + " [h]\t-- for help (this message)\n";
        int numc = longLine.length();
        String crta = "=".repeat(numc);

        System.out.println(crta);
        System.out.print(longLine);
        System.out.print(line2);
        System.out.print("\n" + "\tIf NO parameters: test print.\n");
        System.out.println(crta);
    }

    public static void showAll() {
        rate(6, 60);
        rate(2.8, 120);
        rate(4.2,120);

        System.out.println("101 minutes -- average movie length");
        rate(4.2, 101);

        System.out.println("average BlueRay 120 min movie = 15 - 25 GB");
        for (int i = 10; i < 26; i += 5) {
            rate(i, 120);
        }

        System.out.println("average HD 720p 101 min movie = 0.8 - 1.4 GB");
        double sizes[] = {0.80, 1.2, 1.4};
        for (double size : sizes) {
            rate(size, 101);
        }

    }

} // end class
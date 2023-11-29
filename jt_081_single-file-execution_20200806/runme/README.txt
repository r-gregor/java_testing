# JAVA 11 or later !!
# 1 - runing a *.java file directly with java command:
$> gregor.redelonghi@cygwin-en [/home/gregor.redelonghi/JAVA_en_testing/jn081_single-file-execution_20200806/runme]
$> java RunMe.java
Calling in from Source ...
Success!!

# 2 - running a java file as script (NO EXTENSION!):
$> gregor.redelonghi@cygwin-en [/home/gregor.redelonghi/JAVA_en_testing/jn081_single-file-execution_20200806/runme]
$> ./RunMeAsScript
Calling in from Source ...
Success!!

==============================================================================================================
$> gregor.redelonghi@cygwin-en [/home/gregor.redelonghi/JAVA_en_testing/jn081_single-file-execution_20200806/runme]
$> cat RunMe.java
package runme;

public class RunMe {
    public static void main(final String[] args) {
        Source srs = new Source();
        srs.printMe();
        System.out.println("Success!!");
    }
}

class Source {
    public void printMe() {
        System.out.println("Calling in from Source ...");
    }
}

==============================================================================================================
$> gregor.redelonghi@cygwin-en [/home/gregor.redelonghi/JAVA_en_testing/jn081_single-file-execution_20200806/runme]
$> cat RunMeAsScript
#! /usr/bin/java --source 11
package runme;

public class RunMeAsScript {
    public static void main(final String[] args) {
        Source srs = new Source();
        srs.printMe();
        System.out.println("Success!!");
    }
}

class Source {
    public void printMe() {
        System.out.println("Calling in from Source ...");
    }
}

==============================================================================================================
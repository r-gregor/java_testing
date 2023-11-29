// 20181014:	V1;
//

import java.util.*;

public class StDelovnihUr_V1 {

	private String getUsageString() {
		String usage1;
		String usage2;

		usage1 = "USAGE:\tprogramm-name [month name] [day in a week]";
		usage2 = "\n "+
		"\t- month name in SLO: januar, februar, marec, ..., December (any Case)\n" +
		"\t- day in a week must be a number:\n" +
		"\t	1 - Monday\n" +
		"\t	2 - Tuesday\n" +
		"\t	...\n" +
		"\t	7 - Sunday\n" +
		"\n" +
		"\tIf no argument supplied:\n" +
		"\t- month = januar\n" +
		"\t- day in a week = 1 (Monday)\n";

		String usage = usage1 + usage2;
		return usage;
	}

	//MAIN -----------------------------------
	public static void main(String[] args) {

		System.out.printf("%s -- Starting ...\n", Tms.tms());
		StDelovnihUr_V1 obj = new StDelovnihUr_V1();
		GetDateAsString dts = new GetDateAsString();
		String crdtm = dts.getDateTimeAsString();
		String usage = obj.getUsageString();

		System.out.printf("%n%s%n%s", crdtm, usage);

	} //END MAIN

} //END CLASS

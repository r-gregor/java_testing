import java.util.*;
import java.io.*;

class GetCurDir {
	public static void main(String[] args) {
		String curdir = System.getProperty("user.dir").toString();
		System.out.printf("The current working directory: %s.%n", curdir);
	}



}
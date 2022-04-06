/*
 *	Practical Test #2 IB Computer Science MDV: Arrays, statistics
 */
import java.util.*;
import java.io.*;

public class ArrayTest
{
	// Array size:
	public static int size(double[] array)
	{
		int size = 0;
		size = array.length;// modify
		return size;
	}
	//------------------------------------------------------------------

	public static double min(double[] array)
	{
		double min = array[0];
		for(int i = 0; i < array.length; i++){
			if( array[i] < min){
				min = array[i];
			}
		}
		return min;
	}
	//------------------------------------------------------------------
	
	public static double max(double[] array)
	{
		double max = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	}
	//------------------------------------------------------------------
	public static double secmax(double[] array, double max){
		double secmax = array[0];
		/*double max2 = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] > max2){
				max2 = array[i];
			}
		}*/
		for(int i = 0; i < array.length; i++){
			if(array[i] == max){
				secmax = secmax;
			}	
			else{
				if(array[i] > secmax){
					secmax = array[i];
				}
			}
		}
		return secmax;
		}
	//------------------------------------------------------------------

	public static double range(double[] array)
	{
		double range = 0; 
		range = max(array) - min(array);
		return range;
	}
	//------------------------------------------------------------------

	public static double average(double[] array)
	{
		double average = 0;
		double total = 0;
		for(int i = 0; i < array.length; i++){
			total = array[i] + total;
			average = total/array.length;
		}
		return average;
	}
	//------------------------------------------------------------------

	public static double median(double[] array)
	{
		double median = 0;
		Arrays.sort(array);
		int len = array.length;
		int mid = len/2;
		if(len % 2 == 0){
			median = (array[mid-1] + array[mid])/2;
		}
			else{
				median = array[mid];
			}
		return median;
	}
	//------------------------------------------------------------------

	public static double mode(double[] array)
	{
		double mode = 0;
		double maxfreq = 0;
		int modeindex = -1;
		for(int i = 0; i < array.length; i++)
		{	int frequency = 0;
			for( int j = 0; j < array.length; j++)
			{	if( array[i] == array[j] )
				{	frequency++;
				}
			}
			if( frequency > maxfreq )
			{	maxfreq   = frequency;
				modeindex = i;
			}
		}
		if( modeindex != -1 )			// (single mode found)
		{	mode = array[modeindex];
		} else {	// otherwise, -1 will be returned => mode not found
			mode = modeindex;
		}
		return mode;
	}
	//------------------------------------------------------------------
	//------------------------------------------------------------------

	public static void main (String args[]) throws IOException
	{
		System.out.println("\n*** Statistical Analysis of Data Sets ***\n");
		System.out.println("Marcos Drien");
		double rainfall[]    = load("rainfall.txt");	// load data from files
		double temperature[] = load("temperature.txt"); // into arrays

		System.out.println( "\nSingapore Rainfall Statistics" );
		System.out.println( "Measurements    : " + size(rainfall) );
		System.out.printf( "Minimum   (0.20): %.2f\n", min(rainfall) );
		System.out.printf( "Maximum (765.90): %.2f\n", max(rainfall) );
		System.out.printf( "Second maximum(idk): %.2f\n", secmax(rainfall, max(rainfall)) );
		System.out.printf( "Range   (765.70): %.2f\n", range(rainfall) );
		System.out.printf( "Average (178.89): %.2f\n", average(rainfall) );
		System.out.printf( "Mode    (127.20): %.2f\n", mode(rainfall) );
		System.out.printf( "Median  (159.70): %.2f\n", median(rainfall) );

		System.out.println( "\nSingapore Temperature Statistics" );
		System.out.println( "Measurements   : " + size(temperature) );
		System.out.printf( "Minimum (25.40): %.2f\n", min(temperature) );
		System.out.printf( "Maximum (29.50): %.2f\n", max(temperature) );
		System.out.printf( "Second maximum(idk): %.2f\n", secmax(temperature, max(temperature)) );
		System.out.printf( "Range    (4.10): %.2f\n", range(temperature) );
		System.out.printf( "Average (27.63): %.2f\n", average(temperature) );
		System.out.printf( "Mode    (27.30): %.2f\n", mode(temperature) );
		System.out.printf( "Median  (27.70): %.2f\n", median(temperature) );

		System.out.println();
	}

	//------------------------------------------
	//- DO NOT MODIFY THE CODE BELOW THIS LINE -
	//------------------------------------------

    public static double[] load(String fileName) throws IOException
    {
        //System.out.println("<<< Loading data >>>");
        File file = new File(fileName);
        if (!file.exists())
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return null;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		double[] data = new double[countLines(fileName)];
		while ( br.ready() )
		{
            temp = br.readLine();
            data[count] = Double.parseDouble(temp);
            count++;
        }
        br.close();
        System.out.println(fileName + " file loaded.");// optional
        return data;
    }

    public static int countLines(String fileName) throws IOException
    {
        File file = new File(fileName);
        if ( !file.exists() )
        {
            System.out.println("ERROR - Data file not found. Download the file again.");
            return 0;
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr); //read mode
        String temp;
        int count = 0;
		while ( br.ready() )
		{
			temp = br.readLine();
            count++;
        }
        br.close();
        return count;
    }


}



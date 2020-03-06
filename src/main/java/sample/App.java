package sample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Branch b = new Branch();

      b.loadDefaultBranchPressureDifferenceMeasurements();
      
      b.printMeasurements();

    }
}

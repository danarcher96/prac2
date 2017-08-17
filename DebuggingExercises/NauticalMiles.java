public class NauticalMiles
{
    public static void main(String[] args)
    {
        double miles = 1.150779;
        double kilometers = 1.852;
        double nauticalMiles = 20;
        double convertMiles = nauticalMiles * miles;
        double convertKilometers = nauticalMiles * kilometers;
        System.out.println(nauticalMiles + " nautical miles is " + convertKilometers + " k/m and " + convertMiles + " miles.");



    }
}

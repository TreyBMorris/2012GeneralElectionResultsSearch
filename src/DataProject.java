import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DataProject
{
    public static void main(String[] args) 
    {
        
        DataSource electionResults = DataSource.connect("lib/us-election-2012-results-by-county - us-election-2012-results-by-county.csv");
        electionResults.load();

        ArrayList<Results> results = electionResults.fetchList("Results","FirstName","LastName","Party","CountyName","StateCode","Votes");
       

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a County name (First Letter Needs to Be Capitalized): ");
        String county = sc.next();
        System.out.println("Enter a State abbreviation(CAPITALIZED): ");
        String state = sc.next();
        System.out.println("Election Results in " + county);
        for (Results el : results) 
        {
            if (el.isLocatedInCounty(county))
            {
                if (el.isLocatedInState(state))
                {
                    System.out.println(el.getName() +" Representing the " + el.partyAbrev() + " party received " + el.getVoteCount() + " votes in " + el.countyName() +" County, in the state of " + el.stateName() + " in the 2012 election.");
                }

            }
            
        }
    }
}




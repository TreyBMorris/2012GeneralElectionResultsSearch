class Results 
{
    private String firstName;
    private String lastName;
    private String partyAbrev;
    private String countyName;
    private String stateCode;
    private int voteCount;
    private String space = " ";

    Results(String firstName, String lastName, String partyAbrev, String countyName, String stateCode, int voteCount)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.partyAbrev = partyAbrev;
        this.countyName = countyName;
        this.stateCode = stateCode;
        this.voteCount = voteCount;
    }

    
   public String partyAbrev()
    { 
    return partyAbrev;
    }
    public String countyName()
    { 
    return countyName;
    }
    public String stateName()
    { 
    return stateCode;
    }
    public String getName() 
    { 
    return firstName + space + lastName;
    }
 
 
    public boolean isLocatedInCounty(String st) 
    {
    return this.countyName.equals(st);
    }

    public boolean isLocatedInState(String st)
    {
        return this.stateCode.equals(st);
    }

    public int getVoteCount()
    {
        return voteCount;
    }
}

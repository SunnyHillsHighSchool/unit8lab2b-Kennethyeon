public class ProfNames
{
  public int countNames(String[][]nameArray, String lastName)
  {
    int counter = 0;
    for (int r = 0; r < nameArray.length; r++)
    {
      for (int c = 0; c < nameArray[0].length; c++)
      {
          if (nameArray[r][c].substring(0, lastName.length()).equals(lastName))
          {
            counter++;
          }
      }
    }
    return counter;
  }
}
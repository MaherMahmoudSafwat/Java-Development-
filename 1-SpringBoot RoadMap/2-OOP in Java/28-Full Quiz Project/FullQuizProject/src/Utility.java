public interface Utility
{
    default String TabsNumbers(int Number)
    {
      String Tabs = "";
      for(int i=0;i<Number;i++)
      {
          Tabs+="\t";
      }
      return Tabs;
    };
    default boolean IsChoiceValid(String Choice)
    {
        for(int i=0;i<Choice.length();i++)
        {
            if(Integer.valueOf(Choice.charAt(i))>=48 && Integer.valueOf(Choice.charAt(i))<=57)
                continue;
            return false;
        }
        return true;
    }
    default boolean IsChoiceValidWithNegativeSign(String Choice)
    {
        for(int i=0;i<Choice.length();i++)
        {
            if(Integer.valueOf(Choice.charAt(i))>=48 && Integer.valueOf(Choice.charAt(i))<=57)
                continue;
            if(Choice.charAt(i)=='-')
                continue;
            return false;
        }
        return true;
    }
    default void ClearerTheScreen()
    {
        for(int i=0;i<30;i++)
            System.out.println();
    }
}

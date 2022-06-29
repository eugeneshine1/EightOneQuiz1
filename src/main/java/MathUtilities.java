 

public class MathUtilities{
    
  /**
   * Add two number together
   *
   * @param baseValue  first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){
      Integer n = new Integer(baseValue);
      Integer n1 = new Integer(valueToAdd);

      return n+n1;
  }

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){
      Double n = new Double (baseValue);
      Double n1 = new Double(valueToAdd);
      return n+n1;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) {
      Double n = new Double(number);

      return n/2;
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      Integer n = new Integer(number);
      if (n%2 !=0){
          return true;
      }else
      return false;
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      Integer n = new Integer(number);
      return n*n;
  }

}

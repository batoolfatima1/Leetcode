package DesignPatternsInJava.CreationalDesignPattern.AbstractFactory;

/* we went to factory for specfic tooth paste they
 * they went to that specific tooth paste factory to get product
 * then specific factory gives product to intermediate means factry we were asking for in first place
 */

 /* main
  * producer factory where i went  -> 
  * they went to orignal factory
  * get product from orignal fcatory back to the producer
  *  from producer we get product
  */

  /*it factory of factory
   * acts like a kit
   */
public class Main 
{
    public static void main(String[] args) 
    {
        AbstractFactory mainFactory = AbstractFactoryProducer.getProfession(true);
        Profession product = mainFactory.getProfession("doctor");
        product.print();
    }    
}

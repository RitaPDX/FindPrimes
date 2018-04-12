/**
 * Created by ritapdx on 5/16/17.
 */


class clsMath
  {

  private final clsPrimeRslts dlgPrmRslt = new clsPrimeRslts();
  private final clsCalcPrimes clcPrm = new clsCalcPrimes();

  
  public clsMath()
    {
    }
  
    public static boolean isPrime(int number)
    {
    if (number > 1)
      {
      for (int i = 2; i <= number / 2; i++)
        {
        if (number % i == 0)
          {
          return false;
          }
        }
      //System.out.println("This is a Prime Number - " + number);
      return true;
      }
    else
      return false;
    }

  public static void doCalc(int intCnt, int intCat, int intValInit)
    {
    clsCatHelp dlgHlp = new clsCatHelp();
    if (intCat == dlgHlp.intCatTwin)
      {
      clsCalcPrimes.DoDuetsCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatTrip)
      {
      clsCalcPrimes.DoTripletCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatQuad)
      {
      clsCalcPrimes.DoQuadrupletCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatQuin)
      {
      clsCalcPrimes.DoQuintupletCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatSext)
      {
      clsCalcPrimes.DoSextupletCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatCous)
      {
      clsCalcPrimes.DoDuetsCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatSexy) //clsCalcPrimes.
      {
      clsCalcPrimes.DoDuetsCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatSoph)
      {
      clsCalcPrimes.DoDuetsCalc(intCnt, intCat, intValInit);
      // DoSophieCalc(intCnt);
      }
    
    else if (intCat == dlgHlp.intCatCunn) //clsCalcPrimes.
      {
      clsCalcPrimes.DoCunninghamCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatSafe) //clsCalcPrimes.
      {
      clsCalcPrimes.DoSafeCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatBaln) //clsCalcPrimes.
      {
      clsCalcPrimes.DoBalancedCalc(intCnt, intCat, intValInit);
      }
    
    else if (intCat == dlgHlp.intCatRglr) //clsCalcPrimes.
      {
      clsCalcPrimes.GetReqPrimesCalc(intCnt, intCat, intValInit);
      }
    
 /*   else if (intCat == dlgHlp.intCatBitw) //clsCalcPrimes.
      {
      //clsCalcPrimes.
      }
    
    else if (intCat == dlgHlp.intCatArpr) //clsCalcPrimes.
      {
      //clsCalcPrimes.
      }*/
    else
      {
      //  Big Fookin' ERROR;
      }
    }
  }


import java.util.ArrayList;

import static java.lang.System.out;

/**
 * Created by ritapdx on 5/21/17.
 */

class clsCalcPrimes
  {
  
  
  // create an array list
  public static final ArrayList<String> lstRslts;
  private static final clsCatHelp dlgHlp = new clsCatHelp();
  private static final clsPrimeRslts dlgPrmRslt = new clsPrimeRslts();
  private static final clsFindPrimeNumbers dlgPrimes = new clsFindPrimeNumbers();
  
  static
    {
    lstRslts = new ArrayList<>();
    }
  
  public clsCalcPrimes()
    {
    lstRslts.clear();
    dlgPrmRslt.txtPrmRslt.setText("");
    }
  
  /*
      DoTally
      Rita Beigh
      Adds a string of some content to
      the lstRslts ArrayList
   */
  
  private static void DoTally(String strIn)
    {
    clsCalcPrimes.lstRslts.add(strIn);
    }

  /*
      strSetCat
      Rita Beigh
      Returns a string that is used to
      identify the category of primes
      in the output dialog
   */
  
  private static String strSetCat(int intCat)
    {
    String strCat = "";
    if (intCat == dlgHlp.intCatTwin)
      {
      strCat = "Twin";
      }
    else if (intCat == dlgHlp.intCatCous)
      {
      strCat = "Cousin";
      }
    else if (intCat == dlgHlp.intCatSexy)
      {
      strCat = "Sexy";
      }
    else if (intCat == dlgHlp.intCatSoph)
      {
      strCat = "Sophie Germaine";
      }
    else if (intCat == dlgHlp.intCatTrip)
      {
      strCat = "Triplet";
      }
    else if (intCat == dlgHlp.intCatQuad)
      {
      strCat = "Quadruplet";
      }
    else if (intCat == dlgHlp.intCatQuin)
      {
      strCat = "Quintuplet";
      }
    else if (intCat == dlgHlp.intCatSext)
      {
      strCat = "Sextuplet";
      }
    else if (intCat == dlgHlp.intCatCunn)
      {
      strCat = "Cunningham Chain";
      }
    else if (intCat == dlgHlp.intCatSafe)
      {
      strCat = "Safe";
      }
    else if (intCat == dlgHlp.intCatBaln)
      {
      strCat = "Balanced";
      }
    return strCat;
    }
  
  /*
      ShowReport
      Rita Beigh
      Opens a dialog that shows the resulting
      Prime numbers found
   */
  
  private static void ShowReport(String strCat, int intCount)
    {
    for (int i = 0; i < intCount; i++)
      {
      dlgPrmRslt.txtPrmRslt.append(String.format("%s", lstRslts.get(i)));
      }
    dlgPrmRslt.txtPrmRslt.append(String.format("\n\nTotal number of %s Primes: %s\n", strCat, String.valueOf(intCount)));
    dlgPrmRslt.OpenDlg();
    }
  
  /*
   
   */
  
  public static void DoDuetsCalc(int intCount, int intCat, int intValInit)
    {
    int i;
    int p;
    int b = 0;
    int Count = 0;
    String strTwin = "Twin";
    String strCous = "Cousin";
    String strSexy = "Sexy";
    String strSophieG = "Sophie Germaine";
    String strCat = strSetCat(intCat);
    
    lstRslts.clear();
    dlgPrmRslt.txtPrmRslt.setText("");
    lstRslts.clear();
    
    for (i = 0, p = intValInit; i < intCount; p++)
      {
      if (strCat.equalsIgnoreCase(strTwin))
        {
        b = p + 2;
        }
      else if (strCat.equalsIgnoreCase(strCous))
        {
        b = p + 4;
        }
      else if (strCat.equalsIgnoreCase(strSexy))
        {
        b = p + 6;
        }
      else if (strCat.equalsIgnoreCase(strSophieG))
        {
        b = (2 * p) + 1;
        }
      if (clsMath.isPrime(p) && clsMath.isPrime(b))
        {
        String strP = String.valueOf(p);
        String strB = String.valueOf(b);
        out.println("(" + strP + ", " + strB + ")");
        if ((i < intCount) && (i != intCount - 1))
          {
          // end each pair with a close pare, a comma, and a space
          DoTally("(" + strP + ",  " + strB + "),  ");
          }
        else if (i == intCount - 1)
          {
          // The last pair found: no comma
          DoTally("(" + strP + ",  " + strB + ")");
          }
        Count++;
        i++;
        }
      }
    out.printf("Total number of %s Primes: %d%n", strCat, Count);
    ShowReport(strCat, Count);
    }
  
  
  public static void DoTripletCalc(int intCount, int intCat, int intValInit)
    {
    int i, p, b, c, d;
    int Count = 0;
    String strCat = strSetCat(intCat);
    String strFin = "";
    dlgPrmRslt.txtPrmRslt.setText("");
    lstRslts.clear();
    for (i = 1, p = intValInit; i <= intCount; p++)
      {
      b = p + 2;
      c = p + 4;
      d = p + 6;
      String strOut = "";
      
      strFin = (i == intCount) ? ")" : "),  ";
      
      if (clsMath.isPrime(p) && clsMath.isPrime(b) && clsMath.isPrime(d))
        {
        strOut = "(" + p + ", " + b + ", " + d + strFin;
        Count++;
        out.println(strOut);
        DoTally(strOut);
        i++;
        }
      else if (clsMath.isPrime(p) && clsMath.isPrime(c) && clsMath.isPrime(d))
        {
        strOut = "(" + p + ", " + c + ", " + d + strFin;
        Count++;
        out.println(strOut);
        DoTally(strOut);
        i++;
        }
      }
    out.println("Total number of Triplet Primes: " + Count);
    ShowReport(strCat, Count);
    }
  
  
  public static void DoQuadrupletCalc(int intCount, int intCat, int intValInit)
    {
    int i, p, b, c, d, e;
    int Count = 0;
    String strCat = strSetCat(intCat);
    String strFin = "";
    dlgPrmRslt.txtPrmRslt.setText("");
    lstRslts.clear();
    for (i = 1, p = intValInit; i <= intCount; p++)
      {
      b = p + 2;
      c = p + 4;
      d = p + 6;
      e = p + 8;
      String strOut = "";
      strFin = (i == intCount) ? ")" : "),  ";
      
      if (clsMath.isPrime(p) && clsMath.isPrime(b) && clsMath.isPrime(d) && clsMath.isPrime(e))
        {
        Count++;
        strOut = "(" + p + ", " + b + ", " + d + ", " + e + strFin;
        out.println(strOut);
        DoTally(strOut);
        i++;
        }
      else if (clsMath.isPrime(p) && clsMath.isPrime(c) && clsMath.isPrime(d) && clsMath.isPrime(e))
        {
        Count++;
        strOut = "(" + p + ", " + c + ", " + d + ", " + e + strFin;
        out.println(strOut);
        DoTally(strOut);
        i++;
        }
        
      }
    out.println("Total number of Quadruplet Primes: " + Count);
    ShowReport(strCat, Count);
    }
  
  
  public static void DoQuintupletCalc(int intCount, int intCat, int intValInit)
    {
    int i, p, b, c, d, e, f;
    int Count = 0;
    String strCat = strSetCat(intCat);
    String strOut = "";
    String strFin = "";
    dlgPrmRslt.txtPrmRslt.setText("");
    lstRslts.clear();
    for (i = 1, p = intValInit; i <= intCount; p++)
      {
      b = p + 2;
      c = p + 6;
      d = p + 8;
      e = p + 12;
      f = p - 4;
      strFin = (i == intCount) ? ")" : "),  ";
      if (clsMath.isPrime(p) && clsMath.isPrime(b) && clsMath.isPrime(c) && clsMath.isPrime(d) && clsMath.isPrime(e))
        {
        Count++;
        strOut = "(" + p + ", " + b + ", " + c + ", " + d + ", " + e + strFin;
        out.println(strOut);
        DoTally(strOut);
        i++;
        }
      else if (clsMath.isPrime(f) && clsMath.isPrime(p) && clsMath.isPrime(b) && clsMath.isPrime(c) && clsMath.isPrime(d))
        {
        Count++;
        strOut = "(" + f + ", " + p + ", " + b + ", " + c + ", " + d + strFin;
        out.println(strOut);
        DoTally(strOut);
        i++;
        }
        
      }
    out.println("Total number of Quintuplet Primes: " + Count);
    ShowReport(strCat, Count);
    }
  
  public static void DoSextupletCalc(int intCount, int intCat, int intValInit)
    {
    int i, p, b, c, d, e, f;
    int Count = 0;
    String strCat = strSetCat(intCat);
    String strFin = "";
    dlgPrmRslt.txtPrmRslt.setText("");
    lstRslts.clear();
    for (i = 1, p = intValInit; i <= intCount; p++)
      {
      b = p + 2;
      c = p + 6;
      d = p + 8;
      e = p + 12;
      f = p - 4;
      strFin = (i == intCount) ? ")" : "),  ";
     if (clsMath.isPrime(f) && clsMath.isPrime(p) && clsMath.isPrime(b) &&
        clsMath.isPrime(c) && clsMath.isPrime(d) && clsMath.isPrime(e))
        {
        Count++;
        String strP = String.valueOf(p);
        String strB = String.valueOf(b);
        String strC = String.valueOf(c);
        String strD = String.valueOf(d);
        String strE = String.valueOf(e);
        String strF = String.valueOf(f);
        String strOut = "(" + strF + ", " + strP + ", " + strB + ", " + strC + ", " + strD + ", " + strE + strFin;
        out.println(strOut);
        DoTally(strOut);
        i++;
        }
        
      }
    out.println("Total number of Sextuplet Primes: " + Count);
    ShowReport(strCat, Count);
    }
  
  
  public static void DoCunninghamCalc(int intCount, int intCat, int intValInit)
    {
    int i, p, b, c;
    int Count = 0;
    String strFin = "";
    String strOut = "";
    String strCat = strSetCat(intCat);
    dlgPrmRslt.txtPrmRslt.setText("");
    lstRslts.clear();
    
    for (i = 1, p = intValInit; i <= intCount; p++)
      {
      b = (2 * p) + 1;
      c = (2 * p) - 1;
      strFin = (i == intCount) ? ")" : "),  ";

      String strP = String.valueOf(p);
      String strB = String.valueOf(b);
      String strC = String.valueOf(c);
      
      
      if (clsMath.isPrime(p) && clsMath.isPrime(b))
        {
        Count++;
        strOut = "(" + strP + ", " + strB + strFin;
        out.println(strOut);
        DoTally(strOut);
        i++;
        }
      if (clsMath.isPrime(p) && clsMath.isPrime(c))
        {
        Count++;
        strOut = "(" + strP + ", " + strC + strFin;
        out.println(strOut);
        DoTally(strOut);
        i++;
        }
      }
    out.println("Total number of Cunningham Chain Primes: " + Count);
    ShowReport(strCat, Count);
    }
  
  public static void DoSafeCalc(int intCount, int intCat, int intValInit)
    {
    int i, p, b;
    int Count = 0;
    String strCat = strSetCat(intCat);
    String strFin = "";
    String strOut = "";
    dlgPrmRslt.txtPrmRslt.setText("");
    for (i = 1, p = intValInit; i <= intCount; p++)
      {
      b = (p - 1) / 2;
      strFin = (i == intCount) ? ")" : "),  ";
      String strP = String.valueOf(p);
      String strB = String.valueOf(b);
      if (clsMath.isPrime(p) && clsMath.isPrime(b))
        {
        Count++;
        strOut = "(" + strP + ", " + strB + strFin;
        DoTally(strOut);
        out.println(strOut);
        i++;
        }
      }
    out.println("Total number of Safe Primes: " + Count);
    ShowReport(strCat, Count);
    }
  
  
  public static void DoBalancedCalc(int intCount, int intCat, int intValInit)
    {
    
    int intCnt = intCount;
    int i = 0;
    int j = 0;
    int k;
    int p;
    int intPrev;
    int intNext;
    String strCat = strSetCat(intCat);
    String strOut = "";
    String strFin = "";
    dlgPrmRslt.txtPrmRslt.setText("");
    lstRslts.clear();
    
    for (k = 2; i < intCnt; k++)
      {
      p = k;
      strFin = (i == intCnt - 1) ? ")" : "),  ";
      if (clsMath.isPrime(p))
        {
        // Find Next Prime
        intNext = GetBalNxt(p);
        if (!clsMath.isPrime(intNext))
          {
          continue;
          }
        //  Find Previous Prime
        intPrev = GetBalPrv(p);
        if (!clsMath.isPrime(intPrev))
          {
          continue;
          }
        if (intNext - p != p - intPrev)
          {
          continue;
          }
        String strPrev = String.valueOf(intPrev);
        String strNext = String.valueOf(intNext);
        String strP = String.valueOf(p);
        strOut = "(" + strPrev + ", " + strP + ", " + strNext + strFin;

        DoTally(strOut);
        out.println(strOut);
        i++;
        }
      }   //  END  for(k = 0, intPrev = 0, intNext = 0
    int Count = i;
    out.println("Total number of Balanced Primes: " + i);
    ShowReport(strCat, Count);
    }     //  END  DoBalancedCalc
  
  
  private static int GetBalNxt(int intIn)
    {
    int p = intIn;       // intIn is already identified as a Prime
    int j;
    
    for (j = p + 1; ; j++)
      {
      if (!clsMath.isPrime(j))
        {
        continue;
        }
      return j;
      }
    }
  
  
  private static int GetBalPrv(int intIn)
    {
    int p = intIn;       // intIn is already identified as a Prime
    int j;
    //int i;
    
    for (j = p - 1; ; j--)
      {
      if (!clsMath.isPrime(j))
        {
        continue;
        }
      return j;
      }
    }
  
  public static void GetReqPrimesCalc(int intCnt, int intCat, int intValInit)
    {
    int i;
    int p;
    String strCat = strSetCat(intCat);
    dlgPrmRslt.txtPrmRslt.setText("");
    lstRslts.clear();
    
    for (i = 0, p = intValInit; i < intCnt; p++)
      {
      if (clsMath.isPrime(p))
        {
        if (i == intCnt - 1)
          {
          String strP = String.valueOf(p);
          out.println(strP);
          DoTally(strP);
          }
        else
          {
          String strP = String.valueOf(p) + ", ";
          out.println(strP);
          DoTally(strP);
          }
        i++;
        }
      }
    out.printf("Total number of Primes: %d%n", i);
    ShowReport(strCat, i);
    }
  }

  

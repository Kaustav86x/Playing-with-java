class Test_case_2
{
  int i;
  int Fact_fun(int n)   
  {
    int res = 1;
    for(i=1; i<=n; i++)
    {
      res *= i;
    }
    return res;
  }
  public static void main(String args[])
  {
     Test_case_2 obj = new Test_case_2(); 
     System.out.println(obj.Fact_fun(5));
  }
}
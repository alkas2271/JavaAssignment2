package package2;
import java.util.Scanner;
public class Bank
{
private Double RateOfInterset=1.2;
private String Pname="Alka Singh";
private int accountno=50100235;
private int salary=32000;
public Bank()
{}
public Bank(double RateOfInterset, String Pname,int account_no,int salary)
{
this.RateOfInterset=RateOfInterset;
this.Pname=Pname;
this.accountno=account_no;
this.salary=salary;
}

public double RateOfInterset()
{
return RateOfInterset;
}

public String getName()
{
return Pname;
}

public void setName(String Pname)
{
this.Pname=Pname;
}

public int getAccountNo()
{
return accountno;
}

public void setAccountno(Integer accountno)
{
this.accountno=accountno;
}

public int getsalary()
{
return salary;
}

public void setsalary(int salary)
{
this.salary=salary;
}

}

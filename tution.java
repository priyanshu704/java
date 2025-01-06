class tution
{
public static void main(String args[])
{
float t=50000,inf=5,tfee=50000;
for(int i=1;i<=10;i++)
{
tfee=tfee+(inf/100)*t;
System.out.println("The fee after "+i+" year="+tfee);
}
}
}

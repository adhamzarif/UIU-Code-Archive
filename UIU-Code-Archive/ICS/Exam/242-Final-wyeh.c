#include<stdio.h>
int main()
{
    float amount;
    int choice,GB;

    printf("select the data package:\n");
    printf("1.Basic package\n");
    printf("2.Standard package\n");
    printf("3.premium package\n");
    printf("Enter your choice\n");
    scanf("%d",&choice);
    printf("Enter the number of GBs you want to use:\n");
    scanf("%d",&GB);

    if(choice==1)
    {
        amount=50*GB;
        printf("You selected the premium package.\nthe total charge for your package is:%.0f\n=",amount);

    }
    else  if(choice==2)
    {
        amount=100*GB;
        printf("You selected the premium package.\nthe total charge for your package is:%.0f\n=",amount);

    }
    else   if(choice==3)
    {
        amount=150*GB;
        printf("You selected the premium package.\nthe total charge for your package is:%.0f\n=",amount);

    }
    else
        printf("Invalid package type selected");
    return 0;
}

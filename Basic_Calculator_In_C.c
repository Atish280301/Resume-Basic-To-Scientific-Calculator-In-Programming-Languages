#include<stdio.h>
#include<conio.h>s
#include<windows.h>
#include<math.h>
int var;
void Integer_ArithMetic_Function() {
	printf("Welcome To Arithmetic Calculator\n");
	printf("=============================================================\nPress Enter For Operation. Press Esc For Go Back!!!\n");
	var = getch();
	if(var == 27) {
		system("Cls");
		first_page();
	} else if(var == 13) {
		int num1, num2, option;
		printf("=============================================================\n");
		printf("Enter Input1 Value : ");
		scanf("%d",&num1);
		printf("Enter Input2 Value : ");
		scanf("%d",&num2);
		printf("=============================================================\n");
		printf("Choose An Arithmetic Option : \n");
		printf("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\nOption: ");
		scanf("%d",&option);
		switch(option) {
			case 1:
				printf("Result: %d",(num1 + num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Integer_ArithMetic_Function();
				} else {
					system("Cls");
					first_page();
				}
				break;
			case 2:
				printf("Result: %d",(num1 - num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Integer_ArithMetic_Function();
				}
				if(getch() == 27) {
					system("Cls");
					first_page();
				} else {
					system("Cls");
					first_page();
				}
				break;
			case 3:
				printf("Result: %d",(num1 * num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Integer_ArithMetic_Function();
				} else {
					system("Cls");
					first_page();
				}
				break;
			case 4:
				printf("Result: %d",(num1 / num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Integer_ArithMetic_Function();
				} else {
					system("Cls");
					first_page();
				}
				break;
			case 5:
				printf("Result: %d",(num1 % num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Integer_ArithMetic_Function();
				} else {
					system("Cls");
					first_page();
				}
				break;
			default:
				printf("\nInvalid Option Selection!!!");
				Sleep(2000);
				system("Cls");
				Integer_ArithMetic_Function();
				break;
		}
	}
}
void Float_Arithmetic_Function() {
	printf("Welcome To Floating Calculator\n");
	printf("=============================================================\nPress Enter For Operation. Press Esc For Go Back!!!\n");
	var = getch();
	if(var == 27) {
		system("Cls");
		first_page();
	} else if(var == 13) {
		float num1, num2;
		int option;
		printf("=============================================================\n");
		printf("Enter Input1 Value : ");
		scanf("%f",&num1);
		printf("Enter Input2 Value : ");
		scanf("%f",&num2);
		printf("=============================================================\n");
		printf("Choose An Arithmetic Option : \n");
		printf("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\nOption: ");
		scanf("%d",&option);

		switch(option) {
			case 1:
				printf("Result: %f",(num1 + num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Float_Arithmetic_Function();
				} else {
					system("Cls");
					first_page();
				}
				break;
			case 2:
				printf("Result: %f",(num1 - num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Float_Arithmetic_Function();
				}
				if(getch() == 27) {
					system("Cls");
					first_page();
				} else {
					system("Cls");
					first_page();
				}
				break;
			case 3:
				printf("Result: %f",(num1 * num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Float_Arithmetic_Function();
				} else {
					system("Cls");
					first_page();
				}
				break;
			case 4:
				printf("Result: %f",(num1 / num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Float_Arithmetic_Function();
				} else {
					system("Cls");
					first_page();
				}
				break;
			case 5:
				printf("Result: %f",fmod(num1,num2));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Float_Arithmetic_Function();
				} else {
					system("Cls");
					first_page();
				}
				break;
			default:
				printf("\nInvalid Option Selection!!!");
				Sleep(2000);
				system("Cls");
				Float_Arithmetic_Function();
				break;
		}
	}
}
void Percentage_Calculation() {
	printf("Welcome To Percentage Calculator\n");
	printf("=============================================================\nPress Enter For Operation. Press Esc For Go Back!!!\n");
	var = getch();
	if(var == 27) {
		system("Cls");
		first_page();
	} else if(var == 13) {
		int opt1, val1, val2, val3;
		printf("1. Percentage Of A Single Value\n2. Percentage Between Two Value\n");
		printf("Choose Option : ");
		scanf("%d",&opt1);
		switch(opt1) {
			case 1:
				printf("=============================================================\n");
				printf("Percentage Of A Single Value : \n");
				printf("Enter A Value : ");
				scanf("%d",&val1);
				printf("\nOutput : %f",((float)val1 / 100));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Percentage_Calculation();
				} else {
					system("Cls");
					first_page();
				}
				break;
			case 2:
				printf("=============================================================\n");
				printf("Percentage Between Two Value : \n");
				printf("Enter First Input : ");
				scanf("%d",&val2);
				printf("Enter Second Value : ");
				scanf("%d",&val3);
				printf("\nOutput : %f",((float)val2 / 100 * val3));
				printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
				if(getch() == 13)	{
					system("Cls");
					Percentage_Calculation();
				} else {
					system("Cls");
					first_page();
				}
				break;
			default:
				printf("\nInvalid Option Selection!!!");
				Sleep(2000);
				system("Cls");
				Percentage_Calculation();
				break;
		}
	}
}
void Power_Function() {
	printf("Welcome To Power(A^n) Calculator\n");
	printf("=============================================================\nPress Enter For Operation. Press Esc For Go Back!!!\n");
	var = getch();
	if(var == 27) {
		system("Cls");
		first_page();
	} else if(var == 13) {
		printf("=============================================================\n");
		int base, exp;
		printf("Enter Base Value : ");
		scanf("%d", &base);
		printf("Enter Exponent Value : ");
		scanf("%d",&exp);
		double b = base, e = exp, result = pow(b,e);
		int res = (int)result;
		printf("Output : %d",res);
		printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
		if(getch() == 13)	{
			system("Cls");
			Power_Function();
		} else {
			system("Cls");
			first_page();
		}
	}
}
void Root_Function() {
	printf("Welcome To Root Of A Number Calculator\n");
	printf("=============================================================\nPress Enter For Operation. Press Esc For Go Back!!!\n");
	var = getch();
	if(var == 27) {
		system("Cls");
		first_page();
	} else if(var == 13) {
		printf("=============================================================\n");
		int base, root;
		printf("Enter Base Value : ");
		scanf("%d", &base);
		printf("Enter Root Value : ");
		scanf("%d",&root);
		double r = root;
		r = 1/r;
		printf("\nOutput : %lf",pow(base,r));
		printf("\n\nPress Enter Key To Reset, Press Esc To Go Back!!! ");
		if(getch() == 13)	{
			system("Cls");
			Root_Function();
		} else {
			system("Cls");
			first_page();
		}
	}
}
void Factorial_Function() {
	printf("Welcome To Factorial(A!) Of A Number Calculator\n");
	printf("=============================================================\nPress Enter For Operation, Press Esc For Go Back. \n");
	var = getch();
	if(var == 27) {
		system("Cls");
		first_page();
	} else if(var == 13) {
		printf("=============================================================\n");
		long num, count = 1;
		printf("Enter Input Value : ");
		scanf("%ld",&num);

		for(long i = 1; i <= num; i++) {
			count *= i;
		}
		printf("Output : %ld",count);
		printf("\n\nPress Enter Key To Reset, Press Esc To Go Back. ");
		if(getch() == 13)	{
			system("Cls");
			Factorial_Function();
		} else {
			system("Cls");
			first_page();
		}
	}
}
int first_page() {
	printf("Press Enter For Move Further. Press Esc for Go back To Main.\n=============================================================\n");
	var = getch();
	if(var == 13) {
		int option;
		printf("Enter The Option Value For Enter Into That Operation:\n");
		printf("1. Integer Arithmetic Operation\n2. Floating ArithmeticOperation\n3. Percentage Calculation\n4. Power Of A Number\n5. Root Of A Number\n6. Factorial Of A Number");
		printf("\n\nChoose An Option : ");
		scanf("%d",&option);
		switch(option) {
			case 1:
				system("Cls");
				Integer_ArithMetic_Function();
				break;
			case 2:
				system("Cls");
				Float_Arithmetic_Function();
				break;
			case 3:
				system("Cls");
				Percentage_Calculation();
				break;
			case 4:
				system("Cls");
				Power_Function();
				break;
			case 5:
				system("Cls");
				Root_Function();
				break;
			case 6:
				system("Cls");
				Factorial_Function();
				break;
			default:
				printf("\nInvalid Option!");
				Sleep(2000);
				system("Cls");
				first_page();
				break;
		}
	}
	if(var == 27) {
		system("cls");
		main();
	}
}
int main() {
	printf("Welcome To Basic Calculator Project In C Programming Language");
	printf("\n=============================================================\n");
	printf("Created By: Atish Kumar Sahu\nStart Date: 19 - July - 2023\nEnd Date: 20 - July - 2023\n");
	printf("=============================================================\n");
	printf("Press Enter To Go Next Page!!!");
	var = getch();
	if(var != 13) {
		system("Cls");
		main();
	} else {
		system("Cls");
		first_page();
	}
	getch();
}
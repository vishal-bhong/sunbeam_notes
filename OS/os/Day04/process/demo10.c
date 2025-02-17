#include<stdio.h>
#include<unistd.h>

void fun1(void)
{
	int num = 5;
	for(int i = 1 ; i <= 10 ; i++){
		printf("fun1 (5) : %d\n", i * num);
		sleep(1);
	}
}

void fun2(void)
{
	int num = 6;
	for(int i = 1 ; i <= 10 ; i++){
		printf("fun2 (5) : %d\n", i * num);
		sleep(1);
	}
}

void fun3(void)
{
	int num = 7;
	for(int i = 1 ; i <= 10 ; i++){
		printf("fun3 (5) : %d\n", i * num);
		sleep(1);
	}
}

int main(void)
{
	fun1();
	fun2();
	fun3();

	return 0;
}




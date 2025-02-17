#include<stdio.h>
#include<unistd.h>
#include<pthread.h>

void *fun1(void *ptr)
{
	int num = 5;
	for(int i = 1 ; i <= 10 ; i++){
		printf("fun1 (5) : %d\n", i * num);
		sleep(1);
	}
}

void *fun2(void *ptr)
{
	int num = 6;
	for(int i = 1 ; i <= 10 ; i++){
		printf("fun2 (5) : %d\n", i * num);
		sleep(1);
	}
}

void *fun3(void *ptr)
{
	int num = 7;
	for(int i = 1 ; i <= 10 ; i++){
		printf("fun3 (5) : %d\n", i * num);
		sleep(1);
	}
}

int main(void)
{
	pthread_t t1, t2, t3;

	printf("Creating Threads \n");
	pthread_create(&t1, NULL, fun1, NULL);
	pthread_create(&t2, NULL, fun2, NULL);
	pthread_create(&t3, NULL, fun3, NULL);

	printf("Treads are created\n");
	pthread_join(t1, NULL);
	pthread_join(t2, NULL);
	pthread_join(t3, NULL);
	printf("Main thread is completed\n");
	return 0;
}




#include<stdio.h>
#include<unistd.h>

int main(void)
{
	int ret;
	ret = fork();
	if(ret == 0)
	{
		printf("child : pid = %d, ppid = %d\n", getpid(), getppid());
		for(int i = 0 ; i < 15 ; i++)
		{
			printf("child : i = %d\n", i);
			sleep(1);
		}
	}
	else
	{
		printf("parent : pid = %d, ppid = %d\n", getpid(), getppid());
		for(int i = 15 ; i > 0 ; i--)
		{
			printf("parent : i = %d\n", i);
			sleep(1);
		}
	}
	return 0;
}

